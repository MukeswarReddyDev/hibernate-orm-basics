package com.tap;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_Details")
public class CustomerDetails {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private int phone;
	
	@Column(name = "addres")
	private String addres;
	
	
	@OneToOne(mappedBy = "customerDetails",cascade = CascadeType.ALL)  // to get bidirectional connection 
	private Customer customer;
	
	public CustomerDetails()
	{
		
	}

	public CustomerDetails(int id, String addres, int phone, String email) {
		super();
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.addres = addres;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}
	


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return id +" " + addres + " " + phone + " " + email;
	}

	
	

}
