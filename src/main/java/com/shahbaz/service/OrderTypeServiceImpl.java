package com.shahbaz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahbaz.model.OrderMethod;
import com.shahbaz.repository.IOrderRepository;

@Service
public class OrderTypeServiceImpl implements IOrderTypeService{
	@Autowired
	private IOrderRepository repo;
	
	@Override
	public String saveOrder(OrderMethod order) {
		return "Record got submitted with id :"+repo.save(order).getId();
	}

	@Override
	public List<OrderMethod> getAllOrders() {
		
		return repo.findAll();
	}

	@Override
	public OrderMethod getOneOrderType(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
