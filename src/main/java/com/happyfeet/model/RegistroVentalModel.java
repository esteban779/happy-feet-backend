package com.happyfeet.model;

public class RegistroVentalModel {

	private String id_venta;
	private String id_pedi;
	private String id_docu_trib;
	private String monto_total;
	
	public String getId_venta() {
		return id_venta;
	}
	public void setId_venta(String id_venta) {
		this.id_venta = id_venta;
	}
	public String getId_pedi() {
		return id_pedi;
	}
	public void setId_pedi(String id_pedi) {
		this.id_pedi = id_pedi;
	}
	public String getId_docu_trib() {
		return id_docu_trib;
	}
	public void setId_docu_trib(String id_docu_trib) {
		this.id_docu_trib = id_docu_trib;
	}
	public String getMonto_total() {
		return monto_total;
	}
	public void setMonto_total(String monto_total) {
		this.monto_total = monto_total;
	}
}
