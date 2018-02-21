package com.kidszonebackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class ShippingAddress {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String Streetname;
private String city;
private String state;
private int pincode;


public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}

public String getStreetname() {
	return Streetname;
}
public void setStreetname(String streetname) {
	Streetname = streetname;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public String getState() {
return state;
}
public void setState(String state) {
this.state = state;
}
public int getPincode() {
return pincode;
}
public void setPincode(int pincode) {
this.pincode = pincode;
}
}


