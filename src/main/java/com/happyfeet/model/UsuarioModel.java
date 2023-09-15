package com.happyfeet.model;

public class UsuarioModel {

	private String id_usua;
	private String usuario;
	private String pass_hash;
	private String ult_login;
	
	public String getId_usua() {
		return id_usua;
	}
	public void setId_usua(String id_usua) {
		this.id_usua = id_usua;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass_hash() {
		return pass_hash;
	}
	public void setPass_hash(String pass_hash) {
		this.pass_hash = pass_hash;
	}
	public String getUlt_login() {
		return ult_login;
	}
	public void setUlt_login(String ult_login) {
		this.ult_login = ult_login;
	}
}
