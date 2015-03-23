<%@ tag pageEncoding="UTF-8"%>

 <div class="left">
 	  <link rel="StyleSheet" href="/${projectName}/js/admin/dtree/dtree.css" type="text/css" />
      <script type="text/javascript" src="/${projectName}/js/admin/dtree/dtree.js"></script>
 	  <script type="text/javascript">
 	  				d = new dTree('d');
                    d.add(0, -1, '商城后台管理系统');
                    d.add(1, 0, '用户管理');
                    d.add(2, 0, '商品管理');
                    d.add(3, 0, '订单管理');
                    d.add(4, 1, '查询管理员信息', '/${projectName}/AdminLogined/LoginedadminServlet?op=showadmininfo', '查询管理员信息','');
					
                    d.add(5, 1, '添加管理员', '/${projectName}/AdminLogined/LoginedadminServlet?op=toaddadmin', '添加管理员','');
					
                    d.add(6, 1, '修改信息', '/${projectName}/AdminLogined/LoginedadminServlet?op=toupdateadmin', '修改信息','');
					
                    d.add(7, 2, '添加商品', '/${projectName}/AdminLogined/LoginedAdminGoodsServlet?op=goaddnewgoods', '添加商品','');
					
                    d.add(8, 2, '修改商品信息', '/${projectName}/AdminLogined/LoginedAdminGoodsServlet?op=showlist', '修改商品信息','');
					
                    d.add(9, 2, '商品下架', '/${projectName}/AdminLogined/LoginedAdminGoodsServlet?op=showlist', '商品下架','');
					
                    d.add(10, 3, '查看订单信息', '/${projectName}/AdminLogined/LoginedAdminOrderServlet?op=showlist', '查看订单信息','');
					
                    d.add(11, 2, '查询商品信息', '/${projectName}/AdminLogined/LoginedAdminGoodsServlet?op=showlist', '查询商品信息','');          
                    
					d.add(12, 0, '类别管理');
					d.add(13,12,'查看类别列表','/${projectName}/AdminLogined/LoginedCategoryServlet?op=showCategoryList&cRoot=1','查看类别列别','');
					d.add(14,12,'新增类别','/${projectName}/AdminLogined/LoginedCategoryServlet?op=toaddnewCategory','新增类别','');

					d.add(15, 0, '评论、回复管理');
					d.add(16,15,'查看评论、回复','/${projectName}/AdminLogined/LoginedReplyServlet?op=showreply','查看评论、回复','');
					
                    document.write(d); 
                    d.openAll();        
      </script>            
 </div>