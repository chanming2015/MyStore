<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'showuserinfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<link rel="stylesheet" type="text/css"
	href="/${projectName}/css/admin/main.css">
<script type="text/javascript" src="/${projectName}/js/jquery-1.11.1.min.js"></script>
</head>

<body>
	<div class="whole">
		<input type="hidden" value="${projectName}" id="projectName">
		<my:toptag></my:toptag>
		<div style="width:1024px; height:618px;">
			<div class="left">
				<my:lefttag></my:lefttag>
			</div>
			<div class="right">
				<div class="main_b">
					<h3>系统管理员列表</h3>
					<hr />
					<form name="userinfo" action="">
					<input type="hidden" name="op" value="showadmininfo"/>
					<div class="search" style="margin-left:602px;">
						<input type="text" placeholder="用户名" style="width:165px;" name="keyWord"/><input
							type="submit" value="搜索" />
					</div>
					
						<table cellpadding=0; cellspacing=0; border=1px;>
						<tr>
							<th>用户名</th>
							<th>密码</th>
							<th>性别</th>
							<th>邮箱</th>
							<th>真实姓名</th>
							<th>身份证</th>
						</tr>
						
						
						<c:forEach items="${pageBean.dataList}" var="user">
							<tr>
								<td>${user.uName}</td>
								<td>${user.uPassword}</td>
								<td>${user.uSex}</td>
								<td>${user.uEmail}</td>
								<td>${user.uRealName}</td>
								<td>${user.uIdCard}</td>
								
							</tr>
						</c:forEach>
						
						</table>
						<my:page form="userinfo" pageBean="${PageBean}"></my:page>
					</form>
				</div>
			</div>
		</div>
		<my:bottomtag></my:bottomtag>
	</div>
</body>
</html>
