<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'addnewuser.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

	<script type="text/javascript" src="/${projectName}/js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="/${projectName}/js/jquery.validate.js"></script>
    <script type="text/javascript" src="/${projectName}/js/user/register.js"></script> 
    <link rel="stylesheet" type="text/css" href="/${projectName}/css/admin/main.css" />


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

					<h3>添加新用户</h3>
					<hr />
					<form id="personRegForm" class="form1" action="LoginedadminServlet?op=addadmin" method="post">
						<table class="table">
							<tr>
								<td class="title">请输入用户名：</td>
								<td><input  type="text" id="uName" name="uName" placeholder="请输入用户名" maxlength="20"/>
								</td>
								
							</tr>
							<tr>
								<td class="title">请输入密码：</td>
								<td><input type="password" name="uPassword"
									placeholder="请输入密码" />
								</td>
							</tr>
							<tr>
								<td class="title">请选择性别：</td>
								<td class="radio"><label><input type="radio" id="uSex1" name="uSex" class="" value="男" checked="checked"/>男</label>&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="radio" id="uSex" name="uSex" class="" value="女"/>女</label></td>
							</tr>
							<tr>
								<td class="title" >请输入邮箱：</td>
								<td><input type="text" name="uEmail">
								</td>
							</tr>
							<tr>
								<td class="title">请选择密保问题：</td>
								<td><select name="uSafeQuestion">
										<option>您父亲的生日？</option>
                                  		<option>您母亲的生日？</option>
                                  		<option>您配偶的生日？</option>
                                  		<option>您父亲的姓名？</option>
                                  		<option>您母亲的姓名？</option>
                                  		<option>您配偶的姓名？</option>
                                  		<option>您的学号？</option>
                                  		<option>您的工号？</option>
                                  		<option>您高中班主任的名字？</option>
                                  		<option>您初中班主任的名字？</option>
                                  		<option>您小学班主任的名字？</option>
								</select></td>
							</tr>
							<tr>
								<td class="title">请输入答案：</td>
								<td><input type="text" name="uSafeAnswer">
								</td>
							</tr>

							<tr>
								<td class="title">请输入您的真实姓名：</td>
								<td><input type="text" name="uRealName">
								</td>
							</tr>

							<tr>
								<td class="title">请输入您的身份证：</td>
								<td><input type="text" name="uIdCard">
								</td>
							</tr>

							<tr>
								<td class="title"><input type="reset">
								</td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" id="registsubmit">
								</td>
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
