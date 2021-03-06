
$().ready(function(){
	$("#userUpdat").validate({
		rules:{
			uPassword:{
				required:true,
				rangelength:[6,20]
			},
			uPassword1:{
				required:true,
				rangelength:[6,20],
				equalTo:"#uPassword"
			},
			uEmail:{
				required:true,
				email:true
			}
		},
		messages:{
			uPassword:{
				required:"请输入新密码",
				rangelength:"密码长度为6-20,可由字母、数字组成"
			},
			uPassword1:{
				required:"请确认新密码",
				rangelength:"密码长度为6-20,可由字母、数字组成",
				equalTo:"俩次输入的密码不一样，请重新输入"
			},
			uEmail:{
				required:"请输入邮箱",
				email:"请输入正确的邮箱地址。如123@qq.com"
			}
		}
		
	});
});

