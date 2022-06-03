package com.generation.F220527;

public class OPPpart1 {
	//To build an object
	//Atributos
	//accesador, tipo, nombre 
	private String colour;
	private String brand;
	private String model;
	private Double speed;
	//Constructors
	//cuando queramos llamar una instancia
	//Clic derecho > source > Generate constructor using fields
	//constructor vacio
	public OPPpart1() {
		super();
	}
	//constructor con parametros
	public OPPpart1(String colour, String brand, String model, Double speed) {
		super();
		this.colour = colour;
		this.brand = brand;
		this.model = model;
		this.speed = speed;
	}	
	//getters and setters
	//Right click > Source > Generate getters and setters
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}
	
	//metodos o funciones personalizadas
	public void incSpeed() {
		this.speed = (double) 10;
	}

}
