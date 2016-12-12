package cn.itcast.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.ssm.mapper.OrderMapper;
import cn.itcast.ssm.po.Order;
import cn.itcast.ssm.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService{
	@Resource
	private OrderMapper mapper;

	public Order getOrderById(int orderid) {
		// TODO Auto-generated method stub
		return mapper.selectOrderById(orderid);
	}

	public int insertOrder(Order order) {
		// TODO Auto-generated method stub
		return mapper.insertOrder(order);
	}

	public int deleteOrder(int orderid) {
		// TODO Auto-generated method stub
		return mapper.deleteOrderById(orderid);
	}

	public int updateOrder(Order order) {
		// TODO Auto-generated method stub
		return mapper.updateOrderById(order);
	}

	public int batchSave(List<Order> list) {
		// TODO Auto-generated method stub
		return mapper.batchSave(list);
	}


}
