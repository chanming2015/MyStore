<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'addnewcategory.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="/${projectName}/js/jquery-1.7.2.js"></script>
<link rel="stylesheet" type="text/css" href="/${projectName}/css/admin/main.css">
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
				<div class="main_a">
					<h3>添加新类别</h3>
					<hr />
					<form class="form1" action="LoginedCategoryServlet?op=addnewCategory" method="post">
						<table align="center">
							<tr>
								<td>请输入类别名称：</td>
								<td><input type="text" name="cName" placeholder="请输入类别名称" />
								</td>
							</tr>
							<tr>
								<td style="text-align:right;">所属上级类别：</td>
								<td><select name="cRoot" id="cRoot"><c:forEach items="${categorylist }" var="category">
									<c:if test="${category.cRoot==0 }">
										<option value="${category.cId}">${category.cName }</option>
									</c:if>
								</c:forEach></select>
								</td>
							</tr>
							<tr>
								<td>请输入类别简介：</td>
								<td><textarea name="cAbout"></textarea>
								</td>
							</tr>
							<tr>
								<td style="text-align:right;"><input type="reset">
								</td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit">
								</td>
								<td></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
		<my:bottomtag></my:bottomtag>
	</div>
</body>
</html>
