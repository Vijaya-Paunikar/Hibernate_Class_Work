// Q.2)Create Car Entity class with different annotation.

// Package Creation
package com.hbm.example.CarProject;

//Importing necessary files
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car 
{
	@Id
	private long carId; // Unique identifier for the car
	@Column
	private String brand; // Brand or manufacturer of the car (e.g., Toyota, Honda)
	@Column
	private String model; // Specific model of the car (e.g., Camry, Civic)
	@Column
	private int year; // Manufacturing year of the car (e.g., 2023)
	@Column
	private double price; // Price of the car (e.g., $25,000)
	@Column
	private String color; // Color of the car's exterior
	@Column
	private String fuelType; // Type of fuel the car uses (e.g., gasoline, diesel)
	
	
	// Getters and setters for each attribute
	public long getCarId() 
	{
		return carId;
	}

	public void setCarId(long carId) 
	{
		this.carId = carId;
	}
	
	public String getBrand() 
	{
		return brand;
	}
	
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
	
	public String getModel() 
	{
		return model;
	}
	
	public void setModel(String model) 
	{
		this.model = model;
	}
	
	public int getYear() 
	{
		return year;
	}
	
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public String getColor() 
	{
		return color;
	}
	
	public void setColor(String color) 
	{
		this.color = color;
	}
	
	public String getFuelType() 
	{
		return fuelType;
	}
	
	public void setFuelType(String fuelType)
	{
		this.fuelType = fuelType;
	}
	
}
