package cn.itcast.ssm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.User;
import cn.itcast.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showuser";

	}
	
	@RequestMapping("/showFreemarker")
	public String ShowFreeMarkerHello(HttpServletRequest request,Model model){
		model.addAttribute("user", "zhangsan");
		return "hello.ftl";
	}
	@RequestMapping("/test")
	public ModelAndView showTest(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mavAndView = new ModelAndView();
		String string = "resume";
		mavAndView.addObject("haha",string);
		
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("name", "kobe");
		map.put("age", "30");
		map.put("address", "shanghai");
		map.put("ad", "ad");
		
		mavAndView.addObject("maplist",map);
		mavAndView.setViewName("test_fm.ftl");
		
		return mavAndView;
		
	}
	@RequestMapping("/post4")
	public String showPostString(HttpServletRequest request,Model model){
		model.addAttribute("user","zhang");
		return "post4.ftl";
		
	}
}
