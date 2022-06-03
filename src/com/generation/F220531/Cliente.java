package com.generation.F220531;

import java.util.List;

public class Cliente {
	private String rut;
	private Integer id;
	private List<Integer> numerosVenta;
	private String nombre;
	private String  correo;
	//constructores
	public Cliente() {
		super();
	}
	public Cliente(String rut, Integer id, List<Integer> numerosVenta, String nombre, String correo) {
		super();
		this.rut = rut;
		this.id = id;
		this.numerosVenta = numerosVenta;
		this.nombre = nombre;
		this.correo = correo;
	}

//Set&Get

	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Integer> getNumerosVenta() {
		return numerosVenta;
	}
	public void setNumerosVenta(List<Integer> numerosVenta) {
		this.numerosVenta = numerosVenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@SuppressWarnings("unused")
	private void modificarAtributo() {
		this.rut="123456789-0";
		nombre="Donato";
	}
}
