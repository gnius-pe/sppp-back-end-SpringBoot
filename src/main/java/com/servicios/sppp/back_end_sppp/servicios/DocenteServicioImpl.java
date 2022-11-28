package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.Docente;
import com.servicios.sppp.back_end_sppp.repositorios.DocenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServicioImpl implements IServicioDocente{

    @Autowired
    DocenteRepositorio docenteRepositorio;

    @Override
    public List<Docente> obtenerTodo() {
        return docenteRepositorio.findAll();
    }

    @Override
    public Docente guardar(Docente docente) {
        return null;
    }

    @Override
    public Docente obtenerPorId(long id) {
        return null;
    }

    @Override
    public void eliminar(long id) {

    }
}
