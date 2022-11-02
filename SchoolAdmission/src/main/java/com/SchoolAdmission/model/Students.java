package com.SchoolAdmission.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Students {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long regnum;
	private Long id;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(Long regnum, Long id) {
		super();
		this.regnum = regnum;
		this.id = id;
	}
	public Long getRegnum() {
		return regnum;
	}
	public void setRegnum(Long regnum) {
		this.regnum = regnum;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	

}
