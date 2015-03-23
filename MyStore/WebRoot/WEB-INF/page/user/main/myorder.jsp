<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags/user" prefix="my"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>购物车</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="/${projectName}/css/user/style.css" />
<script src="/${projectName}/js/jquery-1.11.1.min.js"></script>

<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<div style="margin-top: 185 ;">
		<my:toptag></my:toptag>
		<!-- cart主体-->
		<c:if test="${pageBean.dataList.size()==0}">
				<div >
					<div style="padding-bottom: 20px;min-height: 600px;width: 1190px;margin:0 auto;">						
						<div style="margin: 0;padding: 0;width:1190px;">									
							<div><h4 style="color:#8B8B8B"></h4></div>
							<div style="height:600px;">
								<div style="height:250px;background-color: #fff;border: 1px solid #ffffff;height:100%">
									<img style="float:left;margin-top: 100px;padding-left: 220px;width:150px;height:160px"src="/${projectName}/img/user/ym.jpg" />
									<h2 style="float:right;line-height: 300px;padding-right: 420px;color:#f40;">对不起！你没有找到你要的东西^_^</h2>												
								</div>							
							</div>								
						</div>
		            </div>		
				</div>
			</c:if>
		
		<c:if test="${pageBean.dataList.size()!=0 }">
		<div
			style="padding-bottom: 20px;min-height: 600px;width: 1190px;margin:auto;">
			<div style="height: 40px;">
				<h3 style="width: 100px;float: left;height:98%;color:#f40;">我的订单</h3>
			</div>
			<!-- 商品展示区域-->
			<div style="margin: 0;padding: 0;width:1190px;">
				<hr
					style="height:5px;width:1190px;background-color:#f40;border-color: #f40;" />
				<form action="UserLogined/LoginedOrderServlet"name="myorder" method="post">
					<input type="hidden" value="${state }">
					<input type="hidden" name="op" value="showOrderGoods"/>
					<table style="width:1190px;border-collapse:collapse; "
						cellpadding="0" cellspacing="0 ">
						<thead>
							<tr
								style="background-color: #eee;height:35px;border: 1px solid #CCCCCC;">
								<th style="width:30%;padding:0px;">宝贝</th>
								<th style="width:20%;padding:0px;">单价</th>
								<th style="width:10%;padding:0px;">数量</th>
								<th style="width:20%;padding:0px;">合计</th>
								<th style="width:20%;padding:0px;">操作</th>
							</tr>
						</thead>
	
						<tbody>
							<c:forEach items="${pageBean.dataList }" var="order">
								<tr style="height:35px;background-color: #fff;">
									<td colspan="5"></td>
								</tr>
								<c:forEach items="${order}" var="info" varStatus="s">
									<c:if test="${s.count==1}">
										<tr class="bodertr">
											<th>2014-1-4</th>
											<th>订单号：${info.orderUser.oId }</th>
											<th></th>
											<th></th>
											<th></th>
										</tr>
									</c:if>
									<tr class="ordertd">
										<td><div style="width:120px;height:120px;float:left;">
												<img width="120px" height="120px"
													src="/${projectName}/img/user/div7.jpg" />
											</div>
											<div
												style="float:right;width:236px;height:120px;word-wrap:break-word;">
												<p>${info.getGoods().gName }</p>
											</div>
										</td>
										<td>${info.getGoods().gMoney }</td>
										<td>${info.iNum }</td>
										<td>${info.getGoods().gMoney*info.iNum}</td>
									<c:if test="${state==1}">	<td><div style="width:100%;height:100%;">
												<input class="order-btn" type="button" id="deleteorder"
													value="付款" onclick=""/><br/>
													<hr style="border:none;"/>
													
											</div>
										</td>
									</c:if>
									<c:if test="${state==2}">	<td><div style="width:100%;height:100%;">
												
											</div>
										</td>
									</c:if>
									<c:if test="${state==3}">	<td><div style="width:100%;height:100%;">
												
													<input class="order-btn" type="button" id="pingjiagoods"
													value="评价" onclick="location='UserGoodsServlet?op=comments&goodsId=${info.goods.gId }' "/>
											</div>
										</td>
									</c:if>
									</tr>								
								</c:forEach>
								<tr class="baitr">
										<td colspan="5"></td>
									</tr>						
							</c:forEach>					
						</tbody>
					</table>
					<div style="margin-left: 330px;"><my:page form="myorder" pageBean="${pageBean}"></my:page></div>
				</form>		
			</div>
		</div>
		</c:if>
		<my:bottomtag></my:bottomtag>
	</div>
</body>
</html>
