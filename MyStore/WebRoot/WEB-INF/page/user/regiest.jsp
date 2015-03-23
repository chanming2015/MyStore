<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/user" prefix="my" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

        <title>注册-个人用户</title>
        <script type="text/javascript" src="/${projectName}/js/jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="/${projectName}/js/jquery.validate.js"></script>
        <script type="text/javascript" src="/${projectName}/js/user/register.js"></script>
        <link type="text/css" rel="stylesheet" href="/${projectName}/css/user/regest.css"/>
        <link type="text/css" rel="stylesheet" href="/${projectName}/css/user/style.css"/>
   	 	<script type="text/javascript" src="/${projectName}/js/user/main.js"></script>

    </head>
    <body>
		<my:toptag></my:toptag>
    	<div style="margin-top: 185px;">
        <div id="registDiv">
             <div class="registTitleDiv">
                 <label>我已经注册，现在就&nbsp;<a href="login.jsp" class="flk13 biaoqian">登录</a></label>
             </div>
            <div id="registFormDiv">
                <form id="personRegForm" method="POST" action="UserInfoServlet?op=register">
                	
                	<table class="table">
                	<tr><td colspan="2" class="botteotd" style="font-size:12px;color:#AAAAAA;">带
                		<b class="xing" style="font-size:16px;" >*</b>的选项是必填选项</td></tr>
                	<tr class="dryiv"></tr>
                	<tr class="trDiv">
	                	<td class="title"><b class="xing">*</b>用户名：</td>
	                	<td><input class="inputDiv" type="text" id="uName" name="uName" placeholder="请输入用户名" maxlength="20"></td>
                	</tr >
                	<tr class="dryiv"></tr>
                	<tr>
                		<td class="title"><b class="xing">*</b>密码：</td>
                		<td><input class="inputDiv" type="password" id="uPassword" name="uPassword" placeholder="请输入密码" maxlength="20"></td>
                	</tr>
                	<tr class="dryiv"></tr>
                	<tr>
                		<td class="title"><b class="xing">*</b>确认密码：</td>
                		<td><input class="inputDiv" type="password" id="pwdRepeat" name="pwdRepeat" placeholder="请再次密码" maxlength="20"></td>
                	</tr>
                	<tr class="dryiv"></tr>
                	<tr>
                		<td class="title"><b class="xing">*</b>性别：</td>
                		<td><input type="radio" id="uSex1" name="uSex" checked="checked" value="男"/>男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" id="uSex" name="uSex" value="女"/>女</td>
                	</tr>
                	<tr class="dryiv"></tr>
                	<tr>
                		<td class="title"><b class="xing">*</b>邮箱：</td>
                		<td><input class="inputDiv" type="text" id="uEmail" name="uEmail" maxlength="20" ></td>
                	</tr>
                	<tr class="dryiv"></tr>
                	<tr>
                		<td class="title">密保问题：</td>
                		<td><select class="inputDiv" id="uSafeQuestion" name="uSafeQuestion" maxlength="20" >
                               		<option value="您父亲的生日？">您父亲的生日？</option>
                               		<option value="您母亲的生日？">您母亲的生日？</option>
                               		<option value="您配偶的生日？">您配偶的生日？</option>
                               		<option id="">您父亲的姓名？</option>
                               		<option id="">您母亲的姓名？</option>
                               		<option id="">您配偶的姓名？</option>
                               		<option id="">您的学号？</option>
                               		<option id="">您的工号？</option>
                               		<option id="">您高中班主任的名字？</option>
                               		<option id="">您初中班主任的名字？</option>
                               		<option id="">您小学班主任的名字？</option>
                            </select>
                        </td>
                	</tr>
                	<tr class="dryiv"></tr>
                	<tr>
                		<td class="title">密保答案：</td>
                		<td><input class="inputDiv" type="text" id="uSafeAnswer" name="uSafeAnswer" maxlength="20"></td>
                	</tr>
                	
                	<tr class="dryiv"></tr>
                	<tr>
                		<td class="title"><b class="xing">*</b>真实姓名：</td>
                		<td><input class="inputDiv" type="text" id="uRealName" name="uRealName" maxlength="20" ></td>
                	</tr>
                	
                	<tr class="dryiv"></tr>
                	<tr>
                		<td class="title"><b class="xing">*</b>身份证：</td>
                		<td><input class="inputDiv" type="text" id="uIdCard" name="uIdCard" maxlength="20" ></td>
                	</tr>
                	<tr class="dryiv"></tr>
                	<tr>
                		<td colspan="2" class="botteotd"> <input type="checkbox" checked="checked" id="readme"> 我已阅读并同意
                			<a href="#" id="protocol">《商城用户注册协议》</a>
                		</td>
                	</tr>
                	<tr class="dryiv"></tr>
                	<tr>
                	<td colspan="2" class="botteotd">请接受服务条款
                	</td>
                	</tr>
                	<tr class="dryiv"></tr>
                	<tr>
                	<td>
                	<td colspan="2"><input class="tdbutton" type="submit" id="registsubmit" value="立即注册"/>
                	</tr>
                	<tr class="dryiv"></tr>
                	</table>
                </form>
            </div>
        </div>
        
        <my:bottomtag></my:bottomtag>
        </div>
     </body>
   </html>

                	