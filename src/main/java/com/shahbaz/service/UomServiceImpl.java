package com.shahbaz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahbaz.exception.UomNotFoundException;
import com.shahbaz.model.Uom;
import com.shahbaz.repository.IUomRepository;

@Service
public class UomServiceImpl implements IUomService{
	@Autowired
	private IUomRepository repo;
	
	@Override
	public Integer saveUom(Uom uom) {
		// TODO Auto-generated method stub
		return repo.save(uom).getId();
	}

	@Override
	public List<Uom> getAllUoms() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateUom(Uom uom) {
		repo.save(uom);
		
	}

	@Override
	public void deleteUom(Integer id) {
		Uom uom=getOneUom(id);
		repo.delete(uom);
		
	}

	@Override
	public Uom getOneUom(Integer id) {
		Uom uom=repo.findById(id).orElseThrow(()-> new UomNotFoundException("Uom with id: "+id+" does not exist"));
		return uom;
	}

}
