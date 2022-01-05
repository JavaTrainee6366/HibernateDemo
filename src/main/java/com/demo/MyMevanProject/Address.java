package com.demo.MyMevanProject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="student_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincreament
	@Column(name = "ADD_ID") //Specify the name of the column
	private int add_id;
	
	@Column(length = 50, name = "STREET")
	private String street;
	
	@Column(length = 100, name = "CITY")
	private String city;
	private boolean open;
	
	@Transient //it will not create col in database
	private double hno;
	
	@Temporal(TemporalType.DATE) //Formating of date
	private Date add_date;
	
	@Lob //To store large object
	private byte[] image;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int add_id, String street, String city, boolean open, double hno, Date add_date, byte[] image) {
		super();
		this.add_id = add_id;
		this.street = street;
		this.city = city;
		this.open = open;
		this.hno = hno;
		this.add_date = add_date;
		this.image = image;
	}
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public double getHno() {
		return hno;
	}
	public void setHno(double hno) {
		this.hno = hno;
	}
	public Date getAdd_date() {
		return add_date;
	}
	public void setAdd_date(Date add_date) {
		this.add_date = add_date;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
	

}
