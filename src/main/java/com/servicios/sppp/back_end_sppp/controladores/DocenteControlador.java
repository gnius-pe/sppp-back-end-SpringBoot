package com.servicios.sppp.back_end_sppp.controladores;

import com.servicios.sppp.back_end_sppp.modelos.Docente;
import com.servicios.sppp.back_end_sppp.servicios.DocenteServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/beta")
public class DocenteControlador {

    @Autowired
    DocenteServicioImpl docenteServicio;
    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @GetMapping("/docentes")
    public List<Docente> obtenerDocentes(){
        return docenteServicio.obtenerTodo();
    }
}
