<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'adminlogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="/${projectName}/css/admin/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/${projectName}/css/admin/main.css">
	
	<style type="text/css">
html,body {
	height: 100%;
}
.box {
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#ADD1D1', endColorstr='#ADD1D1'); /*  IE */
	background-image:linear-gradient(bottom, #ADD1D1 0%, #ADD1D1 100%);
	background-image:-o-linear-gradient(bottom, #ADD1D1 0%, #ADD1D1 100%);
	background-image:-moz-linear-gradient(bottom, #ADD1D1 0%, #ADD1D1 100%);
	background-image:-webkit-linear-gradient(bottom, #ADD1D1 0%, #ADD1D1 100%);
	background-image:-ms-linear-gradient(bottom, #ADD1D1 0%, #ADD1D1 100%);
	
	margin: 0 auto;
	position: relative;
	width: 100%;
	height: 100%;
}
.login-box {
	width: 100%;
	max-width:500px;
	height: 400px;
	position: absolute;
	top: 50%;

	margin-top: -200px;
	/*设置负值，为要定位子盒子的一半高度*/
	
}
@media screen and (min-width:500px){
	.login-box {
		left: 50%;
		/*设置负值，为要定位子盒子的一半宽度*/
		margin-left: -250px;
	}
}	

.form {
	width: 100%;
	max-width:500px;
	height: 275px;
	margin: 25px auto 0px auto;
	padding-top: 0px;
}	
.login-content {
	height: 300px;
	width: 100%;
	max-width:500px;
	background-color: rgba(255, 250, 2550, .6);
	float: left;
}		
	
	
.input-group {
	margin: 0px 0px 30px 0px !important;
}
.form-control,
.input-group {
	height: 40px;
}

.form-group {
	margin-bottom: 0px !important;
}
.login-title {
	padding: 20px 10px;
	background-color: rgba(0, 0, 0, .6);
}
.login-title h1 {
	margin-top: 10px !important;
}
.login-title small {
	color: #fff;
}

.link p {
	line-height: 20px;
	margin-top: 30px;
}
.btn-sm {
	padding: 8px 24px !important;
	font-size: 16px !important;
}
</style>
        <script type="text/javascript" src="/${projectName}/js/jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="/${projectName}/js/admin/admin.js"></script>
        <script type="text/javascript">
            window.onload = function(){
              var a = document.getElementById("vertifyCodeSrc");
			  a.onclick = reloadVerifyCode;
			 
				}
			function reloadVerifyCode(){
				var timenow = new Date().getTime();
				document.getElementById("vertifyCodeSrc").src="ImageServlet?id="+timenow;
			}
	    </script>

  </head>
  
  <body>
        
        <div class="box">
		<div class="login-box">
			<div class="login-title text-center">
				<h1><small>MyStore后台管理登录</small></h1>
			</div>
			<div class="login-content ">
			<div class="form">
			<form action="UserInfoServlet?op=adminlogin" method="post">
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group" id="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
							<input type="text" id="username" name="uName" class="form-control" placeholder="用户名" >
						</div>
						<label id="usernameTd"></label>
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
							<input type="text" id="password" name="uPassword" class="form-control" placeholder="密码" >
						</div>
						<label id="passwordTd"></label>
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-xs-12  ">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
							<input id="vertifyCode" name="safeCode" type="text" class="form-control" style="width:327px;" placeholder="验证码"/>
							<img alt="验证码" id="vertifyCodeSrc" src="ImageServlet"	width="100" height="40" />
						</div>
					</div>
				</div>
				
				<div class="form-group form-actions">
					<div class="col-xs-4 col-xs-offset-4 " style="margin-top:-10px;">
						<button type="submit" class="btn btn-sm btn-info"><span class="glyphicon glyphicon-off"></span> 登录</button>
					</div>
				</div>
					
				</form>
				</div>
			</div>
		</div>
	</div>
  </body>
</html>
