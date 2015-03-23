<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/admin" prefix="my"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'showgoodslist.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css"	href="/${projectName}/css/admin/main.css">
<script type="text/javascript" src="/${projectName}/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	$(function(){
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
			var pCateId = bigCate.value;//得到大类的ID
			var cate = $("#smallCate")[0];
			cate.length = 0;
			cate.add( new Option("--全部--", 0) );
			for (var i=0; i<categoryArr.length; i++) {
				if (pCateId==categoryArr[i].pCateId) {
					var opt = new Option( categoryArr[i].cateName, categoryArr[i].cateId );
					if(categoryArr[i].cateId==${smallCate}){
						opt.selected = true;
					}
					cate.add(opt);
				}
			} 		
		}
		
		bigCate.onchange = fillCate;
		fillCate();		
			
		//改变小类别更换表格内容
		function contentChange() {
			//将类别ID传给AdminAdminGoodsServlet
			var cateId=$("#smallCate").val();
			if(cateId>0){
				$("#cateId").val(cateId);
				$("#form_list").submit();
			}
		}
		$("#smallCate").change(contentChange);
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
				<div class="main_b">
					<h3>商品列表</h3>
					<hr />
					<form action="LoginedAdminGoodsServlet" id="form_list" name="form_list">
						<input type="hidden" name="op" value="showlist"/>
						
						<div class="search" style="margin-left:420px;">
						<select id="bigCate" name="bigCate">
							</select>
							<select id="smallCate" name="smallCate">
							</select>
							<input type="text" placeholder="商品名称" style="width:165px;" name="keyword" id="keyword" value="${keyWord}"/>
							<input type="submit" value="搜索" id="searchbtn"/>
						</div>
						<table cellpadding=0; cellspacing=0; border=1px;">
							<tr>
								<th>商品名称</th>
								<th>类别</th>
								<th>单价</th>
								<th>是否允许购买（上架）</th>
								<th>上架时间</th>
								<th>操作</th>
							</tr>
							<c:forEach items="${pageBean.dataList}" var="goods">
								<tr>
								<td>${goods.gName }</td>
								<td>${goods.cate.cName }</td>
								<td>${goods.gMoney}</td>
								<td>${goods.gBuy==true?"是":"否" }</td>
								<td>${goods.gTime }</td>
								<td><a href="LoginedAdminGoodsServlet?op=goupdategoodsinfo&goodsId=${goods.gId}">编辑</a>&nbsp;&nbsp;
								    <c:if test="${goods.gBuy==true}"><a href="LoginedAdminGoodsServlet?op=deletegoods&goodsId=${goods.gId}">下架</a></c:if>
								    <c:if test="${goods.gBuy==false}"><a href="LoginedAdminGoodsServlet?op=salesgoods&goodsId=${goods.gId}">上架</a></c:if>&nbsp;&nbsp;
								    <a href="LoginedAdminGoodsServlet">修改库存</a>
								</td>
							</tr>
							</c:forEach>
						</table>
						<my:page form="form_list" pageBean="${pageBean }"></my:page>
					</form>
				</div>
			</div>
		</div>
		<my:bottomtag></my:bottomtag>
	</div>

</body>
</html>
