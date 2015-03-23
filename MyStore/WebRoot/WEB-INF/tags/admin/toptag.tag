<%@ tag pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="top">
	<script type="text/javascript" src="/${projectName}/js/admin/admin.js"></script>
	<div class="top_right">
		<div class="top_right_2">
			<a href="#">返回首页</a> <img
				src="/${projectName}/img/admin/menu_seprator.gif" align="absMiddle" /><a
				href="/${projectName}/AdminLogined/LoginedadminServlet?op=logout">退出系统</a>
		</div>
	</div>
	<div class="top_2">
		欢迎 ${admin.uName} [系统管理员 ] 光临 <span><a
			href="javascript:history.go(-1);"><img
				src="/${projectName}/img/admin/nav_back.gif" align="absMiddle" />后退</a>
			<a href="javascript:history.go(1);"><img
				src="/${projectName}/img/admin/nav_forward.gif" align="absMiddle" />前进</a><a
			href="/${projectName}/AdminLogined/LoginedadminServlet?op=logout"><img
				src="/${projectName}/img/admin/nav_changePassword.gif"
				align="absMiddle" />重新登录</a><a
			href="/${projectName}/AdminLogined/LoginedadminServlet?op=toupdateadmin"><img
				src="/${projectName}/img/admin/nav_resetPassword.gif"
				align="absMiddle" />修改密码</a><a href="#"><img
				src="/${projectName}/img/admin/nav_help.gif" align="absMiddle" />帮助</a><img
			src="/${projectName}/img/admin/menu_seprator.gif" align="absMiddle" />
			<span id="clock" style="padding-top:8px;"></span> </span>
	</div>
</div>