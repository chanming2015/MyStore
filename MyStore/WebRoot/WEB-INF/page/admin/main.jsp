<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="/${projectName}/css/admin/main.css">
	<link rel="stylesheet" type="text/css" href="/${projectName}/css/admin/main.css">
  </head>
  
  <body>
     <div class="whole">
     	<input type="hidden" value="${projectName}" id="projectName">
            <my:toptag></my:toptag>
            <div style="width:1024px; height:618px;">
            	<div class="left"><my:lefttag></my:lefttag></div>
                <div class="right">
                    <h1>欢迎访问MyStore后台管理系统！</h1>
                </div>
            </div>
            <my:bottomtag></my:bottomtag>
     </div>
  </body>
</html>
