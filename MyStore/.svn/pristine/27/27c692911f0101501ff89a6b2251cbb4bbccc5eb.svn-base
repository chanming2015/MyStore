<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'showreply.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="/${projectName}/css/admin/main.css">
	<script type="text/javascript" src="/${projectName}/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" >
	function passop(dId){
		$(function(){
			$("#op").val("passed");
			$("#dId").val(dId);
			$("form").submit();
		});
	}
	
	function nopassop(dId){
		$(function(){
			$("#op").val("nopassed");
			$("#dId").val(dId);
			$("form").submit();
		});
	}
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
					<h3 style="text-align:center;">${goods.gName }商品评论或回复</h3>
					<hr />
					
					<form action="LoginedReplyServlet" name="discuss" method="post">
					<input type="hidden" id="op" name="op" value="toreply"/>
					<input type="hidden" id="dGId" name="dGId" value="${dGId }">
					<input type="hidden" id="dId" name="dId">
					<c:forEach items="${pageBean.dataList}" var="dis" varStatus="i">
					<div style="border:1px solid A9CBEE; height:100px; width:800px; margin:0 auto;">
						<div
							style="float:left; border:1px solid black; width:200px; height:97px;">
							<span>评论者：${dis.userInfo.uName }</span>
						</div>

						<div style="height:20px; border:1px solid black; float:top; ">
							<span style="float:left">评论于:${dis.dTime }</span> <span
								style="float:right; color:red;">#${i.index+1 }</span>
						</div>

						<div style="height:75px;border:1px solid black;">
							<span>${dis.dBody }</span>
						</div>
						<div style="border:1px solid A9CBEE; height:75px;">
							<span style="float:left;"> </span> <span style="float:right;">
								<input type="text" name="rBody" placeholder="你想说的话" /> <a href="javascript:passop(${dis.dId });">通过审核</a> <a
								href="javascript:nopassop(${dis.dId });">拒绝通过审核</a> </span>
						</div>
					</div>
					<br /> <br />
					</c:forEach>
					<my:page form="discuss" pageBean="${PageBean }"></my:page>
					</form>
				</div>
			</div>
		</div>
		<my:bottomtag></my:bottomtag>
	</div>
</body>
</html>
