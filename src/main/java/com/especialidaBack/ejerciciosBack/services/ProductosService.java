package com.especialidaBack.ejerciciosBack.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.especialidaBack.ejerciciosBack.entity.Producto;
import com.especialidaBack.ejerciciosBack.repositorys.ProductosRepository;

@Service
public class ProductosService {
@Autowired
ProductosRepository productosRepository;


public ArrayList<Producto> obtenerProductos(){
    return (ArrayList<Producto>) productosRepository.findAll();
}


public Optional<Producto> obtenerProducto(long i) {
	return productosRepository.findById(i);
}
public Producto guardarProducto(Producto producto) {
return productosRepository.save(producto);	
}
public boolean eliminaProducto(long i) {
	try {
		 productosRepository.deleteById(i);
return true;
	}catch(Exception err) {
		return false;
	}
}


}