<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/user" prefix="my" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" class="default">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>用户基本资料</title>
        <meta name="keywords" content="用户基本资料" />
        <meta name="description" content="" />
        <link type="image/x-icon" rel="shortcut icon" href="" media="screen"/>
        <link href="/${projectName}/css/user/userPonseDate.css" type="text/css" rel="stylesheet"/>
        <link href="/${projectName}/css/user/style.css" type="text/css" rel="stylesheet"/>
        <script type="text/javascript" src="/${projectName}/js/jquery-1.11.1.min.js"></script>
         <script type="text/javascript" src="/${projectName}/js/jquery.validate.js">
        </script>
        <script type="text/javascript" src="/${projectName}/js/user/userPosenData.js">
        </script>
    </head>
    <body>
    <div style="margin-top: 185px;"class="Allbody">
    <my:toptag></my:toptag>
        <div class="clear">
        </div>
     
        <div class="head_nav">
            <div class="head_nav_c area">
                <div class="fl nav_list">
                    <a class="fl " href="/${projectName }/">首页<i></i></a>
                    <a class="fl " href="#">服饰<i></i></a>
                    <a class="fl " href="#">办公用品<i></i></a>
                    <a class="fl " href="#">折扣商品<i></i></a>
                    <a class="fl " href="#">热卖商品<i></i></a>
                    <a class="fl " href="/${projectName}/UserLogined/LoginedCartServlet?op=lookcart">我的购物车<i></i></a>
                </div>
                
            </div>
        </div>

        <link href="" type="text/css" rel="stylesheet"/>

        <div class="area baockP">
            <div class="fl leftb">
                <dl>
                    <dt>
                        用户中心
                    </dt>
                    <dd role="presentotion">
                        <a href="/${projectName}/UserLogined/LoginedUserServlet?op=showuserinfo">个人信息</a>
                    </dd>
                    <dd role="presentotion">
                        <a href="/${projectName}/UserLogined/LoginedUserServlet?op=toupdateuser">修改密码</a>
                    </dd>
                 </dl> 
                 
                <dl>
                    <dt>
                        选购商品信息
                    </dt>
                    <dd>
                        <a href="/${projectName}/UserLogined/LoginedCartServlet?op=lookcart" >我的购物车</a>
                    </dd>
                </dl>
            </div>
            <div class="bigDiv" >
            	
            	<form id="userUpdat" method="post" action="LoginedUserServlet?op=modifyUpdate">
            		<table style="border: none;">
	            		<tr>
	            			<td class="timu">我的头像：
	            			</td>
	            			<td class="tex"><img src="/${projectName }/img/user/user.png"/></td>
	            		</tr> 
	            		<tr class="fenge"><td></td></tr>
	            		<tr>
	            			<td class="timu"> 用户名：</td>
	            			<td class="tex">${user.uName}</td>
	            		</tr>
	            		<tr class="fenge"><td></td></tr>
	            		<tr>
	            			<td class="timu"> 新密码：</td>
	            			<td class="tex"><input class="inputDiv" type="password" name="uPassword" id="uPassword"/></td>
	            		</tr>
	            		<tr class="fenge"><td></td></tr>
	            		<tr>
	            			<td class="timu">确认新密码：</td>
	            			<td class="tex"><input class="inputDiv" type="password" name="uPassword1" id="uPassword1"/></td>
	            		</tr>
	            		<tr class="fenge"><td></td></tr>
	            	
	            		
	            		<tr>
	            			<td colspan="2"><input type="submit" class="butten" value="保存"/></td>
	            		</tr>
	            		<tr class="fenge"><td></td></tr>
	            	</table>
            	</form>
            </div>
        </div>
        <my:bottomtag></my:bottomtag>
    	</div>
    	
    </body>
    
</html>



