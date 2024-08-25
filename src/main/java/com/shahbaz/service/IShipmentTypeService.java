package com.shahbaz.service;

import java.util.List;

import com.shahbaz.model.ShipmentType;

public interface IShipmentTypeService {
	public Integer saveShipmentType(ShipmentType st);
	public void updateShipmentType(ShipmentType st);
	public void deleteShipmentType(Integer id);
	public ShipmentType getOneShipmentType(Integer id);
	public List<ShipmentType> getAllShipmentType();
}
