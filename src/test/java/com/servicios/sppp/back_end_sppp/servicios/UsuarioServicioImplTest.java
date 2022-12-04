package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.Alumno;
import com.servicios.sppp.back_end_sppp.repositorios.UsuarioRepositorio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UsuarioServicioImplTest {

    @Mock
    UsuarioRepositorio usuarioRepositorio;

    @InjectMocks
    UsuarioServicioImpl usuarioServicio;

    private Alumno alumno;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        alumno = new Alumno();
        alumno.setNombre("igor");
        alumno.setApellido("ramos cruzado");
        alumno.setCodigo("0020190504");
        alumno.setDireccionActual("Tingo Maria");
        alumno.setEmail("igor.ramos@unas.edu.pe");
        alumno.setPasword("12345678");
    }

    @Test
    void guardar() {
        when(usuarioRepositorio.save(alumno)).thenReturn(alumno);
        assertNotNull(usuarioServicio.guardar(alumno));
    }
}