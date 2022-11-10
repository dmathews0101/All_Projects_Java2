package com.isimtl.javaii.model;

public class Animals {
	private int animalId;
	private String animalName;
	private double animalPrice;
	private String animalType;	
	private int farmNo;
	
	private Farms farm;

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public double getAnimalPrice() {
		return animalPrice;
	}

	public void setAnimalPrice(double animalPrice) {
		this.animalPrice = animalPrice;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public int getFarmNo() {
		return farmNo;
	}

	public void setFarmNo(int farmNo) {
		this.farmNo = farmNo;
	}

	public Farms getFarm() {
		return farm;
	}

	public void setFarm(Farms farm) {
		this.farm = farm;
	}

	@Override
	public String toString() {
		return "Animals [animalId=" + animalId + ", animalName=" + animalName + ", animalPrice=" + animalPrice
				+ ", animalType=" + animalType + ", farmNo=" + farmNo + ", farm=" + farm + "]";
	}		
}

