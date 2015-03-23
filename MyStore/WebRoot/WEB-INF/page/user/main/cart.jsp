<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/user" prefix="my"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
<script type="text/javascript">
$(document).ready(function(){
	$(".min").click(function(){
   var t=$(this).parent().find('input[class=text_box]');
		if(isNaN(t.val())){
			t.val(1);	
		}	
		if(t.val()==1){
			return;
		}
		if(t.val()<1){
			t.val(1) ;
		}
		t.val(t.val()-1);
		t.blur(function(){
		if(isNaN(t.val()) || t.val()<1){
			t.val(1);
		}
	});
	var tCount = parseFloat(t.val());
	var priceText = $(this).parent('td').parent('tr').find('span[class=price]').text().substring(3);
	var price = parseFloat(priceText);
	var totalMinPrice = tCount * price;
	$(this).parent('td').parent('tr').find('label[class=total]').text(totalMinPrice.toFixed(2));
	var totalPrice = 0;
	 $("#tab tr").find('label[class=total]').each(function(){
	   totalPrice +=parseFloat($(this).text());
	});
	$("#totalPrice").html(totalPrice.toFixed(2));
	});

	$(".add").click(function(){
	var t=$(this).parent().find('input[class=text_box]');
		if(isNaN(t.val())){
			t.val(0);	
		}
		if(t.val()<1){
			t.val(0);
		}
		t.val(parseInt(t.val())+1);
		t.blur(function(){
		if(isNaN(t.val()) || t.val()<1){
			t.val(0);
		}	
	});
	var tCount = parseFloat(t.val());
	var priceText = $(this).parent('td').parent('tr').find('span[class=price]').text().substring(3);
	var price = parseFloat(priceText);
	var totalMinPrice = tCount * price;
	$(this).parent('td').parent('tr').find('label[class=total]').text(totalMinPrice.toFixed(2));
	var totalPrice = 0;
	 $("#tab tr").find('label[class=total]').each(function(){
	   totalPrice +=parseFloat($(this).text());
	});
	$("#totalPrice").html(totalPrice.toFixed(2));
	});
});


	
</script>
</head>

<body>
	<div style="margin-top: 185 ;">
		<my:toptag></my:toptag>
		<!-- cart主体-->
		<c:if test="${productList.size()==0}">
			<div style="padding-bottom: 20px;min-height: 600px;width: 1190px;margin:auto;">
				<div style="float:left;">
					<div style="padding-bottom: 20px;min-height: 600px;width: 1190px;margin:auto;">						
						<div style="margin: 0;padding: 0;width:1190px;">									
							<div><h4 style="color:#8B8B8B"></h4></div>
							<div style="height:600px;">
								<div style="height:250px;background-color: #fff;border: 1px solid #ffffff;height:100%">
									<img style="float:left;margin-top: 100px;padding-left: 220px;width:150px;height:160px"src="/${projectName}/img/user/ym.jpg" />
									<h2 style="float:right;line-height: 300px;padding-right: 420px;color:#f40;">对不起！你的购物车没有宝贝^_^</h2>												
								</div>							
							</div>								
						</div>
		            </div>		
				</div>
			</div>
		</c:if>
		<c:if test="${productList.size()!=0}">
		<div>
			<ul
				style="width: 600px;float:right;padding-top: 50px;overflow: hidden;height: 23px;margin-left:200px;margin-right: 600px;">
				<span style="color: #f40;">1.我的购物车 >>>></span>
				<span style="color: #aaaaaa;">2.填写核对订单信息 >>>></span>
				<span style="color: #aaaaaa;">3.成功提交订单 </span>
			</ul>
		</div>
		<div
			style="padding-bottom: 20px;min-height: 600px;width: 1190px;margin:auto;">
			<div style="height: 40px;">
				<h3 style="width: 100px;float: left;height:98%;color:#f40;">我的购物车</h3>

			</div>


			<!-- 商品展示区域-->
			<div style="margin: 0;padding: 0;width:1190px;">
				<hr
					style="height:5px;width:1190px;background-color:#f40;border-color: #f40;" />
				<form action="/${projectName}/UserLogined/LoginedCartServlet?op=updatecart" method="post">
					<table style="width:1190px;border-collapse:collapse; "
						cellpadding="0" cellspacing="0 " id="tab">
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

							<c:forEach items="${productList}" var="good">
								<tr style="height:35px;background-color: #fff;">
									<td colspan="5"></td>
								</tr>
								<tr class="bodertr">
									<td colspan="5"></td>
								</tr>
								<tr class="ordertd">
									<td><div style="width:120px;height:120px;float:left;">
											<img width="120px" height="120px"										
												src="/${projectName}/img/user/shangyi/sy10.1.jpg" />
										</div>
										<div
											style="float:right;width:236px;height:120px;word-wrap:break-word;">
											<p>${good.getGoods().gName }</p>
											<input type="hidden" name="goodsId" value="${good.getGoods().gId}"/>
											<p>商品编号：${good.getGoods().gId}</p>
										</div></td>
									<td><span class="price">价格：${good.getGoods().gMoney
											}</span>
									</td>
									<td><input class="min" name="" type="button" value="-" />
										<input class="text_box" name="num" type="text"
										value="${good.pNum }" /> <input class="add" name=""
										type="button" value="+" /></td>
									<td><p>
											总价：<label class="total">
											<fmt:formatNumber value="${good.getGoods().gMoney *
												good.pNum }" pattern="#.00" type="number"/>
											
											</label>
										</p>
									</td>
									<td><div style="width:100%;height:100%;">
											<a href="/${projectName}/UserLogined/LoginedCartServlet?op=deletegoods&goodsId=${good.getGoods().gId}"><input class="order-btn" type="button" id="deletecartgoods"
												value="删除" /></a><br />
											<hr style="border:none;" />
										</div></td>
								</tr>
								<tr class="baitr">
									<td colspan="5"></td>
								</tr>

							</c:forEach>

							<tr>
								<td colspan="5"><span
									style="margin-left:950px;line-height:40px;">合计：<label style="color: #f40"
										id="totalPrice"><fmt:formatNumber value="${totalPrice}" pattern="#.00" type="number"/></label>
								</span><input type="submit" style="float:right;" class="order-btn"value="去结算"/>
								</td>
							</tr>
						</tbody>
					</table>
				</form>
			</div>
		</div>
		</c:if>
		<my:bottomtag></my:bottomtag>
	</div>
</body>
</html>
