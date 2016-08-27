<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html >
<head>
<meta charset="utf-8" />
<title>管理投票</title>
<base href="/vote/">
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
<jsp:include page="top.jsp" />
<div id="vote" class="wrap">
	<h2>投票列表</h2>
	<ul class="list">
	
	<s:iterator value="subjects" status="status">
		<li  <s:if test="#status.isOdd()">class="odd" </s:if>>
			<h4>
				<em><a href="Subject!read.action?entityId=<s:property value='id'/>">维护</a></em>
				<a href="#"><s:property value="title"/></a>
			</h4>
			<p class="info">共有 <s:property value="options.size"/> 个选项，已有 <s:property value="votes[id]"/> 个网友参与了投票。</p>
		</li>
	</s:iterator>
	</ul>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>
