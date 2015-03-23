<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'updategoodsinfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css"	href="/${projectName}/css/admin/main.css">
	<script type="text/javascript" src="/${projectName}/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript">
		$(function(){
				//填充商品名称
				$("#goodsName").val('${goods.gName}');
				//获得大类别下拉框
				var bigCate=$("#bigCate")[0];
				//填充大类别下拉框
				bigCate.add( new Option("--全部--", 0) );
				<c:forEach items="${categoryList}" var="cate">
					<c:if test="${cate.cRoot==0}">
						var opts = new Option( '${cate.cName}', ${cate.cId});
						
						<c:if test="${root==cate.cId}">
							opts.selected = true;
						</c:if>
						bigCate.add(opts); 
					</c:if>
				</c:forEach>
				
				//创建小类别数组
				var categoryArr = [];
				<c:forEach items="${categoryList}" var="cate">
					<c:if test="${cate.cRoot>0}">
						categoryArr.push(
							{
								cateId: ${cate.cId},
								cateName: '${cate.cName}',
								pCateId: ${cate.cRoot}
							}
						);
					</c:if>
				</c:forEach>
				
				//填充小类的函数
				function fillCate() {
					var pCateId = ${root}	//得到大类的ID
					var cate = $("#smallCate")[0];
					cate.length = 0;
						
					cate.add( new Option("--全部--", -1) );
						
					for (var i=0; i<categoryArr.length; i++) {
						if (pCateId==categoryArr[i].pCateId) {
							var opt = new Option( categoryArr[i].cateName, categoryArr[i].cateId );
							if(categoryArr[i].cateId==${goods.cate.cId}){
								opt.selected = true;
							}
							cate.add(opt);
						}
					} 		
				}
				
				bigCate.onchange = fillCate;
				fillCate();	
				//填充单价
				$("#price").val('${goods.gMoney}');			
				//填充是否上架
				if(${goods.gBuy}){
					$("input[value='允许']").attr({checked:"checked"});
				}else {
					$("input[value='不允许']").attr({checked:"checked"});
				}
				//填充商品净重
				$("#weight").val('${goods.gWeight}');	
				//填充商品简介
				$("#goodsInfo").val('${goods.gBody}');	
		});	
	</script>
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
					<h3>修改商品信息</h3>
					<hr />
					<form id="form_update" name="form_update" method="post" action="LoginedAdminGoodsServlet?op=updategoodsinfo">
						<input type="hidden" name="goodsId" value="${goodsId }"/>
						<table align="center">
							<tr>
								<td id="t1">商品名称：</td>
								<td><input id="goodsName" name="goodsName" type="text"/>
								</td>
								<td id="goodsNameTd" color="red"></td>
							</tr>
							<tr>
								<td>商品类别：</td>
								<td><select id="bigCate" name="bigCate" style="width: 80px;">
								</select> <select id="smallCate" name="smallCate" style="width: 85px;">
								</select>
								</td>
								<td id="goodsCateTd" color="red"></td>
							</tr>
							<tr>
								<td>单价：</td>
								<td><input type="text" placeholder="元" name="price" id="price"/>
								</td>
								<td id="priceTd" color="red"></td>
							</tr>
							<tr>
								<td>是否上架：</td>
								<td class="radio">
								<input type="radio" name="buy" value="允许"/>允许
								<input type="radio" name="buy" value="不允许"/>不允许
								</td>
								<td></td>
							</tr>
							<tr>
								<td>商品净重：</td>
								<td><input type="text" placeholder="克" name="weight" id="weight"/>
								</td>
								<td id="weightTd" color="red"></td>
							</tr>
							<tr>
								<td>商品简介：</td>
								<td><textarea name="goodsInfo" id="goodsInfo"></textarea>
								</td>
								<td></td>
							</tr>
							<tr>
								<td></td>
								<td><a href="#">管理商品图片集</a>
								</td>
								<td></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="submit" value="修改" />
								</td>
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
