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
        <script src="/${projectName}/js/jquery-1.11.1.min.js"></script>
        <link href="/${projectName}/css/user/style.css" type="text/css" rel="stylesheet"/>
        <script type="text/javascript" src="#">
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
                        <a href="#">个人信息</a>
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
            <div class="fr rightb">
                <div class="bp">
                    <div class="usermain">
                        <div class="profile_info">
                        	<div role="tabpanel" class="tab-pane active" id="j-info-tag">
                           
                            	  <div class="userImg" >
                                    <label class="fLabel">我的头像：</label>
									<div class="bigImg">
										<img alt="头像" class="normal" src="/${projectName }/img/user/user.png"/>
									</div>
                                </div>
                                <div class="item">
                                    <label class="fl">
                                        用户名：
                                    </label>
                                    ${user.uName}
                                </div>
								 
                                <div class="item">
                                    <label class="fl">
                                        性别：
                                    </label>
                                    ${user.uSex}
                                </div>
                                <div class="item birthday">
                                    <label class="fl">
                                        邮箱：
                                    </label>
                                    ${user.uEmail}
                                </div>
                                <div class="item birthday">
                                    <label class="fl">
                                        真实姓名：
                                    </label>
                                    ${user.uRealName}
                                </div>
                                <div class="item birthday">
                                    <label class="fl">
                                        身份证：
                                    </label>
                                    ${user.uIdCard}
                                </div>
                            </div>
                        </div>
                      
                    </div>
                  </div>
                </div>
            </div>
        </div>
        <my:bottomtag></my:bottomtag>
    	</div>
    </body>
</html>



