package com.example.demo.Laptop;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="laptops")
public class Laptop {
@Id
private int lid;

private String name;

public Laptop() {
	super();
}
public Laptop(int lid, String name) {
	super();
	this.lid = lid;
	this.name = name;
}
@OneToOne(mappedBy="laptop")
//private Student student;
@Override
public String toString() {
	return "Laptop [lid=" + lid + "]";
}
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}




}
