package com.especialidaBack.ejerciciosBack.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name ="Categoria")
public class CategoriaModel {
	
	@Id
	@Getter @Setter  @Column(name="Id", unique=true,nullable=false) @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id; 
	
	@Getter @Setter  @Column(name="Nivel")
	private int nivel;
	
	@Getter @Setter  @Column(name="TipoCategoria")
	private String tipoCategoria;
	
	
	@Getter @Setter  @Column(name="Nombre")
	private String nombre;
	
}
