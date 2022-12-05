package com.servicios.sppp.back_end_sppp.controladores;

import com.servicios.sppp.back_end_sppp.modelos.CartaACeptacion;
import com.servicios.sppp.back_end_sppp.servicios.CartaAceptacionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/beta/carta-aceptacion")
public class CartaAceptacionControlador {
    @Autowired
    CartaAceptacionImpl servicioCartaAceptacion;

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @GetMapping("/cartas-de-aceptaciones")
    public List<CartaACeptacion> obtenerTodoCartasAceptacion(){
        return servicioCartaAceptacion.obtenerTodo();
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @PostMapping("/guardar")
    public ResponseEntity<CartaACeptacion> guardarCartaAceptacion(@RequestBody CartaACeptacion cartaACeptacion){
        CartaACeptacion nuevaCartaACeptacion = servicioCartaAceptacion.guardar(cartaACeptacion);
        return new ResponseEntity<>(nuevaCartaACeptacion, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @GetMapping("/{id}")
    public ResponseEntity<CartaACeptacion> ontenerCartaACpetacionPorId(@PathVariable long id){
        CartaACeptacion cartaACeptacion = servicioCartaAceptacion.obtenerPorId(id);
        return ResponseEntity.ok(cartaACeptacion);
    }
}
