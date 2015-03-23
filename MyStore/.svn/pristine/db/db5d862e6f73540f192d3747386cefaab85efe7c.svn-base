<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'showoneorderinfo.jsp' starting page</title>

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
				<div class="main_c">
					<h3>某某买家的订单详情</h3>
					<hr />
					<table align="center">
						<tr>
							<td>订单编号：</td>
							<td><input type="text" value="1" disabled="disabled" />
							</td>
						</tr>
						<tr>
							<td>买家姓名：</td>
							<td><input type="text" value="张三" disabled="disabled" />
							</td>
						</tr>
						<tr>
							<td>收货地址：</td>
							<td><input type="text" value="重庆市九龙坡" disabled="disabled" />
							</td>
						</tr>
						<tr>
							<td>联系方式：</td>
							<td><input type="text" value="15320570946"
								disabled="disabled" />
							</td>
						</tr>
						<tr>
							<td>订单状态：</td>
							<td><select style="width:175px;"><option>已付款</option>
									<option>未付款</option>
							</select>
							</td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" value="确定修改" disabled="disabled" />
							</td>
						</tr>
					</table>

					<div class="main_b">
						<table cellpadding=0; cellspacing=0; border=1px;>
							<tr style="text-align:center;">
								<th>商品名称</th>
								<th>单价</th>
								<th>购买数量</th>
								<th>小计</th>
							</tr>
							<tr style="text-align:center;">
								<td>哇哈哈</td>
								<td>5</td>
								<td>100</td>
								<td>500</td>
							</tr>
							<tr style="text-align:center;">
								<td>哇哈哈</td>
								<td>5</td>
								<td>100</td>
								<td>500</td>
							</tr>
							<tr style="text-align:center;">
								<td>哇哈哈</td>
								<td>5</td>
								<td>100</td>
								<td>500</td>
							</tr>
							<tr style="text-align:center;">
								<td>总计</td>
								<td colspan="3">1500</td>
							</tr>
						</table>
						<div style="margin-left:250px;padding-top: 10px;">
							<a href="javascript:jumpPage('first')">首页</a> <a
								href="javascript:jumpPage('prev')">上一页</a> <a
								href="javascript:jumpPage('next')">下一页</a> <a
								href="javascript:jumpPage('last')">尾页</a> 当前页码： 总记录数： <input
								style="text-align:center;border:none;border-bottom:1px solid black;"
								type="text" size="1" value="" id="goPage" /> <input
								type="button" id="goPageBtn" value="GO" />
						</div>
					</div>

				</div>
			</div>
		</div>
		<my:bottomtag></my:bottomtag>
	</div>
</body>
</html>
