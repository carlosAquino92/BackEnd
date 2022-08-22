package com.especialidaBack.ejerciciosBack.repositorys;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.especialidaBack.ejerciciosBack.entity.Producto;

@Repository
public interface ProductosRepository extends CrudRepository<Producto,Long>{
  public abstract Producto findById(Integer idProd);
}
