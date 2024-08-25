package com.shahbaz.service;

import java.util.List;

import com.shahbaz.model.OrderMethod;

public interface IOrderTypeService {
	public String saveOrder(OrderMethod order);
	public List<OrderMethod> getAllOrders();
	public OrderMethod getOneOrderType(int id);
}
