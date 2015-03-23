<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'showcategoryinfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="/${projectName}/css/admin/main.css">
<script type="text/javascript" src="/${projectName}/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	var categoryArr = [];
	<c:forEach items="${categorylist}" var="cate">
		<c:if test="${cate.cRoot!=0}">
		categoryArr.push(
			{
			cId:${cate.cId}
			cName:${cate.cName}
			cRoot:${cate.cRoot}
			}
		);
		</c:if>
	</c:forEach>
</script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#cRoot").change(function(){
		var root = $("#cRoot").val();
		location.href="LoginedCategoryServlet?op=showCategoryList&cRoot="+root;
		});
	});
</script>
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
				
					<h3>商品类别列表</h3>
					<hr />
					<form name="category" action="">
					<div style="margin-left:510px;padding-bottom: 10px;">
						<select name="cRoot" id="cRoot"><c:forEach items="${categorylist }" var="category">
									<c:if test="${category.cRoot==0 }">
										<option value="${category.cId}">${category.cName }</option>
									</c:if>
								</c:forEach></select>
						<input type="text" placeholder="类别名称" style="width:165px;" name="keyWord"/><input
							type="submit" value="搜索" />
					</div>
					<input type="hidden" name="op" value="showCategoryList"/>
					<%-- <input type="hidden" name="cRoot" value="${cRoot }"> --%>
					<table cellpadding=0; cellspacing=0; border=1px;>
						 <tr>
							<th>类别编号</th>
							<th>类别名称</th>
							<th>类别简介</th>
							<th>上级类别</th>
							<th>操作</th>
						</tr>
						
						<c:forEach items="${pageBean.dataList}" var="cate">
							<tr>
								<td>${cate.cId}</td>
								<td>${cate.cName}</td>
								<td>${cate.cAbout}</td>
								<td><c:forEach items="${categorylist }" var="category"><c:if  test="${cate.cRoot ==category.cId}">${category.cName }</c:if></c:forEach></td>
								<td><a href="LoginedCategoryServlet?op=toupdateCategory&cId=${cate.cId }">编辑</a>&nbsp;&nbsp;
								<a onclick='return confirm("是否确认删除${cate.cName}?")'
								href="LoginedCategoryServlet?op=deleteCategory&cId=${cate.cId }">删除</a>
							</td>
							</tr>
							</c:forEach>
					</table>
					<my:page form="category" pageBean="${PageBean}"></my:page>
					</form>
				</div>
			</div>
		</div>
		<my:bottomtag></my:bottomtag>
	</div>
</body>
</html>
