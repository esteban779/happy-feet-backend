package com.happyfeet.model;

public class CartDetalleModel {

	private String id_cart;
	private String posicion;
	private String id_prod;
	private Number cant_prod;
	
	public String getId_cart() {
		return id_cart;
	}
	public void setId_cart(String id_cart) {
		this.id_cart = id_cart;
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
	public Number getCant_prod() {
		return cant_prod;
	}
	public void setCant_prod(Number cant_prod) {
		this.cant_prod = cant_prod;
	}
}
