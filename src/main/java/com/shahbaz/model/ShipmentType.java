package com.shahbaz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="shipment_type_tab")
public class ShipmentType {
	@Id
	@GeneratedValue
	@Column(name="shp_id_col")
	private Integer id;
	
	@Column(name="shp_mode_col")
	private String shipmentMode;
	
	@Column(name="shp_code_col")
	private String shipmentCode;
	
	@Column(name="shp_enable_ship_col")
	private String enableShipment;
	
	@Column(name="shp_grade_col")
	private String shipmentGrade;
	
	@Column(name="shp_description_col")
	private String description;
}
