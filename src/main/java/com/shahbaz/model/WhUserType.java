package com.shahbaz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="wh_user_type_tab")
public class WhUserType {
	@Id
	@GeneratedValue
	@Column(name="wh_id_col")
	private Integer id;
	
	@Column(name="wh_type_col")
	private String userType;
	
	@Column(name="wh_code_col")
	private String userCode;
	
	@Column(name="wh_for_col")
	private String userFor;
	
	@Column(name="wh_email_col")
	private String userEmail;
	
	@Column(name="wh_contact_col")
	private String userContact;
	
	@Column(name="wh_if_other_col")
	private String ifOther;
	
	@Column(name="wh_id_number_col")
	private String idNumber;
}
