package com.shahbaz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahbaz.exception.ShipmentTypeNotFoundException;
import com.shahbaz.model.ShipmentType;
import com.shahbaz.repository.IShipmentTypeRepository;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService{
	@Autowired
	private IShipmentTypeRepository repo;

	@Override
	public Integer saveShipmentType(ShipmentType st) {
		// TODO Auto-generated method stub
		return repo.save(st).getId();
	}

	@Override
	public void updateShipmentType(ShipmentType st) {
		// TODO Auto-generated method stub
		 repo.save(st);
	}

	@Override
	public void deleteShipmentType(Integer id) {
		// TODO Auto-generated method stub
		ShipmentType st=getOneShipmentType(id);
		repo.delete(st);
	}

	@Override
	public ShipmentType getOneShipmentType(Integer id) {
		ShipmentType st=repo.findById(id)
				.orElseThrow(
						() -> new ShipmentTypeNotFoundException("shahbaz")
						);
		return st;
	}

	@Override
	public List<ShipmentType> getAllShipmentType() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
