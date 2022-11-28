package com.servicios.sppp.back_end_sppp.controladores;

import com.servicios.sppp.back_end_sppp.modelos.SolicitudPPP;
import com.servicios.sppp.back_end_sppp.servicios.SolicitudServicioPPPImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/beta/solicitudppp")
public class SolicitudPPPControlador {
    @Autowired
    SolicitudServicioPPPImpl solicitudPPP;

    @GetMapping("/solicitudes")
    public List<SolicitudPPP> obtenerSolicitudesPPP(){
        return solicitudPPP.obtenerTodo();
    }

}
