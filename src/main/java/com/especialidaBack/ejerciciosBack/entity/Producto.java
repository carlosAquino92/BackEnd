package com.especialidaBack.ejerciciosBack.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name ="Producto")
public class Producto {
	
@Id
@Getter @Setter  @Column(name="Id", unique=true,nullable=false) @GeneratedValue(strategy = GenerationType.IDENTITY) 
private int id; 

@Getter @Setter  @Column(name="TipoProducto")
private int tipoProducto;


@Getter @Setter  @Column(name="Periodicidad")
private String periodicidad;


@Getter @Setter  @Column(name="MontoMaximo")
private double montoMaximo;


@Getter @Setter  @Column(name="MontoMinimo")
private double montoMinimo;
}
