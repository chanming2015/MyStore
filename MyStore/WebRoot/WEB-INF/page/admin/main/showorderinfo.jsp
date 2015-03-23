<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'showorderinfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css"
	href="/${projectName}/css/admin/main.css">

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
					<h3>${orderId }号订单详情</h3>
					<hr />
					<table cellpadding=0; cellspacing=0; border=1px;>
						<tr>
							<td>商品名称</td>
							<td>购买数量</td>
						</tr>
						<c:forEach items="${infoOrderGoodsList }" var="info">
							<tr>
								<td>${info.goods.gName }</td>
								<td>${info.iNum }</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
		<my:bottomtag></my:bottomtag>
	</div>
</body>
</html>
