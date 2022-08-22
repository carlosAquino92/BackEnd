package com.especialidaBack.ejerciciosBack.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.especialidaBack.ejerciciosBack.entity.Categoria;
import com.especialidaBack.ejerciciosBack.repositorys.CategoriasRepository;

@Service
public class CategoriasService {

	@Autowired
	CategoriasRepository categoriasRepository;

	public ArrayList<Categoria> obtenerCategorias(){
	    return (ArrayList<Categoria>) categoriasRepository.findAll();
	}
	
	public Optional<Categoria> obtenerCategoriaID(long i) {
		return categoriasRepository.findById(i);
	}
	

	public Categoria guardarCategoria(Categoria categoria) {
	    return categoriasRepository.save(categoria);	
	}
	

	public boolean eliminaCategoriaID(Long idPro) {
		try {
			categoriasRepository.deleteById(idPro);
	return true;
		}catch(Exception err) {
			return false;
		}
	}
}
