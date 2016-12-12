package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.Order;

public interface OrderService {
	
	public Order getOrderById(int orderid);
	
	public int insertOrder(Order order);
	
	public int deleteOrder(int orderid);	
	
	public int updateOrder(Order order);	
	
	public int batchSave(List<Order> list);

}
