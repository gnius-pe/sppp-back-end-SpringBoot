package com.servicios.sppp.back_end_sppp.modelos;

import javax.persistence.*;

@Entity
@Table(name = "revision_pre_documentos_ppp")
public class RevisionPreDocumentoPPP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "id_docente")
    private long idDocente;

    @Column(name = "id_pre_documentos_ppp")
    private long idPreDocuementoPPP;

    @Column(name = "carrecciones")
    private String correcciones;

    public RevisionPreDocumentoPPP() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(long idDocente) {
        this.idDocente = idDocente;
    }

    public long getIdPreDocuementoPPP() {
        return idPreDocuementoPPP;
    }

    public void setIdPreDocuementoPPP(long idPreDocuementoPPP) {
        this.idPreDocuementoPPP = idPreDocuementoPPP;
    }

    public String getCorrecciones() {
        return correcciones;
    }

    public void setCorrecciones(String correcciones) {
        this.correcciones = correcciones;
    }
}
