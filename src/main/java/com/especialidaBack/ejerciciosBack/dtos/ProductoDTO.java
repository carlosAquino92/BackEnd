package com.especialidaBack.ejerciciosBack.dtos;
import com.especialidaBack.ejerciciosBack.model.ProductoModel;


public class ProductoDTO {
	private Integer id;
	private int tipoProducto;
	private String descripcion;
	
	public ProductoDTO() {
		super();
	}

	public ProductoDTO(ProductoModel p) {
		this.id = p.getId();
		this.tipoProducto = p.getTipoProducto();
		this.descripcion = p.getPeriodicidad();
	}
	
	public Integer getId() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public int getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(int tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
