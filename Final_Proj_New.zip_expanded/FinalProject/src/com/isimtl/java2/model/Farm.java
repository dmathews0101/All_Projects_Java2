package com.isimtl.java2.model;

public class Farm {
	
	/* `farm_id` bigint(20) NOT NULL,
  `name_farm` varchar(20) DEFAULT NULL,
  `pays` varchar(15) DEFAULT NULL,
  `farmer_id` bigint(20) NOT NULL,*/
	
   
	
	private int farm_id;
	private String name_farm; 
	private String pays; 
	
	private Farmer farmer;
	
	
	
	public int getFarm_id() {
		return farm_id;
	}
	public void setFarm_id(int farm_id) {
		this.farm_id = farm_id;
	}
	public String getName_farm() {
		return name_farm;
	}
	public void setName_farm(String name_farm) {
		this.name_farm = name_farm;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public Farmer getFarmer() {
		return farmer;
	}
	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	

	@Override
	public String toString() {
		return "Farm [farm_id=" + farm_id + ", name_farm=" + name_farm + ", pays=" + pays + ", farmer=" + farmer + "]";
	}




}
