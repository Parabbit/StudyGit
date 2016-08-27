package com.yc.vote.handler;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yc.vote.entity.User;
import com.yc.vote.services.UserService;

@Controller
@RequestMapping("/users")
public class UserHandler {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/active",method=RequestMethod.GET)
	public String active(String name){
		System.out.println("active register user...");
		return "register";
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String showregister(User user){
		System.out.println("show register");
		return "register";
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@Valid @ModelAttribute("user")User user,BindingResult bindingResult,ModelMap map,HttpServletRequest request){
		System.out.println("this is a test");
		if(bindingResult.hasFieldErrors()){
			map.put("regErrorMsg", "注册失败!!!");
			
			bindingResult.addError(new ObjectError("confirmPassword","密码不同..."));
			return "register";
		}
//		user.setVuPassword(Encrypt.md5AndSha(user.getVuPassword()));
		if(userService.register(user)){
			activeAccountMail("激活用户",
					getSendContent(request,user.getVuUsername()),
					"ywb802388@126.com",user.getVuEmail());
			return "login";
		}
		map.put("regErrorMsg", "注册失败!!!");
		return "register";
	}
	private String getSendContent(HttpServletRequest request, String username) {
		String activeURL=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+
				request.getContextPath()+"/user/active?username="+username;
		activeURL=String.format("<a href='%s' > %s </a> <br/><br/> 如果连续点击无效，请把此链接%s拷贝到地址栏激活", activeURL,"激活用户",activeURL);
		
		return activeURL;
	}
	@Autowired
	private JavaMailSender mailSender;
	private void activeAccountMail(String subject, String content, String from, String to) {
		try {
			MimeMessage mm=mailSender.createMimeMessage();
			MimeMessageHelper mmh=new MimeMessageHelper(mm, true,"UTF-8");
			mmh.setTo(to);//设置接收邮箱的人
			mmh.setFrom(from);
			mmh.setSubject(subject);//设置主题
			mmh.setText(content,true);//设置内容
			mailSender.send(mm);//发送邮件
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User user,ModelMap map){
		user=userService.login(user);
		if(user==null){
			map.put("logErrorMsg","用户名或密码错误!!!");
			return "login";
		}
		if(user.getVuVersion() == 0){
			map.put("logErrorMsg","用户名未激活!!!,请激活后再登录");
			return "login";
		}
		return "index";
	}
}
