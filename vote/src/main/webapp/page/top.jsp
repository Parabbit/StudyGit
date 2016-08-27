<%@ page  contentType="text/html; charset=utf-8"   pageEncoding="utf-8"%>

<base href="/vote/">
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="navbar" class="wrap">
	<div class="profile">
		您好，<label>${user.vuUsername }</label>
		<span class="return"><a href="#">返回列表</a></span>
		<span class="addnew"><a href="#">添加新投票</a></span>
		<span class="modify"><a href="#">维护</a></span>
	</div>
	<div class="search">
		<form method="post" action="">
			<input type="text" name="keywords" class="input-text" value=""/>
			<input type="submit" name="submit" class="input-button" value="" />
		</form>
	</div>
</div>
