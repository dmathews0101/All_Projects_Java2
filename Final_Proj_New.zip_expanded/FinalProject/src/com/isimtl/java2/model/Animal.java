package com.isimtl.java2.model;

public class Animal {
	
	/* `animal_id` bigint(20) NOT NULL,
  `name` varchar(15) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `prix` decimal(8,2) DEFAULT NULL,
  `farm_id` bigint(20) NOT NULL,*/
	
	@Override
	public String toString() {
		return "Animal [animal_id=" + animal_id + ", name=" + name + ", type=" + type + ", price=" + price + ", farm="
				+ farm + "]";
	}
	private int animal_id;
	private String name;
	private String type;
	private double price;
	private Farm farm;
	public int getAnimal_id() {
		return animal_id;
	}
	public void setAnimal_id(int animal_id) {
		this.animal_id = animal_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public Farm getFarm() {
		return farm;
	}
	public void setFarm(Farm farm) {
		this.farm = farm;
	}
	

}
