<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'goodsimages.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="/${projectName}/css/admin/main.css">
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
					<h3>商品图片管理</h3>
					<form action="">
						<input type="hidden" value="${goodsNum}"/>
						<table>
							<tr>
								<td>上传图片：</td>
								<td><input type="file" name="file" style="width:170px;" />
								</td>
								<td></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="submit" /></td>
								<td></td>
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
