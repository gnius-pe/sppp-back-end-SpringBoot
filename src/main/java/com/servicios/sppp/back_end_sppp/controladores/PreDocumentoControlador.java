package com.servicios.sppp.back_end_sppp.controladores;


import com.servicios.sppp.back_end_sppp.modelos.PreDocumentosPPP;
import com.servicios.sppp.back_end_sppp.servicios.PreDocumentoServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/beta/pre-documento")
public class PreDocumentoControlador {

    @Autowired
    PreDocumentoServicioImpl preDocumentoServicio;

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @GetMapping("/documentos")
    public List<PreDocumentosPPP> obtenerPreDocumentos(){
        return preDocumentoServicio.obtenerTodo();
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @PostMapping("/guardar")
    public ResponseEntity<PreDocumentosPPP> guardarPreDocumento(@RequestBody PreDocumentosPPP preDocumentosPPP){
        PreDocumentosPPP nuevoProDocumento = preDocumentoServicio.guardar(preDocumentosPPP);
        return new ResponseEntity<>(nuevoProDocumento, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @GetMapping("/{id}")
    public ResponseEntity<PreDocumentosPPP> obtenerPredocuementoPOrId(@PathVariable long id){
        PreDocumentosPPP preDocumentosPPP = preDocumentoServicio.obtenerPorId(id);
        return ResponseEntity.ok(preDocumentosPPP);
    }
}
