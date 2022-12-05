package com.servicios.sppp.back_end_sppp.controladores;

import com.servicios.sppp.back_end_sppp.modelos.RevisionPreDocumentoPPP;
import com.servicios.sppp.back_end_sppp.servicios.RevisionPreDocumentoPPPServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/beta/revision-pre-documento")
public class RevisionPreDocumentoPPPControlador {
    @Autowired
    RevisionPreDocumentoPPPServicioImpl revisionPreDocumentoPPPServicio;

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @GetMapping("/revisiones")
    public List<RevisionPreDocumentoPPP> obtenerRevisionDocumentosPPP(){
        return revisionPreDocumentoPPPServicio.obtenerTodo();
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @PostMapping("/guardar")
    public ResponseEntity<RevisionPreDocumentoPPP> guardarRevisionPreDocuemntoPPP(@RequestBody RevisionPreDocumentoPPP revisionPreDocumentoPPP){
        RevisionPreDocumentoPPP nuevoRevisionPreDocumento = revisionPreDocumentoPPPServicio.guardar(revisionPreDocumentoPPP);
        return new ResponseEntity<>(nuevoRevisionPreDocumento, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = {"http://127.0.0.1:5173","https://sysppp.netlify.app/"})
    @GetMapping("/{id}")
    public ResponseEntity<RevisionPreDocumentoPPP> obtenerRevisionPPPDocumentoPorId(@PathVariable long id){
        RevisionPreDocumentoPPP revisionPreDocumentoPPP = revisionPreDocumentoPPPServicio.obtenerPorId(id);
        return ResponseEntity.ok(revisionPreDocumentoPPP);
    }
}
