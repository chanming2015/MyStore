<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'reply.jsp' starting page</title>

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
					<h3>已有评论、回复的商品</h3>
					<hr />
					<form name="discuss" action="">
					<input type="hidden" name="op" value="showreply"/>
					<div class="time_search">
						<span>
						 <input type="text" placeholder="商品编号或商品名称" style="width:165px;" />
						 <input type="button" value="搜索" />
						</span>
					</div>
					<table cellpadding=0; cellspacing=0; border=1px;>
						<tr>
							<th>商品编号</th>
							<th>商品名称</th>
							<th>评论条数</th>
							<th>待审核条数</th>
							<th>操作</th>
							
							<c:forEach items="${pageBean.dataList}" var="dis">
							<tr>
								<td>${dis.goodsId}</td>
								<td>${dis.uName}</td>
								<td>${dis.disCount}</td>
								<td>${dis.dshCount}</td>
								<td><a href="LoginedReplyServlet?op=toreply&dGId=${dis.goodsId}">查看评论或回复</a></td>
							</tr>
						</c:forEach>
						</tr>
					</table>
					<my:page form="discuss" pageBean="${PageBean }"></my:page>
					</form>
				</div>
			</div>
		</div>
		<my:bottomtag></my:bottomtag>
	</div>

</body>
</html>
