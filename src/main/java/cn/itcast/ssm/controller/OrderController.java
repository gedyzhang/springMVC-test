package cn.itcast.ssm.controller;



import javax.annotation.Resource;
import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;







import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import cn.itcast.ssm.po.Order;
import cn.itcast.ssm.service.OrderService;


@Controller
@RequestMapping("/")
public class OrderController {
	
	@Resource
	private OrderService orderService;
	
	@RequestMapping("/aaa")
	public String a(HttpServletRequest request,Model model){
	 
		return "/baoming/a.ftl";
// 	    return "/market/detail.ftl";
//		return "/market/index.ftl";

	}
	
	
	@RequestMapping("/detail")
	public String showDetail(){
		return "/market/detail.ftl";
	}
	
	@RequestMapping("/insert")
	public String insert(String name, String price) {
		
		Order order = new Order();			
		
			order.setName(name);
			order.setNumber("11");
			order.setColor("ddd");
			order.setState(111);
			order.setPrice(price);
		
		orderService.insertOrder(order);
		
		return "/baoming/s.ftl";
	}
	
	@RequestMapping("/show")
	public String showOrder(Model model,int id) {
		Order order = orderService.getOrderById(id);
		String name = order.getName();			
		model.addAttribute("name",name);
		
		return "/baoming/n.ftl";
		
	}
	
	@RequestMapping("/delete")
	public String deleteOrder(int id){
		orderService.deleteOrder(id);
		return "/baoming/s.ftl";
	}
	
	@RequestMapping("/update")
	public String updateOrder(int id){
		Order order = new Order();
		order.setId(id);
		order.setColor("blue");
		order.setName("blue");
		order.setNumber("blue");
		order.setPrice("blue");
		order.setState(0);
		orderService.updateOrder(order);
		return "/baoming/s.ftl";
	}

	@RequestMapping(value = "/createOrder", method = RequestMethod.POST)
	@ResponseBody
	public String createNewOrder(@RequestBody Order obj){
		System.out.print("ajax");
		
//		orderService.batchSave(list);
//		JSONObject jsonObject =JSONObject.parseObject(obj);
//		String name = (String) jsonObject.get("name");
		System.out.print(obj.getName());
		orderService.insertOrder(obj);
		return "";	
		
	}
	
}
