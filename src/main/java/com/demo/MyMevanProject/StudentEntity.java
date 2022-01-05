package com.demo.MyMevanProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//Entity for hibernate means there will be mapping between table and object of hibernate

//@Entity(name = "student_detail") //To change the name of entity(table name will be same as entity name)
//@Table(name = "MyTable")// Use to change the name of the table only
@Entity
public class StudentEntity {
	@Id  //To make primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public StudentEntity(String name, String city, int id) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
	}
	private String name;
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String city;
	private Certificate certi;
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public StudentEntity(int id, String name, String city, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certi = certi;
	}
	
}
