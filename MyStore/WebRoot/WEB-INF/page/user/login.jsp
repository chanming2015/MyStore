ype<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<title>会员登录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="/${projectName}/css/user/style.css" />
<link rel="stylesheet" href="/${projectName}/css/user/login.css" />
<script src="/${projectName}/js/jquery-1.11.1.min.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
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
	<my:toptag></my:toptag>
	<div style="margin-top:185px">
		
	
		<form id="formlogin" method="post"  action="UserInfoServlet?op=userlogin">
			<input type="hidden" id="uuid" name="uuid"
				value="79eac7c0-f480-451c-a5e4-961dad71d6d4" />
			<div class=" w1" id="entry">
				<div class="extra-en">
					<b>登陆</b>
				</div>
				<div class="mc " id="bgDiv">
					<div id="entry-bg" clstag="passport|keycount|login|02">
						<img width="530px"height="367px"src="/${projectName}/img/user/kl.jpg" />
					</div>
					
					<div class="form ">
						<div class="item fore1">
							<span>用户名</span>
							<div class="item-ifo">
								<input type="text" id="uName" name="uName" placeholder="请输入用户名" class="text"
									tabindex="1" autocomplete="off" />
								<div class="i-name ico"></div>
							</div>
							<span id="loginname_succeed" class="blank invisible" ></span> <span
									id="loginname_error" class="hide"><b></b>
							</span>
						</div>

						<div id="capslock">
							<i></i><s></s>键盘大写锁定已打开，请注意大小写
						</div>
						
						<div class="item fore2">
							<div>密码</div>
							<div class="item-ifo">
								<label id="sloginpwd" style="display: none;"> </label> <input
									type="password" id="uPassword" placeholder="请输入密码" name="uPassword" class="text"
									tabindex="2" autocomplete="off" /> <input type="hidden"
									name="uPassword" id="uPassword" value="" class="hide" />

								<div class="i-pass ico"></div>
							</div>
								<span id="loginpwd_succeed" class="blank invisible"></span> <span
									id="loginpwd_error" class="hide"></span>
						</div>
						<input type="hidden" name="machineNet" id="machineNet" value=""
							class="hide" /> <input type="hidden" name="machineCpu"
							id="machineCpu" value="" class="hide" /> <input type="hidden"
							name="machineDisk" id="machineDisk" value="" class="hide" />

						<div class="item fore3  hide " id="o-authcode">
							<span>验证码</span>

							<div class="item-ifo">
								<input type="text" id="authcode" class="text text-1"
									name="safeCode" tabindex="6" style="ime-mode:disabled" /> <label
									class="img"> <img
									style="cursor:pointer;width:100px;height:33px;display:block;"
									id="vertifyCodeSrc" src="ImageServlet" ver_colorofnoisepoint="#888888"
									> </label> <label class="ftx23 hline">看不清？<a
									href="javascript:reloadVerifyCode()" class="flk13">换一张</a>
								</label> <label id="authcode_succeed" class="blank invisible"></label> <label
									id="authcode_error" class="hide"></label>
							</div>
						</div>
						<div class="item fore4" id="autoentry">
							<div class="item-ifo">
								<input type="checkbox" class="checkbox" name="chkRememberMe"
									clstag="passport|keycount|login|04" /> <label class="mar">自动登录</label>
								<div style="float:left;" id="ctrlDiv"></div>
								<label><a href="找回密码地址" class=""
									clstag="passport|keycount|login|05">忘记密码?</a>
								</label>
								<div class="clr"></div>
							</div>

						</div>
						<div class="item login-btn2013">
							<input type="submit" class="btn-img btn-entry" value="登录" tabindex="8" clstag="passport|keycount|login|06" />

						</div>
					</div>

				</div>
				<div class="free-regist">
					<span><a href="regiest.jsp">免费注册&gt;&gt;</a>
					</span>
				</div>
			</div>
		</form>
		<script type="text/javascript">
			$(function(){
				$("#uName").blur(function(){
					if($("#uName").val()==""){
						document.getElementById("loginname_succeed").style.visibility="hidden";
						var span=document.getElementById("loginname_error");
						span.style.color="red";
						span.style.height="30px";
						span.style.width="282px";
						span.style.background="#ffbdbf";
						span.innerHTML="用户名不能为空,请输入密码";
					}
					else if($("#uName").val().length < 4 || $("#uName").val().length >20){
						document.getElementById("loginname_succeed").style.visibility="hidden";
						var span=document.getElementById("loginname_error");
						span.style.color="red";
						span.style.height="30px";
						span.style.width="282px";
						span.style.background="#ffbdbf";
						span.innerHTML="用户名由4-20位字母、数字或字符组成";
					}else{
						var span=document.getElementById("loginname_error");
						document.getElementById("loginname_error").style.visibility="hidden";
						span.innerHTML="";
					}
				});
				$("#uPassword").blur(function(){
					if($("#uPassword").val()==""){
						document.getElementById("loginpwd_succeed").style.visibility="hidden";
						var span=document.getElementById("loginpwd_error");
						span.style.color="red";
						span.style.height="30px";
						span.style.width="282px";
						span.style.background="#ffbdbf";
						span.innerHTML="密码不能为空,请输入密码";
					}
					else if($("#uPassword").val().length<6 || $("#uPassword").val().length>20){
						document.getElementById("loginpwd_succeed").style.visibility="hidden";
						var span=document.getElementById("loginpwd_error");
						span.style.color="red";
						span.style.height="30px";
						span.style.width="282px";
						span.style.background="#ffbdbf";
						span.innerHTML="密码由6-20位字母、数字组成";
					}else{
						var span=document.getElementById("loginpwd_error");
						document.getElementById("loginpwd_error").style.visibility="hidden";
						span.innerHTML="";
					}
				});
			});
			
		</script>	
		<my:bottomtag></my:bottomtag>
	</div>
</body>
</html>
