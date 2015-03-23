 window.onload=function(){
 	document.getElementById("uName").onblur=Loginusername;
	document.getElementById("uPassword").onblur=Loginpwd;
	document.getElementById("loginsubmit").onclick=login;
 }
 	function Loginusername(){
		
		var name = document.getElementById("uName").value;
		if(name==""){
			document.getElementById('loginname_succeed').style.visibility="hidden";
			var span=document.getElementById("loginname_error");
			span.style.color="red";
			span.style.height="30px";
			span.style.width="282px";
			span.style.background="#ffbdbf";
			span.innerHTML="用户名不能为空";
		}else{
			var span=document.getElementById("loginname_error");
			document.getElementById('loginname_error').style.visibility="hidden"
			span.innerHTML="";
		}
	}
	function Loginpwd(){
		var pwd = document.getElementById("uPassword").value;
		if(pwd==""){
			document.getElementById('loginpwd_succeed').style.visibility='hidden'
			var span=document.getElementById("loginpwd_error");
			span.style.color="red";
			span.style.height="30px";
			span.style.width="282px";
			span.style.background="#ffbdbf";
			span.innerHTML="密码不能为空";
		}else{
			var span=document.getElementById("loginpwd_error");
			document.getElementById('loginpwd_error').style.visibility="hidden"
			span.innerHTML="";
		}
	}
	function login(){
		var name = document.getElementById("uNmae");
		var pwd = document.getElementById("uPassword")
		if(name==""&&pwd==""){
			document.getElementById('loginname_succeed').style.visibility="hidden";
			var span=document.getElementById("loginname_error");
			span.style.color="red";
			span.style.height="30px";
			span.style.width="282px";
			span.style.background="#ffbdbf";
			span.innerHTML="用户名不能为空";
			document.getElementById('loginpwd_succeed').style.visibility='hidden'
			var span=document.getElementById("loginpwd_error");
			span.style.color="red";
			span.style.height="30px";
			span.style.width="282px";
			span.style.background="#ffbdbf";
			span.innerHTML="密码不能为空";
		}
		else{
			var span=document.getElementById("loginname_error");
			document.getElementById('loginname_error').style.visibility="hidden"
			span.innerHTML="";
			var span=document.getElementById("loginpwd_error");
			document.getElementById('loginpwd_error').style.visibility="hidden"
			span.innerHTML="";
		}
	}

