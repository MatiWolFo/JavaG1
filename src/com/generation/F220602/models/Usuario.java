package com.generation.F220602.models;

public class Usuario {
	//ATRIBUTOS USUARIO
	private String username;
	private String password;
	private String emailRegistro;
	private String idUsuario;
	private String genUsuario;
	private Integer edadUsuario;
	
	//CONSTRUCTOR VACIO
	/**
	 * 
	 */
	public Usuario() {
		super();
	}	
	//CONSTRUCTOR LLENO
	/**
	 * @param username
	 * @param password
	 * @param emailRegistro
	 * @param idUsuario
	 * @param genUsuario
	 * @param edadUsuario
	 */
	public Usuario(String username, String password, String emailRegistro, String idUsuario, String genUsuario, Integer edadUsuario) {
		super();
		this.username = username;
		this.password = password;
		this.emailRegistro = emailRegistro;
		this.idUsuario = idUsuario;
		this.genUsuario = genUsuario;
		this.edadUsuario = edadUsuario;
	}
	//GETERS Y SETTERS
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailRegistro() {
		return emailRegistro;
	}
	public void setEmailRegistro(String emailRegistro) {
		this.emailRegistro = emailRegistro;
	}
	public String getIdUsuario() {
		return idUsuario;
	}	
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getGenUsuario() {
		return genUsuario;
	}	
	public void setGenUsuario(String genUsuario) {
		this.genUsuario = genUsuario;
	}
	public Integer getEdadUsuario() {
		return edadUsuario;
	}
	public void setEdadUsuario(Integer edadUsuario) {
		this.edadUsuario = edadUsuario;
	}
	//METODO TO.STRING
	@Override
	public String toString() {
		return "Usuario: username=" + username + "\npassword=" + password + "\nemailRegistro=" + emailRegistro
				+ "\nidUsuario=" + idUsuario + "\ngenUsuario=" + genUsuario + "\nedadUsuario=" + edadUsuario;
	}
}

