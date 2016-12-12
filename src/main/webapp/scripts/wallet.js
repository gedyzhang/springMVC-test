/*最终购买输出*/
$(function(){
    var $product = $(".pro_detail_right");
	$("#wallet a").click(function(){
        var pro_name = $product.find("h4:first").text();
		var pro_size = $product.find(".pro_size strong").text();
		var pro_color =  $(".color_change strong").text();
		var pro_num = $product.find("#num_sort").val();
	    var pro_price = $product.find(".pro_price span").text();
	    
	    
	    var obj = [];
	    var data =	{"name":pro_name,"size":pro_size,"color":pro_color,"number":pro_num,"price":pro_price};
	    obj.push(data);
	    
	    $.ajax({
	    	type:"POST",
	        url:'/createOrder',	   
	        contentType:'application/json',
	        data:JSON.stringify(data),
	    
	        success:function(data){
	    	    alert("您下单成功!");
	            console.log("suc...");
	    },
	    
	        error:function(data){
	    	   alert("您下单失败!");
	           console.log("error...");
	    }
	    
	    });
	    
//		var dialog = " 感谢您的购买。\n您购买的\n"+
//		        "产品是："+pro_name+"；\n"+
//				"尺寸是："+pro_size+"；\n"+
//				"颜色是："+pro_color+"；\n"+
//				"数量是："+pro_num+"；\n"+
//				"总价是："+pro_price +"元。";
//		if( confirm(dialog) ){
//			alert("您已经下单!");
//		}
		return false;//避免页面跳转
	})
})