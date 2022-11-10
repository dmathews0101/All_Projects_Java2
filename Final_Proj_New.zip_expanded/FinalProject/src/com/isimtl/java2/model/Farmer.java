package com.isimtl.java2.model;

public class Farmer {
	
	/*`farmer_id` bigint(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,*/
	
	private int farmer_id;
	private String name;
	
	public int getFarmer_id() {
		return farmer_id;
	}
	public void setFarmer_id(int farmer_id) {
		this.farmer_id = farmer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Farmer [farmer_id=" + farmer_id + ", name=" + name + "]";
	}

}
