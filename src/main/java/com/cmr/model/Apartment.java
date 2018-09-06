package com.cmr.model;

public class Apartment {
	
	private String id;
	private ApartmentType type;
	private Integer sqft;
	private String floorPlan;
	private Address address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ApartmentType getType() {
		return type;
	}
	public void setType(ApartmentType type) {
		this.type = type;
	}
	public Integer getSqft() {
		return sqft;
	}
	public void setSqft(Integer sqft) {
		this.sqft = sqft;
	}
	public String getFloorPlan() {
		return floorPlan;
	}
	public void setFloorPlan(String floorPlan) {
		this.floorPlan = floorPlan;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
