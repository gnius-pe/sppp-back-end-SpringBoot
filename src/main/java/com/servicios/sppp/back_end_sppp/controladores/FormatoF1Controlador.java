package com.servicios.sppp.back_end_sppp.controladores;


import com.servicios.sppp.back_end_sppp.modelos.FormatoF1;
import com.servicios.sppp.back_end_sppp.servicios.FormatoF1ServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/beta/formato-f1")
public class FormatoF1Controlador {

    @Autowired
    FormatoF1ServicioImpl formatoF1Servicio;

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @GetMapping("/formatos")
    public List<FormatoF1> obtenerFormatosF1(){
        return formatoF1Servicio.obtenerTodo();
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @PostMapping("/guardar")
    public ResponseEntity<FormatoF1> guardarFormatoF1(@RequestBody FormatoF1 formatoF1){
        FormatoF1 nuevoFormatoF1 = formatoF1Servicio.guardar(formatoF1);
        return new ResponseEntity<>(nuevoFormatoF1, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @GetMapping("formato/{id}")
    public ResponseEntity<FormatoF1> obtenerFormatoF1PorId(@PathVariable long id){
        FormatoF1 formatoF1 = formatoF1Servicio.obtenerPorId(id);
        return ResponseEntity.ok(formatoF1);
    }

}
