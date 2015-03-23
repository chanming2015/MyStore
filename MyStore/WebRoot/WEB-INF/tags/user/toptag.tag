<%@ tag pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
$(document).ready(function(){	
	$("#baobei a.menu_head").click(function()
    {
	     $("#dd").show("slow");
	});
	$("#d1").mouseover(function()
    {
	     $("#dd").hide();
	});
	$("#d2").mouseover(function()
    {
	     $("#dd").hide();
	});
	$("#dd").hover(function()
    {
	     $(this).show();

	},function()
    {
	     $(this).hide();
	}); 
	
});
 
</script>
<div class="top">
 <div class="top-top">
        <div style="width:1190px;margin:0 auto;height:100%;">
            <div class="top-left">
                <div >
                    <c:if test="${user.uName!=null }">
                    	<label class="biaoqian"style="color:#F40">${user.uName}</label></c:if><c:if test="${user.uName==null }"><a class="biaoqian"style="color:#F40" href="UserInfoServlet?op=usertologin" >您好，请登录！</a>
                    </c:if>
                    <c:if test="${user.uName!=null }">|  <a class="biaoqian"  href="/${projectName}/UserLogined/LoginedUserServlet?op=logout">注销</a></c:if>	
                        <c:if test="${user.uName==null }">|  <a class="biaoqian"  href="/${projectName}/UserInfoServlet?op=usertoregister" >免费注册</a>  </c:if> 
                    | <a class="biaoqian" href="/${projectName}/UserInfoServlet">返回首页</a>
                </div>     
            </div>
            <!--top-right-->
            <div class="top-right">  
           			 <div style="width:80px;height:35px;float:left;"><a id="d1"class="biaoqian"href="/${projectName}/UserLogined/LoginedUserServlet?op=showuserinfo">个人信息</a>| 
           			 </div> 
           			 <div id="baobei"style="width:80px;height:35px;float:left;">         
	                    <a class="biaoqian menu_head">我的宝贝 </a>|
						<div id="dd"class="menu_body"> 
							<a href="/${projectName}/UserLogined/LoginedOrderServlet?op=showOrderGoods&state=1">待付款</a>
							<a href="/${projectName}/UserLogined/LoginedOrderServlet?op=showOrderGoods&state=2">已付款</a> 
							<a href="/${projectName}/UserLogined/LoginedOrderServlet?op=showOrderGoods&state=3">待评价</a> 
						</div>						   
		             </div>                              
                   	 <div style="width:60px;height:35px;float:left;"><a id="d2"style="float:right;"class="biaoqian"href="/${projectName}/UserLogined/LoginedCartServlet?op=lookcart" >购物车</a>
					 </div>                                                           
            </div>
      </div>
        <!--scroll-top-->
    </div>
	
	 <!--top-main-->
	 <div style="width:100%;height:145px;background:#fff;border-bottom: 1px solid #e8e8e8;">
	    <div class="top-main">
	    	<!--logo-->
	        <img style="width:150px;height:140px"src="/${projectName}/img/user/logo2.png" />
	        <div class="search">
	            <div class="search-box">
	                <div class="baobei">宝贝 </div>

	                <form method="post" action="UserGoodsServlet?op=search">
	                	<input class="search-in" type="text" placeholder="    随便搜搜？∩__∩  你想要的应有尽有！！  ╰(￣▽￣)╯ " name="keyWord" id="keyWord">
		                <h2 style="width:95px;height:38px;float:right;margin-top:0px;"><input class="search-but"type="submit" value="搜索"/></h2>
	                </form>

	            </div>
	        </div>
			<div style="float: left;margin-left: 200px;margin-top: 20px">
				
				<img style="width:100px;height:100px;float:right" src="/${projectName}/img/user/liantu.png"/>
			</div>
	    </div>   
	</div>
</div>
