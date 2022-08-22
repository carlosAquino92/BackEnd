package services;

import com.especialidaBack.ejerciciosBack.repositorys.ProductosRepository;
import com.especialidaBack.ejerciciosBack.entity.Producto;
import com.especialidaBack.ejerciciosBack.dtos.ProductoDTO;
import com.especialidaBack.ejerciciosBack.services.ProductosService;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class ProductoServicioTest {

    @Mock
    private transient ProductosRepository productoRepositorio;

    @InjectMocks
    private ProductosService productoServicio;
    private ProductoDTO productoDTO;
    private Producto producto;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        productoDTO = new ProductoDTO();
        productoDTO.setTipoProducto(2);
        productoDTO.setDescripcion("producto express");
    }

    @Test
    void getAllProducto() {
        when(productoServicio.obtenerProductos()).thenReturn(new ArrayList<>());
        assertNotNull(productoServicio.obtenerProductos());
    }

    @Test
    void guardarProducto() {
        when(productoServicio.guardarProducto(producto)).thenReturn(producto);
        assertNotNull(productoServicio.guardarProducto(producto));
    }

    @Test
    void obtenerProductoPorId() {
        assertNotNull(productoServicio.obtenerProducto(1));
    }

    @Test
    void eliminarProducto() {
        assertNotNull(productoServicio.eliminaProducto(1));
    }
}
