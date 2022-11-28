package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.SolicitudPPP;

import java.util.List;

public interface IServicioSolicitudPPP {
    List<SolicitudPPP> obtenerTodo();

    public SolicitudPPP guardar( SolicitudPPP solicitudPPP);

    public SolicitudPPP obtenerPorId(long id);

    public void eliminar(long id);
}
