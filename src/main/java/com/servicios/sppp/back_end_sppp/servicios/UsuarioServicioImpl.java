package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.Alumno;
import com.servicios.sppp.back_end_sppp.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicioImpl implements IServicioAlumno {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Override
    public List<Alumno> obtenerTodo() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Alumno guardar(Alumno usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public Alumno obtenerPorId(long id) {
        return usuarioRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        usuarioRepositorio.deleteById(id);
    }
}
