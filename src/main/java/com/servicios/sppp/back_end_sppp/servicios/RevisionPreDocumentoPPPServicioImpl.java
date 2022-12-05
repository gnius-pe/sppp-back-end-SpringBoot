package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.RevisionPreDocumentoPPP;
import com.servicios.sppp.back_end_sppp.repositorios.RevisionPreDocumentoPPPRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RevisionPreDocumentoPPPServicioImpl implements IRevisionPreDocumentoPPP{

    @Autowired
    RevisionPreDocumentoPPPRepositorio revisionPreDocumentoPPPRepositorio;

    @Override
    public List<RevisionPreDocumentoPPP> obtenerTodo() {
        return revisionPreDocumentoPPPRepositorio.findAll();
    }

    @Override
    public RevisionPreDocumentoPPP guardar(RevisionPreDocumentoPPP revisionPreDocumentoPPP) {
        return revisionPreDocumentoPPPRepositorio.save(revisionPreDocumentoPPP);
    }

    @Override
    public RevisionPreDocumentoPPP obtenerPorId(long id) {
        return revisionPreDocumentoPPPRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        revisionPreDocumentoPPPRepositorio.deleteById(id);
    }
}
