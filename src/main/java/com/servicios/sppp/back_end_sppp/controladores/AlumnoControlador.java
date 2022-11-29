package com.servicios.sppp.back_end_sppp.controladores;

import com.servicios.sppp.back_end_sppp.modelos.Alumno;
import com.servicios.sppp.back_end_sppp.servicios.UsuarioServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/beta")
public class AlumnoControlador {
    @Autowired
    UsuarioServicioImpl usuarioServicio;

    @GetMapping("/alumnos")
    public List<Alumno> obtenerAlumnos(){
        return usuarioServicio.obtenerTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<Alumno> guardarAlumno(@RequestBody Alumno alumno){
        Alumno nuevoCliente = usuarioServicio.guardar(alumno);
        return new ResponseEntity<>(nuevoCliente, HttpStatus.CREATED);
    }

    @GetMapping("/alumno/{id}")
    public ResponseEntity<Alumno> obtenerAlumnoId(@PathVariable long id){
        Alumno usuarioId = usuarioServicio.obtenerPorId(id);
        return ResponseEntity.ok(usuarioId);
    }

    @PutMapping("/alumno/{id}")
    public ResponseEntity<Alumno> actualizar(@PathVariable long id, @RequestBody Alumno usuario){
        Alumno usuarioId = usuarioServicio.obtenerPorId(id);
        usuarioId.setNombre(usuario.getNombre());
        usuarioId.setApellido(usuario.getApellido());
        usuarioId.setEmail(usuario.getEmail());
        usuarioId.setCodigo(usuario.getCodigo());
        usuarioId.setDireccionActual(usuario.getDireccionActual());
        usuarioId.setNumeroCelular(usuario.getNumeroCelular());
        usuarioId.setPasword(usuario.getPasword());
        Alumno usuarioActualizado = usuarioServicio.guardar(usuarioId);
        return new ResponseEntity<Alumno>(usuarioActualizado,HttpStatus.CREATED);
    }

    @DeleteMapping("/alumno/{id}")
    public ResponseEntity<HashMap<String,Boolean>> eliminarAlumno(@PathVariable long id){
        this.usuarioServicio.eliminar(id);
        HashMap <String,Boolean> estadoUsuarioEliminado = new HashMap<>();
        estadoUsuarioEliminado.put("eliminado",true);
        return ResponseEntity.ok(estadoUsuarioEliminado);
    }
}
