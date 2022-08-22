package com.especialidaBack.ejerciciosBack.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.especialidaBack.ejerciciosBack.entity.Categoria;
import com.especialidaBack.ejerciciosBack.services.CategoriasService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/categorias")
public class CategoriasController {
	@Autowired
	CategoriasService categoriasService;
	
	@ApiOperation(value=" Obtiene Categoria",notes="Obtiene categoria en base al ID que se envié"
            + " extrayendo así los datos correspondientes")
	@GetMapping(path="/{id}")
	public Optional<Categoria> obtenerCategoriaID(@PathVariable("id")Long prodID) {
		return this.categoriasService.obtenerCategoriaID(prodID);	
	}
	
	
	@ApiOperation(value="Guarda Categoria",notes="Guarda el cuerpo de la categoria a ingresar"
            + " el cual se almacena en la base de datos que corresponda")
	@PostMapping()
	public Categoria guardarCategoria(@RequestBody Categoria producto) {
		return this.categoriasService.guardarCategoria(producto);
	}
	
	
	@ApiOperation(value="Elimina Categoria",notes="Elimina la categoria en base al ID que se le envía como"
            + " parametro, eliminando así de la base de datos")
	@DeleteMapping(path="/{id}")
	public String eliminarCategoriaID(@PathVariable("id") Long idProd) {
		boolean exito=this.categoriasService.eliminaCategoriaID(idProd);
		if(exito)
			return "Se eliminó con exito categoria con id: "+idProd;
		return "No se pudo eliminar el categoria con id: "+idProd;
	}
}
