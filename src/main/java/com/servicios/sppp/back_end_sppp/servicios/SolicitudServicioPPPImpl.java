package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.SolicitudPPP;
import com.servicios.sppp.back_end_sppp.repositorios.SolicitudRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudServicioPPPImpl implements  IServicioSolicitudPPP{

    @Autowired
    SolicitudRepositorio solicitudRepositorio;

    @Override
    public List<SolicitudPPP> obtenerTodo() {
        return solicitudRepositorio.findAll();
    }

    @Override
    public SolicitudPPP guardar(SolicitudPPP solicitudPPP) {
        return null;
    }

    @Override
    public SolicitudPPP obtenerPorId(long id) {
        return null;
    }

    @Override
    public void eliminar(long id) {

    }
}
