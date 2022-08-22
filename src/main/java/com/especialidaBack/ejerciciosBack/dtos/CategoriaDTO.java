package com.especialidaBack.ejerciciosBack.dtos;
import com.especialidaBack.ejerciciosBack.model.CategoriaModel;


public class CategoriaDTO {
	
	private Integer id;
	private String nombre;
	private String tipoCategoria;

	public CategoriaDTO() {
		super();
	}

	public CategoriaDTO(CategoriaModel c) {
		this.id = c.getId();
		this.nombre = c.getNombre();
		this.tipoCategoria = c.getTipoCategoria();
    }

    public Integer getIdCategoria() {
		return id;
	}
	public void setIdCategoria(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoCategoria() {
		return tipoCategoria;
	}
	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}
	
}
