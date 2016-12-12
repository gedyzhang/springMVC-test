package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.Order;

public interface OrderMapper {

	Order selectOrderById (Integer orderid);
	
	int insertOrder (Order order);
	
	int deleteOrderById (int orderid);
	
	int updateOrderById(Order order);
	
	int batchSave (List<Order> list);

}
