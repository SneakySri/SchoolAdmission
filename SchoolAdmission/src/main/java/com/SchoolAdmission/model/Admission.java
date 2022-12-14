package com.SchoolAdmission.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Admission {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String age;
	private String gender;
	public Admission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admission(Long id, String name, String age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Admission [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	

}
