package com.especialidaBack.ejerciciosBack.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.especialidaBack.ejerciciosBack.entity.Producto;
import com.especialidaBack.ejerciciosBack.services.ProductosService;

import io.swagger.annotations.ApiOperation;

@RestController

@RequestMapping("/productos")
public class ProductosController {
@Autowired
ProductosService productosService;

@ApiOperation(value=" Obtiene Lista de Productos",notes="Obtiene una lista de Productos con los "
        + "datos correspondientes de cada producto")
@GetMapping()
public ArrayList<Producto> obtenerCuenta(){
    return productosService.obtenerProductos();
}

@ApiOperation(value=" Obtiene el Producto",notes="Obtiene el Producto en base al ID que se envié"
        + " extrayendo así los datos correspondientes")
@GetMapping(path="/{id}")
public Optional<Producto> obtenerProductoId(@PathVariable("id")Long prodID) {
	return this.productosService.obtenerProducto(prodID);	
}

@ApiOperation(value="Guarda Producto",notes="Guarda el cuerpo del producto a ingresar"
        + " el cual se almacena en la base de datos que corresponda")
@PostMapping()
public Producto guardarProdUcto(@RequestBody Producto producto) {
	return this.productosService.guardarProducto(producto);
}

@ApiOperation(value="Elimina Producto en base al ID",notes="Elimina la Producto en base al ID que se le envía como"
        + " parametro, eliminando así de la base de datos")
@DeleteMapping(path="/{id}")
public String eliminarProducto(@PathVariable("id") Long idProd) {
	boolean exito=this.productosService.eliminaProducto(idProd);
	if(exito)
		return "Se eliminó con exito producto con id: "+idProd;
	return "No se pudo eliminar el producto con id: "+idProd;
}

}
