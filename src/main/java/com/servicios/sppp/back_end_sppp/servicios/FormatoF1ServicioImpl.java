package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.FormatoF1;
import com.servicios.sppp.back_end_sppp.repositorios.FormatoF1Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormatoF1ServicioImpl implements IMetodosCRUD<FormatoF1> {

    @Autowired
    FormatoF1Repositorio formatoF1Repositorio;

    @Override
    public List<FormatoF1> obtenerTodo() {
        return formatoF1Repositorio.findAll();
    }

    @Override
    public FormatoF1 guardar(FormatoF1 formatoF1) {
        return formatoF1Repositorio.save(formatoF1);
    }

    @Override
    public FormatoF1 obtenerPorId(long id) {
        return formatoF1Repositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        formatoF1Repositorio.deleteById(id);
    }
}
