<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html >
<head>
<base href="/vote/">
<meta charset="utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="js/login.js"></script>
</head>
<body>
<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="login" class="wrap">
	<div class="main">
		<div class="corner"></div>
		<div class="introduce">
			<h2>源辰信息</h2>
			<p>网上调查系统...</p>
		</div>
		<div class="login">
			<h2>用户登录</h2>
			<form method="post" action="users/login" >
				<dl id="loginBox">
					<dt>用户名：</dt>
					<dd><input type="text" class="input-text" name="vuUsername"  value="admin" required="required"/></dd>
					<dt>密　码：</dt>
					<dd><input type="password" class="input-text" name="vuPassword"  value="a" required="required"/></dd>
					<dt></dt>
					<dd><button class="input-button" >登录</button>
					<a href="users/register">新用户注册</a></dd>
				</dl>
			</form>
			<div class="error">${logErrorMsg }</div>
		</div>
	</div>
</div>
<div class="wrap">
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>
