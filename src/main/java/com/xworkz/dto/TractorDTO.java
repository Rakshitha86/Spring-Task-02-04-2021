package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tractor_table")
public class TractorDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TRACTOR_ID")
	private int id;
	
	@Column(name="TRACTOR_MODEL")
	private String model;
	
	@Column(name="TRACTOR_COST")
	private double cost;
	
	@Column(name="TRACTOR_COLOR")
	private String color;
	
	@Column(name="TRACTOR_FUELCAPACITY")
	private int fuelCapacity;
	
	@Column(name="TRACTOR_TRACTORCAPACITY")
	private int tractorCapacity;
	
	@Column(name="TRACTOR_MILAGE")
	private int milage;

	public TractorDTO() {
		System.out.println("Invoked default Constructor");
	}

	public TractorDTO(String model, double cost, String color, int fuelCapacity, int tractorCapacity, int milage) {
		super();
		this.model = model;
		this.cost = cost;
		this.color = color;
		this.fuelCapacity = fuelCapacity;
		this.tractorCapacity = tractorCapacity;
		this.milage = milage;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getTractorCapacity() {
		return tractorCapacity;
	}

	public void setTractorCapacity(int tractorCapacity) {
		this.tractorCapacity = tractorCapacity;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	@Override
	public String toString() {
		return "TractorDTO [model=" + model + ", cost=" + cost + ", color=" + color + ", fuelCapacity=" + fuelCapacity
				+ ", tractorCapacity=" + tractorCapacity + ", milage=" + milage + "]";
	}

}
