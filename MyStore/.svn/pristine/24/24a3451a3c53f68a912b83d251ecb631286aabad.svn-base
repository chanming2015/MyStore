<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib tagdir="/WEB-INF/tags/user" prefix="my"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>爱商城</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="shortcut icon" href="" type="image/x-icon" />
<link href="/${projectName}/css/user/style.css" type="text/css"
	rel="stylesheet" />
<link rel="stylesheet" href="/${projectName}/css/user/goodsShow.css" />
<link rel="stylesheet" type="text/css"
	href="/${projectName }/css/user/bootstrap.css" />
<script type="text/javascript"
	src="/${projectName}/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript"
	src="/${projectName}/js/user/bootstrap.js"></script>
<script type="text/javascript">
	/*图片边框*/
	$(function() {
		$(".border_animation").mouseenter(function() {
			$(this).addClass("hover");
		});
		$(".border_animation").mouseleave(function() {
			$(this).removeClass("hover");
		});
	});
</script>

</head>

<body>
	<my:toptag></my:toptag>
	<div style="margin-top:185px;">
		<c:if test="${pageBean.dataList.size()==0}">
			<div class="page-search" bx-name="page-search">
				<div class="con-wrap">
					<div class="search-filter-list" trace="sntrace">
						<div class="search-filter-group filter-group-top clearfix">
							<div class="filter-group-right">
								<div class="group-right-inner  clearfix">
									<div class="tags-wrap clearfix">
										<span style="color: #aaaaaa;font-size: 12px;">/找找其他商品吧：</span>
										<a href="#">衣服</a> <a href="#">裤子</a> <a href="#">鞋子</a> <a
											href="#">办公</a> <a href="#">户外</a> <a href="#">体育</a> <a
											href="#">零食</a> <a href="#">耗材</a> <a href="#">数码</a> <a
											href="#">家电</a> <a href="#">通讯</a> <a href="#">电脑</a> <a
											href="#">宠物</a> <a href="#">女人专用</a> <a href="#">内衣</a> <a
											href="#">内裤</a>
									</div>
									<div class="pingpai">
										<ul>
											<li><span class="test">品牌：</span>
											</li>
										</ul>

									</div>
								</div>
							</div>
							<div class="filter-group-left ">
								<ul>
									<li><span class="lab">商品颜色：</span>
									</li>
								</ul>

							</div>
							<div class="filter-group-left">
								<ul>
									<li><span class="lab">商品尺寸：</span>
									</li>

								</ul>

							</div>
							<div class="filter-group-rigth">
								<ul>
									<li><span class="lab">商品价格：</span>
									</li>
								</ul>

							</div>
						</div>
					</div>
				</div>
			</div>
			<div>
				<div
					style="padding-bottom: 20px;min-height: 600px;width: 1190px;margin:auto;">
					<div style="margin: 0;padding: 0;width:1190px;">
						<div>
							<h4 style="color:#8B8B8B"></h4>
						</div>
						<div style="height:600px;">
							<div
								style="height:250px;background-color: #fff;border: 1px solid #ffffff;height:100%">
								<img
									style="float:left;margin-top: 100px;padding-left: 220px;width:150px;height:160px"
									src="/${projectName}/img/user/ym.jpg" />
								<h2
									style="float:right;line-height: 300px;padding-right: 320px;color:#f40;">对不起！没有找到你要找的宝贝^_^</h2>
							</div>
						</div>
					</div>
				</div>
			</div>
		</c:if>


		<c:if test="${pageBean.dataList.size()!=0}">
			<div class="page-search" bx-name="page-search">
				<div class="con-wrap">
					<!--当前筛选条件-->
					<!--筛选词列表-->
					<div class="search-filter-list" trace="sntrace">
						<div class="search-filter-group filter-group-top clearfix">
							<div class="filter-group-right">
								<div class="group-right-inner  clearfix">
									<div class="tags-wrap clearfix">
										<span style="color: #aaaaaa;font-size: 12px;">相关搜索：</span>

									</div>
									<div class="pingpai">
										<ul>
											<li><span class="test">品牌：</span>
											</li>
											<li><a href="#">雕牌</a></li>
											<li><a href="#">超人</a></li>
											<li><a href="#">耐克</a></li>
											<li><a href="#">双星</a></li>
											<li><a href="#">阿迪达斯</a></li>
											<li><a href="#">花花公子</a></li>
											

										</ul>
										<span class="genduo">更多</span>
										<div class="duoxuankuang">
											<span class="duoxuan">多选</span>
										</div>
									</div>
								</div>
							</div>
							<div class="filter-group-left ">
								<ul>
									<li><span class="lab">商品颜色：</span>
									</li>

									<li><a href="#">黄色</a></li>
								</ul>
								<span class="genduo">更多</span>
								<div class="duoxuankuang">
									<span class="duoxuan">多选</span>
								</div>
							</div>
							<div class="filter-group-left">
								<ul>
									<li><span class="lab">商品尺寸：</span>
									</li>
									<li><a href="#">M</a></li>
									
								</ul>
								<span class="genduo">更多</span>
								<div class="duoxuankuang">
									<span class="duoxuan">多选</span>
								</div>
							</div>
							<div class="filter-group-rigth">
								<ul>
									<li><span class="lab">商品价格：</span>
									</li>
									<li><a href="#">0-99</a></li>
									<li><a href="#">100-199</a></li>

									<li><a href="#">200-499</a>
									</li>
									<li><a href="#">500-999</a></li>
									<li><a href="#">1000-9999</a></li>

									<li><a href="#">1万以上</a></li>
								</ul>

							</div>
						</div>
					</div>
				</div>
				<div class="waterfall-bg">
					<div class="con-wrap">
						<!--筛选工具条：过滤工具-->
						<div class="search-filter-bar clearfix filter-bar-tools">
							<div class="bar-group">
								<!-- <div class="nav nav-tabs sn-list" id="j-sn-list"> -->
								<div id="j-sn-ceiling" class="w-spec-nav clearfix">
									<ul id="j-sn-list" class="nav nav-tabs sn-list">
										<li role="presentation"><a href="#j-info-all"
											class="spec-nav-current" data-toggle="tab"
											data-rel-content="all" mon="element=所有商品"><span>综合排序</span>
										</a>
										</li>
										<li role="presentation"><a href="#j-info-intro"
											data-toggle="tab" data-rel-content="intro" mon="element=销量"><span>销量</span>
										</a>
										</li>
										<li role="presentation"><a href="#j-info-ugc"
											data-toggle="tab" data-rel-content="ugc"
											class="spec-nav-last" mon="element=价格"><span>价格</span> </a></li>
									</ul>
								</div>
							</div>
							<div class="bar-group clearfix price-bar">
								<span class="price-input" id="J_priceInput"> <input
									type="text" class="txt" placeholder="￥" /><span class="">-</span><input
									type="text" class="txt" placeholder="￥" />
								</span> <span class="price-submit clearfix" id="J_priceSubmit"><input
									type="button" value="查询" class="price-btn" index="1">
								</span>
							</div>
							<div class="kbai"></div>
						</div>
					</div>
				</div>
				<form action="UserGoodsServlet" name="goodsList">
				<div class="tab-conten">
					<div class="tab-pane" id="j-info-all" role="tabpanel">
						<div style="width: 1190px;">
							<div style="margin-left: 10px;margin-right: 10px;">
								
									<c:if test="${cateId>0}">
										<input type="hidden" name="op" value="showlist" />
										<input type="hidden" name="cateId" value="${cateId }" />
									</c:if>
									<c:if test="${keyWord!=null}">
										<input type="hidden" name="op" value="search" />
										<input type="hidden" name="keyWord" value="${keyWord }" />
									</c:if>
									<c:forEach items="${pageBean.dataList}" var="goodsIamgeList">
										<div class="border_animation">
											<div class="border_top"></div>
											<div class="border_right"></div>
											<div class="border_bottom"></div>
											<div class="border_left"></div>
											<div class="width" style="height:220px;float:top">
												<a href="UserGoodsServlet?op=showinfo&goodsId=${goodsIamgeList.goods.gId}">
													<c:if test="${goodsIamgeList.imagePathList.size()>0 }">
														<img width="220" height="220" alt="" src="/${projectName}/img/user/${goodsIamgeList.imagePathList.get(0)}"/>
													</c:if>
													<c:if test="${goodsIamgeList.imagePathList.size()==0 }">
														<img width="220" height="220" alt="" src="/${projectName}/img/user/div1.jpg"/>
													</c:if>
												 </a>
											</div>
											<div class="width" style="height:60px;float:bottom;">
												<label style="font: 700 18px Verdana,Arial;"><font
													color="#f40">￥${goodsIamgeList.goods.gMoney }</font>
												</label><br />
												<h3 class="zt">
													<a href="UserGoodsServlet?op=showinfo&goodsId=${goodsIamgeList.goods.gId}"
														class="spm biaoqian"> ${goodsIamgeList.goods.gName}</a>
												</h3>
											</div>
										</div>
									</c:forEach>
									<br/>
							</div>
						</div>
					</div>
				</div>
				</form>
			</div>
			<div class="fenye"><my:page form="goodsList" pageBean="${pageBean}"></my:page></div>
			<div style="width: 100%;height: 1px;background: #e5e5e5;"></div>
		</c:if>

	</div>

	<my:bottomtag></my:bottomtag>
</body>
</html>
