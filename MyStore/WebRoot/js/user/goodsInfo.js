//商品数量增减控制//

$(document).ready(function(){
	$(".jian").click(function(){
		if($("#num").val()==1){
			return;
		}
		if($("#num").val()<1){
			$("#num").val(1) ;
		}
		$("#num").val($("#num").val()-1);
		
			
	});

	$(".jia").click(function(){
		if($("#num").val()<1){
			
		}
		$("#num").val(parseInt($("#num").val())+1);
	});

});
//输入字母或者数字的时候，直接显示1//
 $(document).ready(function(){
 	$("#num").blur(function(){
		if(isNaN($("#num").val()) || $("#num").val()<1){
			$("#num").val(1);
		}
	});
 });

 //选择颜色和尺寸的JS//
 //尺寸
 $(document).ready(function(){
 	$(".yan-size").click(function(){
		$(".yanse:eq(0)").hide();
		var num = $(".yanse:eq(1):hidden").size();
		if(num >0) {
			$(".yanse:eq(1)").show();	
		} else {
			$(".yanse:eq(1)").hide();
		}
		
	});
 });
 //颜色
 $(document).ready(function(){
 	$(".yan-color").click(function(){
		$(".yanse:eq(1)").hide();
		var num = $(".yanse:eq(0):hidden").size();
		if(num >0) {
			$(".yanse:eq(0)").show();	
		} else {
			$(".yanse:eq(0)").hide(); 
		}
		
	});
 });
 
 //颜色确定按钮的显示与单选 
$(document).ready(function(){
	$(".y-li input").click(function(){
		if($(this).attr("checked")) {
			$(this).attr("checked", false);
			$(".y-btnOK:eq(0)").hide();	
		} else {
			$(this).attr("checked", true)
			   .parent().siblings().find("input").attr("checked", false);
			$(".y-btnOK:eq(0)").show();	
		}
	});
});

//尺寸
$(document).ready(function(){
	$(".y-lil input").click(function(){
		if($(this).attr("checked")) {
			$(this).attr("checked", false);
			$(".y-btnOK:eq(1)").hide();	
		} else {
			$(this).attr("checked", true)
			   .parent().siblings().find("input").attr("checked", false);
			$(".y-btnOK:eq(1)").show();	
		}
	});
});
 //选择-确定按钮
 //颜色
$(document).ready(function(){
	$(".y-btnOK").click(function(){
		$(".ys-name").text($(".y-li>input:checked").siblings().text());
		$(".yanse").hide();
	});
});

//尺寸
$(document).ready(function(){
	$(".y-btnOK").click(function(){
		$(".cc-name").text($(".y-lil>input:checked").siblings().text());
		$(".yanse").hide();
	});
});
//取消按钮
$(document).ready(function(){
	$(".y-btnNO").click(function(){
		$(".yanse").hide();
	});
});

//图片浏览效果

$(document).ready(function(){
	$(".i-li").click(function(){
		if ($(this).find("img").attr("src") != "") {
			$(".Divimg").attr("src", $(this).find("img").attr("src"));
		}else{
			$(".Divimg").attr("src","MyStore/img/user/div.jpg")
		}
	});
});
































