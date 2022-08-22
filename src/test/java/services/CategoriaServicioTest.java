package services;
import com.especialidaBack.ejerciciosBack.dtos.CategoriaDTO;

import com.especialidaBack.ejerciciosBack.entity.Categoria;
import com.especialidaBack.ejerciciosBack.repositorys.CategoriasRepository;
import com.especialidaBack.ejerciciosBack.services.CategoriasService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CategoriaServicioTest {

    @Mock
    private transient CategoriasRepository categoriaRepositorio;

    @InjectMocks
    private CategoriasService categoriaServicio;
    private CategoriaDTO categoriaDTO;
    private Categoria categoria;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        categoriaDTO = new CategoriaDTO();
        categoriaDTO.setNombre("Categoria 1");
        categoriaDTO.setTipoCategoria("sin categoria");
    }

    @Test
    void getAllCategoria() {
        when(categoriaServicio.obtenerCategorias()).thenReturn(new ArrayList<>());
        assertNotNull(categoriaServicio.obtenerCategorias());
    }

    @Test
    void guardarCategoria() {
        when(categoriaServicio.guardarCategoria(categoria)).thenReturn(categoria);
        assertNotNull(categoriaServicio.guardarCategoria(categoria));
    }
    
    @Test
    void obtenerCategoriaPorId() {
        assertNotNull(categoriaServicio.obtenerCategoriaID(1));
    }

    @Test
    void eliminarCategoria() {
        assertNotNull(categoriaServicio.eliminaCategoriaID((long) 2));
    }
}