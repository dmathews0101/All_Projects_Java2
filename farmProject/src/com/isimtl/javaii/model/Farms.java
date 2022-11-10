package com.isimtl.javaii.model;

public class Farms {
	private int farmNo;
	private String farmName;
	private String country;
	private String farmerName;
	public int getFarmNo() {
		return farmNo;
	}
	public void setFarmNo(int farmNo) {
		this.farmNo = farmNo;
	}
	public String getFarmName() {
		return farmName;
	}
	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	@Override
	public String toString() {
		return "Farms [farmNo=" + farmNo + ", farmName=" + farmName + ", country=" + country + ", farmerName="
				+ farmerName + "]";
	}
	

}
