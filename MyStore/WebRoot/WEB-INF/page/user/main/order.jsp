<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/user" prefix="my"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
<script type="text/javascript">

	$(document).ready(function(){		
			var sheng=$("#sheng")[0];
			//填充省下拉框
			sheng.add( new Option("--请选择省--", -1) );
			<c:forEach items="${provinceList}" var="sheng">			
					var opts = new Option( '${sheng.xZname}', ${sheng.xCode});
					sheng.add(opts); 
			</c:forEach>
			
			//构建城市数组
			var cityArr = [];
			<c:forEach items="${cityList}" var="city">
					cityArr.push(
						{
							yCode: ${city.yCode},
							yName: '${city.yName}',
							xProvince: ${city.xProvince.xCode}
						}
					);
			</c:forEach>
			
			//构建地区数组
			var areaArr = [];
			<c:forEach items="${areaList}" var="area">
					areaArr.push(
						{
							zCode: ${area.zCode},
							zName: '${area.zName}',
							yCity: ${area.yCity.yCode}
						}
					);
			</c:forEach>
			
			//填充城市下拉框方法
			function fillCity() {
				var sheng = $("#sheng").val();	//得到省的ID
				var shi = $("#shi")[0];
				shi.length = 0;
					
				shi.add( new Option("--请选择市--", -1) );
					
				for (var i=0; i<cityArr.length; i++) {
					if (sheng==cityArr[i].xProvince) {
						var opt = new Option( cityArr[i].yName, cityArr[i].yCode );
						shi.add(opt);
					}
				} 		
			}
			//填充地区下拉框方法
			function fillArea() {
				var shi = $("#shi").val();	//得到省的ID
				var qu = $("#qu")[0];
				qu.length = 0;
					
				qu.add( new Option("--请选择区--", -1) );
					
				for (var i=0; i<areaArr.length; i++) {
					if (shi==areaArr[i].yCity) {
						var opt = new Option( areaArr[i].zName, areaArr[i].zCode );
						qu.add(opt);
					}
				} 		
			}
			
			sheng.onchange = fillCity;
			fillCity(); 
			shi.onchange = fillArea;
			fillArea();
			
			
						
			/*检查收货人姓名*/
			function checkshouhuoren(){
			 
				var shouhuoren = $("#shouhuoren").val();
			    var shouhuorentd = $("#shouhuorentd");
		        if (shouhuoren.trim() == "") {
		        $("#shouhuoren").val("");
		            shouhuorentd.css({
		                "color": "red"
		            });
		            shouhuorentd.text("请输入收货真实姓名！");
		            return false;
		        }
		        else {
		            shouhuorentd.text("");
		            return true;
		        }		
			}
			function checkxiangxidiqu(){
				var xiangxidiqu = $("#xiangxidiqu").val();
		        var xiangxidiqutd = $("#xiangxidiqutd");
		        if (xiangxidiqu.trim() == "") {
		        $("#xiangxidiqu").val("");
		            xiangxidiqutd.css({
		                "color": "red"
		            });
		            xiangxidiqutd.text("请输入收货地址！");
		            return false;
		        }
		        else {
		            xiangxidiqutd.text("");
		            return true;
		        }
			}
			function checkshouji(){
				var shouji = $("#shouji").val();
		        var shoujitd = $("#shoujitd");
		        if (shouji.trim() == "") {
		        $("#shouji").val("");
		            shoujitd.css({
		                "color": "red"
		            });
		            shoujitd.text("请输入收货人电话！");
		            return false;
		        }
		        if (isNaN(shouji.trim())) {
		        $("#shouji").val("");
		            shoujitd.css({
		                "color": "red"
		            });
		            shoujitd.text("请输入正确的收货人电话！");
		            return false;
		        }
		        else {
		            shoujitd.text("");
		            return true;
		        }	      
			}
			function checksheng(){
				var sheng = $("#sheng").find("option:checked").text();
				//.alert(sheng);
		        var shengtd = $("#shengtd");
		        if (sheng.trim() == ""||sheng.trim()=="--请选择省--") {
		            shengtd.css({
		                "color": "red"
		            });
		            shengtd.text("请选择省份！");
		            return false;
		        }
		        else {
		            shoujitd.text("");
		            return true;
		        }
		    }
	        function checkshi(){
				var shi = $("#shi").find("option:checked").text();
		        var shengtd = $("#shengtd");
		        if (shi.trim() == ""||shi.trim()=="--请选择市--") {
		            shengtd.css({
		                "color": "red"
		            });
		            shengtd.text("请选择县市！");
		            return false;
		        }
		        else {
		            shengtd.text("");
		            return true;
		        }
		    }
	        function checkqu(){
				var qu = $("#qu").find("option:checked").text();
		        var shengtd = $("#shengtd");
		        if (qu.trim() == ""||qu.trim()=="--请选择区--") {
		            shengtd.css({
		                "color": "red"
		            });
		            shengtd.text("请选择所在地区！");
		            return false;
		        }
		        else {
		            shengtd.text("");
		            return true;
		        }
	        }
			$("#shouhuoren").blur(checkshouhuoren);
			/*检查收货地址*/
			$("#xiangxidiqu").blur(checkxiangxidiqu);
			/*检查收货人电话*/
			$("#shouji").blur(checkshouji);
			$("#sheng").blur(checksheng);
			$("#shi").blur(checkshi);
			$("#qu").blur(checkqu);
			
			
			$("#tijiao").click(function(){
			
				if($("#shouhuoren").val().trim()==""){
					checkshouhuoren();
					$("#shouhuoren").focus();
					return false;
				}
				if($("#sheng").val().trim()==-1){
					checksheng();					
					$("#sheng").focus();
					return false;
				}
				if($("#shi").val().trim()==-1){
					checkshi();
					$("#shi").focus();
					return false;
				}
				if($("#qu").val().trim()==-1){
					checkqu();
					$("#qu").focus();
					return false;
				}
				if($("#xiangxidiqu").val().trim()==""){
					checkxiangxidiqu();			
					$("#xiangxidiqu").focus();
					return false;
				}
				if($("#shouji").val().trim()==""||isNaN($("#shouji").val().trim())){
					checkshouji();
					$("#shouji").focus();
					return false;
				}
			//	alert($("#sheng").val());
			
				$("#checkform").submit();
			});	
	});		
			

</script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<div style="margin-top: 185px;">
		<my:toptag></my:toptag>
		<!-- cart主体-->
		<div
			style="margin-top:30px; width: 1190px;height: 150px;margin: 0 auto;">
			<div style="margin-top:30px;" id="logo">


				<span style="color: #aaaaaa;margin-left:300px;">1.我的购物车 >>>></span>
				<span style="color: #f40;">2.填写核对订单信息 >>>></span> <span
					style="color: #aaaaaa;">3.成功提交订单 </span>

			</div>
		</div>
		<form id="checkform"action="/${projectName}/UserLogined/LoginedOrderServlet?op=addtoorder" method="post" >
			<div style=" width: 1190px;margin: 0 auto;min-height:500px;">

				<div style="border:2px solid #f40;float:top;">

					<h4 style="padding-left: 20px;"><font color="#f40">收货人信息</font>(带<font color="#f40">*</font>必填,请填写能让你收到货物的正确信息)</h4>
					
					<div style="padding-left: 50px;padding-top: 1px;">
						<font color="#f40">*</font>收货人 <input
							id="shouhuoren" name="shouhuoren" style="height:30px;" type="text" /><b id="shouhuorentd"></b>
					</div>
					<div style="padding-left: 36px;padding-top: 15px;">
						<font color="#f40">*</font>所在地区 <select id="sheng"class="diqu" name="sheng">
							
						</select> <select id="shi"class="diqu1" name="shi">
							
						</select> <select id="qu"class="diqu1" name="qu">
							
						</select><b id="shengtd"></b>
					</div>
					<div style="padding-left: 36px;padding-top: 15px;">
						<font color="#f40">*</font>详细地址 <input
							id="xiangxidiqu" name="xiangxidiqu" style="height:30px;width:400px;" type="text" /><b id="xiangxidiqutd"></b>
					</div>
					<div style="padding-left: 34px;padding-top: 15px;">
						<font color="#f40">*</font>手机号码 <input id="shouji" name="shouji" style="height:30px;"
							type="text" /><b id="shoujitd"></b>
					</div>
					<div
						style="padding-left: 74px;padding-top: 15px;margin-bottom: 20px;">
						邮编 <input style="height:30px;" type="text" name="post" />
					</div>

				</div>



				<div >
					<hr color="#f40" />
					<div style="margin: 0;padding: 0;width:1190px;">

						<table style="width:1190px;border-collapse:collapse; "
							cellpadding="0" cellspacing="0 " id="tab">
							<thead>
								<tr
									style="background-color: #eee;height:35px;border: 1px solid #CCCCCC;">
									<th style="width:30%;padding:0px;">宝贝</th>
									<th style="width:20%;padding:0px;">单价</th>
									<th style="width:10%;padding:0px;">数量</th>
									<th style="width:20%;padding:0px;">合计</th>
									<th style="width:20%;padding:0px;">状态</th>
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
												src="/${projectName}/img/user/div7.jpg" />
										</div>
										<div
											style="float:right;width:236px;height:120px;word-wrap:break-word;">
											<p>${good.getGoods().gName }</p>
											<input type="hidden" name="goodsId" value="${good.getGoods().gId}"/>
											<p>商品编号：${good.getGoods().gId}</p>
										</div></td>
									<td><span class="price">价格：${good.getGoods().gMoney}</span>
									</td>
									<td>										
										${good.pNum }
									<td colspan="2"><p>
											总价：<label class="total"><fmt:formatNumber value="${good.getGoods().gMoney *	good.pNum }" pattern="#.00" type="number"/></label>
											<input type="hidden" name="total" value="${good.getGoods().gMoney *	good.pNum }"/>
										</p>
									</td>
									
								</tr>
								<tr style="height: 5px;background-color: #fff;">
									<td colspan="5"></td>
								</tr>

							</c:forEach>

							<tr>
								<td colspan="5"><span
									style="margin-left:950px;line-height:40px;">合计：<label style="color: #f40"
										id="totalPrice"><fmt:formatNumber value="${totalPrice}" pattern="#.00" type="number"/></label>
								</span>
								</td>
							</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div><input id="tijiao" style="float:right;margin-top:-35px;"class="order-btn" type="button" value="付款"/></div>
			</div>
		</form>
		<my:bottomtag></my:bottomtag>
	</div>
</body>
</html>
