package com.shahbaz.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="uom_tab")
public class Uom {
	@Id
	@GeneratedValue
	@Column(name="uom_id_col")
	private Integer id;
	
	@Column(name="uom_type_col")
	private String uomType;
	
	@Column(name="uom_model_col")
	private String uomModel;
	
	@Column(name="uom_description_col")
	private String description;
}
