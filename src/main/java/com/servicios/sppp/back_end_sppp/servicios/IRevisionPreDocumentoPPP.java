package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.RevisionPreDocumentoPPP;

import java.util.List;

public interface IRevisionPreDocumentoPPP {
    public List<RevisionPreDocumentoPPP> obtenerTodo();

    public RevisionPreDocumentoPPP guardar (RevisionPreDocumentoPPP revisionPreDocumentoPPP);

    public RevisionPreDocumentoPPP obtenerPorId(long id);

    public void eliminar(long id);
}
