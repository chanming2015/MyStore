//登录的JS

/*$(function() {
 // 跳回首页
 $("#loginsubmit").click(function() {
 location.href = "UserInfoServlet?op=userlogin";
 });
 });

 // 注册的JS
 $(function() {
 // 跳回首页
 $("#registsubmit").click(function() {
 location.href = "main.html";
 });
 });
 */
/*// 搜索的JS
 $(function() {
 $("#sousuo").click(function() {
 $("#mainFrame").parent.location.href = "mainframe/goodShow.html";
 //		$("#mainFrame").src = "mainframe/goodShow.html";
 window.parent.location.href = "mainframe/goodShow.html";
 window.target = "mainFrame";

 });
 });*/

$(function(a){
    a.fn.webwidget_vertical_menu=function(p){

        var p=p||{};

        var f=p&&p.menu_text_size?p.menu_text_size:"12";
        var g=p&&p.menu_text_color?p.menu_text_color:"blue";
        var h=p&&p.menu_border_size?p.menu_border_size:"1";
        var i=p&&p.menu_background_color?p.menu_background_color:"#FFF";
        var j=p&&p.menu_border_color?p.menu_border_color:"blue";
        var k=p&&p.menu_border_style?p.menu_border_style:"solid";
        var l=p&&p.menu_width?p.menu_width:"250";
        var n=p&&p.menu_height?p.menu_height:"30";
        var r=p&&p.menu_margin?p.menu_margin:"5";
        var v=p&&p.menu_background_hover_color?p.menu_background_hover_color:"red";
        var m=p&&p.directory?p.directory:"../../../img/user";
        var w=a(this);
        f += 'px';
        h += 'px';
        l += 'px';
        n += 'px';
        r += 'px';
        if(w.children("ul").length==0||w.find("li").length==0){
            dom.append("Require menu content");
            return null;
        }
        init();
        function init(){
            w.children("ul").find("a").css("color",g).css("font-size",f).css("line-height",n).css("display","block");
            w.children("ul").children("li").css("border",h+" "+k+" "+j).css("margin-bottom",r).css("background-color",i);
            w.find("li").children("ul").css("border",h+" "+k+" "+j).css("background-color",i);
            w.find("li").css("width",l).css("height",n);
            w.find("li:has(ul)").addClass("webwidget_vertical_menu_down_drop");
         //   w.find("li:has(ul)").css("background-image","url("+m+"/down_drop_icon.gif)");
            w.children("ul").children("li").find("ul").css("left",l).css("top","0px");
        }
//        s_sub_l(w.find("ul").children("li").children("ul").children("li").children("ul"),h);
        w.find("li").hover(function(){
            $(this).css("background-color",v);
            $(this).children("ul").show();
            },function(){
            $(this).css("background-color",i);
            $(this).children("ul").hide();
            });



            function s_u_t(a){
            l_t_b_s=a.outerHeight(true)-a.css("border-top-width").replace("px","")*2+"px";
            a.children("ul").css("top",l_t_b_s);
            a.children("ul").css("left","-"+a.css("border-top-width"));
            li_hieght = w.children("ul").children("li").outerHeight(true);
            a.children("ul").find("a").css("line-height",li_hieght+"px");
            }
            function s_sub_l(a,b){
            boder_width=b.replace("px","");
            a.css("left",a.parent("li").parent("ul").outerWidth(true)-boder_width*2);
            a.css("top","-"+b);
            }
        };
});






/*图片轮播*/
$(function(){
    var $banner=$('.banner');
    var $banner_ul=$('.banner-img');
    var $btn=$('.banner-btn');
    var $btn_a=$btn.find('a')
    var v_width=$banner.width();
    
    var page=1;
    
    var timer=null;
    var btnClass=null;

    var page_count=$banner_ul.find('li').length;//把这个值赋给小圆点的个数
    
    var banner_cir="<li class='selected' href='#'><a></a></li>";
    for(var i=1;i<page_count;i++){
            //动态添加小圆点
            banner_cir+="<li><a href='#'></a></li>";
            }
    $('.banner-circle').append(banner_cir);
    
    var cirLeft=$('.banner-circle').width()*(-0.5);
    $('.banner-circle').css({'marginLeft':cirLeft});
    
    $banner_ul.width(page_count*v_width);
    
    function move(obj,classname){
            //手动及自动播放
    if(!$banner_ul.is(':animated')){
            if(classname=='prevBtn'){
                    if(page==1){
                                    $banner_ul.animate({left:-v_width*(page_count-1)});
                                    page=page_count; 
                                    cirMove();
                    }
                    else{
                                    $banner_ul.animate({left:'+='+v_width},"slow");
                                    page--;
                                    cirMove();
                    }        
            }
            else{
                    if(page==page_count){
                                    $banner_ul.animate({left:0});
                                    page=1;
                                    cirMove();
                            }
                    else{
                                    $banner_ul.animate({left:'-='+v_width},"slow");
                                    page++;
                                    cirMove();
                            }
                    }
            }
    }
    
    function cirMove(){
            //检测page的值，使当前的page与selected的小圆点一致
            $('.banner-circle li').eq(page-1).addClass('selected')
                                                                                            .siblings().removeClass('selected');
    }
    
    $banner.mouseover(function(){
            $btn.css({'display':'block'});
            clearInterval(timer);
                            }).mouseout(function(){
            $btn.css({'display':'none'});                
            clearInterval(timer);
            timer=setInterval(move,2000);
                            }).trigger("mouseout");//激活自动播放

    $btn_a.mouseover(function(){
            //实现透明渐变，阻止冒泡
                    $(this).animate({opacity:0.6},'fast');
                    $btn.css({'display':'block'});
                     return false;
            }).mouseleave(function(){
                    $(this).animate({opacity:0.3},'fast');
                    $btn.css({'display':'none'});
                     return false;
            }).click(function(){
                    //手动点击清除计时器
                    btnClass=this.className;
                    clearInterval(timer);
                    timer=setInterval(move,2000);
                    move($(this),this.className);
            });
            
    $('.banner-circle li').live('click',function(){
                    var index=$('.banner-circle li').index(this);
                    $banner_ul.animate({left:-v_width*index},'slow');
                    page=index+1;
                    cirMove();
            });
});