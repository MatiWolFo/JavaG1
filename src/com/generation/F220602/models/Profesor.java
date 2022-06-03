package com.generation.F220602.models;

public class Profesor extends Usuario {
	private String idProfesor;
	private String jefaturaProfesor;
	/**
	 * 
	 */
	public Profesor() {
		super();
	}
	/**
	 * @param idProfesor
	 * @param jefaturaProfesor
	 */
	public Profesor(String idProfesor, String jefaturaProfesor) {
		super();
		this.idProfesor = idProfesor;
		this.jefaturaProfesor = jefaturaProfesor;
	}
	public String getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getJefaturaProfesor() {
		return jefaturaProfesor;
	}
	public void setJefaturaProfesor(String jefaturaProfesor) {
		this.jefaturaProfesor = jefaturaProfesor;
	}
	@Override
	public String toString() {
		return super.toString() + "\nidProfesor=" + idProfesor + "\njefaturaProfesor=" + jefaturaProfesor;
	}	
}
