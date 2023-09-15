package com.happyfeet.model;

public class ProductoModel {

	private String id_prod;
	private String id_cate;
	private String id_prove;
	private String nomb_prod;
	private String desc_prod;
	private Number precio;
	private Number stock;
	private String url_imag;
	
	public String getId_prod() {
		return id_prod;
	}
	public void setId_prod(String id_prod) {
		this.id_prod = id_prod;
	}
	public String getId_cate() {
		return id_cate;
	}
	public void setId_cate(String id_cate) {
		this.id_cate = id_cate;
	}
	public String getId_prove() {
		return id_prove;
	}
	public void setId_prove(String id_prove) {
		this.id_prove = id_prove;
	}
	public String getNomb_prod() {
		return nomb_prod;
	}
	public void setNomb_prod(String nomb_prod) {
		this.nomb_prod = nomb_prod;
	}
	public String getDesc_prod() {
		return desc_prod;
	}
	public void setDesc_prod(String desc_prod) {
		this.desc_prod = desc_prod;
	}
	public Number getPrecio() {
		return precio;
	}
	public void setPrecio(Number precio) {
		this.precio = precio;
	}
	public Number getStock() {
		return stock;
	}
	public void setStock(Number stock) {
		this.stock = stock;
	}
	public String getUrl_imag() {
		return url_imag;
	}
	public void setUrl_imag(String url_imag) {
		this.url_imag = url_imag;
	}
}
