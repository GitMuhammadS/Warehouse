package com.shahbaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahbaz.model.ShipmentType;

public interface IShipmentTypeRepository extends JpaRepository<ShipmentType,Integer>{

}
