package com.servicios.sppp.back_end_sppp.modelos;

import javax.persistence.*;

@Entity
@Table(name = "pre_documentos_ppp")
public class PreDocumentosPPP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "id_alumno")
    private long idAlumno;

    @Column(name = "id_solicitud")
    private long idSolicitud;

    @Column(name = "id_carta_aceptacion")
    private long idCartaAceptacion;

    @Column(name = "id_formato_f1")
    private long idFormatoF1;

    @Column(name = "estate_documentos_ppp")
    private boolean estadoDocumentoPPP;

    public PreDocumentosPPP() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public long getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public long getIdCartaAceptacion() {
        return idCartaAceptacion;
    }

    public void setIdCartaAceptacion(long idCartaAceptacion) {
        this.idCartaAceptacion = idCartaAceptacion;
    }

    public long getIdFormatoF1() {
        return idFormatoF1;
    }

    public void setIdFormatoF1(long idFormatoF1) {
        this.idFormatoF1 = idFormatoF1;
    }

    public boolean isEstadoDocumentoPPP() {
        return estadoDocumentoPPP;
    }

    public void setEstadoDocumentoPPP(boolean estadoDocumentoPPP) {
        this.estadoDocumentoPPP = estadoDocumentoPPP;
    }
}
