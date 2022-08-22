package com.especialidaBack.ejerciciosBack.facades;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(readOnly = true)
public class ProductosFacade {

}
