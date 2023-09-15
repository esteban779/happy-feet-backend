package com.happyfeet.model;

public class PagoModel {

	private String id_pago;
	private String id_venta;
	private String id_tipo_pago;
	private String fech_pago;
	private String totl_pago;
	
	public String getId_pago() {
		return id_pago;
	}
	public void setId_pago(String id_pago) {
		this.id_pago = id_pago;
	}
	public String getId_venta() {
		return id_venta;
	}
	public void setId_venta(String id_venta) {
		this.id_venta = id_venta;
	}
	public String getId_tipo_pago() {
		return id_tipo_pago;
	}
	public void setId_tipo_pago(String id_tipo_pago) {
		this.id_tipo_pago = id_tipo_pago;
	}
	public String getFech_pago() {
		return fech_pago;
	}
	public void setFech_pago(String fech_pago) {
		this.fech_pago = fech_pago;
	}
	public String getTotl_pago() {
		return totl_pago;
	}
	public void setTotl_pago(String totl_pago) {
		this.totl_pago = totl_pago;
	}
}
