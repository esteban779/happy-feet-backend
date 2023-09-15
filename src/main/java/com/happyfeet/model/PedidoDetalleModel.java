package com.happyfeet.model;

public class PedidoDetalleModel {

	private String id_pedi;
	private String posicion;
	private String id_prod;
	private String cant_prod;
	private String prec_prod;
	private String prec_totl;
	
	public String getId_pedi() {
		return id_pedi;
	}
	public void setId_pedi(String id_pedi) {
		this.id_pedi = id_pedi;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getId_prod() {
		return id_prod;
	}
	public void setId_prod(String id_prod) {
		this.id_prod = id_prod;
	}
	public String getCant_prod() {
		return cant_prod;
	}
	public void setCant_prod(String cant_prod) {
		this.cant_prod = cant_prod;
	}
	public String getPrec_prod() {
		return prec_prod;
	}
	public void setPrec_prod(String prec_prod) {
		this.prec_prod = prec_prod;
	}
	public String getPrec_totl() {
		return prec_totl;
	}
	public void setPrec_totl(String prec_totl) {
		this.prec_totl = prec_totl;
	}
}
