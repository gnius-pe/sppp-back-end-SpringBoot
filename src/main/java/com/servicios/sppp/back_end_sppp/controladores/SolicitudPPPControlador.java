package com.servicios.sppp.back_end_sppp.controladores;

import com.servicios.sppp.back_end_sppp.modelos.SolicitudPPP;
import com.servicios.sppp.back_end_sppp.servicios.SolicitudServicioPPPImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/beta/solicitudppp")
public class SolicitudPPPControlador {
    @Autowired
    SolicitudServicioPPPImpl servicioSolicitudPPP;

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @GetMapping("/solicitudes")
    public List<SolicitudPPP> obtenerSolicitudesPPP(){
        return servicioSolicitudPPP.obtenerTodo();
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @PostMapping("/guardar")
    public ResponseEntity<SolicitudPPP> guardarSolicitudPPP(@RequestBody SolicitudPPP solicitudPPP){
        SolicitudPPP nuevaSolicitudPPP = servicioSolicitudPPP.guardar(solicitudPPP);
        return new ResponseEntity<>(nuevaSolicitudPPP, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @GetMapping("/{id}")
    public ResponseEntity<SolicitudPPP> ontenerSolicitudPorId(@PathVariable long id){
        SolicitudPPP solicitudPPP = servicioSolicitudPPP.obtenerPorId(id);
        return ResponseEntity.ok(solicitudPPP);
    }
}
