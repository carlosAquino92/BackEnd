package com.especialidaBack.ejerciciosBack.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.especialidaBack.ejerciciosBack.entity.Categoria;

@Repository
public interface CategoriasRepository extends CrudRepository<Categoria,Long> {
	  public abstract Categoria findById(Integer idProd);

}
