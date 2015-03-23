<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags/user" prefix="my"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>商品评价</title>
    
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
			$("#sub").click(function(){
				var body = $("#pingjiacontent").val();
				if(body==null){
					alert("请输入评价内容！");
					return false;
				}else{
					return true;
				}
			});
		});
	
	</script>
  </head>
  
  <body>
    <div style="margin-top: 185 ;">
		<my:toptag></my:toptag>
			<div>
				<div >
					<div style="width:950px;height:950px;margin: 0 auto;">
						<div style="height: 37px;float:top;background-color: #eee;">
							<div class="pjtop"><h3 >&nbsp;&nbsp;&nbsp;评价宝贝</h3></div>			
						</div>
						<form name="discuss" action="UserLogined/LoginedDiscussServlet?op=comments" method="post">
						<input type="hidden" name="goodsId"  value="${goods.gId }"/>
							<div style="height:600px;border: 1px solid #E0E9EF;">
								<div style="height:330px;border-bottom: 1px dashed #E0E9EF;">
									<div style="width:258px;height:241px;padding-left:80;padding-top:55px;float:left">
										<img width="180px" height="180px"src="/${projectName}/img/user/div7.jpg" />	<br/>
										${goods.gName }							
									</div>
									<div style="width:600px;float:right;height:330px;">
										<div style="margin-top: 60px;margin-left: 20px;width:544px;border: 4px solid #DAF1FC;">
											<textarea name="dBody" class="pjtextarea" id="pingjiacontent" onclick="this.value=''" placeholder="写点什么吧！！！对商品有什么意见？？"></textarea>
										</div>
									</div>
								</div>	
								<div style="float: left;width:300px;height:270px;">
									<h3 style="margin-left: 80px;margin-top: 100px;color:#999">商品评分</h3>
								</div>
								<div style="float: right;width:600px;height:270px">
									<div style="margin-left:40px;margin-top: 100px;">
										<input type="radio"id="pj1"name="pj" value="3" checked="checked" />好评<input style="margin-left: 30px;"type="radio"id="pj2"name="pj" value="2" />中评<input style="margin-left: 30px;"type="radio"id="pj3"name="pj" value="1"/>差评
										<br/>
										<input style="margin-top: 60px;" id="sub" type="submit" value="发表评论" class="order-btn" />
									</div>
								</div>			
							</div>	
						</form>				
					</div>
				</div>
			</div>
		<my:bottomtag></my:bottomtag>
	</div>
  </body>
</html>
