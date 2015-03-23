<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'showorderlist.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css"	href="/${projectName}/css/admin/main.css">
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
					<h3>订单列表</h3>
					<hr />
					<form action="LoginedAdminOrderServlet" id="form_list" name="form_list">
						<input type="hidden" name="op" value="showlist"/>
						<div class="search" style="margin-left:595px;">
							<input type="text" placeholder="用户名" style="width:165px;" name="keyword" id="keyword"/>
							<input type="submit" value="搜索" id="searchbtn"/>
						</div>
						<table cellpadding=0; cellspacing=0; border=1px;>
							<tr>
								<th>订单编号</th>
								<th>用户名</th>
								<th>总价</th>
								<th>联系方式</th>
								<th>地址</th>
								<th>操作</th>
							</tr>
							<c:forEach items="${pageBean.dataList}" var="order">
								<tr>
								<td>${order.oId }</td>
								<td>${order.userInfo.uName }</td>
								<td>${order.oPrice}</td>
								<td>${order.oPhone }</td>
								<td>${order.oProvince.xZname}${order.oCity.yName}${order.oArea.zName}${order.oAddress }</td>
								<td><a href="/${projectName }/AdminLogined/LoginedAdminOrderServlet?op=showDetatil&orderId=${order.oId }">查看详情</a></td>
							</tr>
							</c:forEach>
						</table>
						<my:page form="form_list" pageBean="${pageBean }"></my:page>
					</form>
				</div>
			</div>
		</div>
		<my:bottomtag></my:bottomtag>
	</div>
  </body>
</html>
