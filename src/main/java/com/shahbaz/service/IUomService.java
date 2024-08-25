package com.shahbaz.service;

import java.util.List;

import com.shahbaz.model.Uom;

public interface IUomService {
	public Integer saveUom(Uom uom);
	public List<Uom> getAllUoms();
	
	public void updateUom(Uom uom);
	public void deleteUom(Integer id);
	public Uom  getOneUom(Integer id);
}
