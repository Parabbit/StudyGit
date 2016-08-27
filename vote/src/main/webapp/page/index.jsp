<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html >
<head>
<meta charset="utf-8" />
<base href="/vote/">
<title>投票列表</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="js/index.js"></script>
</head>
<body>
<jsp:include page="top.jsp" />
<div id="vote" class="wrap">
	<h2>投票列表</h2>
	<ul class="list" id="subjectList">
		<%-- <li  <c:if test="#status.isOdd()">class="odd" </c:if>>
			<h4>				
				<a href="Vote!view.action?entityId=<s:property value='id'/>"><s:property value="title"/></a>
			</h4>
			<div class="join"><a href="Vote.action?entityId=<s:property value='id'/>">我要参与</a></div>
			<p class="info">共有 <s:property value="options.size"/> 个选项，已有 <s:property value="votes[id]"/> 个网友参与了投票。</p>
		</li> --%>
	</ul>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>
