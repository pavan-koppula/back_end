package comp.pavan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address_tb")
public class Address {
	@Id
	@Column(name="st_id")
	int id;
	@Column(name="city")
	String city;
	@Column(name="phone")
	int phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", phone=" + phone + "]";
	}
	public Address(int id, String city, int phone) {
		super();
		this.id = id;
		this.city = city;
		this.phone = phone;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
}
