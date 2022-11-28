package com.servicios.sppp.back_end_sppp.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class SolicitudPPP implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titutlo;

    private String asunto;

    boolean estadoSolicitudPPP;

    public SolicitudPPP() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitutlo() {
        return titutlo;
    }

    public void setTitutlo(String titutlo) {
        this.titutlo = titutlo;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public boolean isEstadoSolicitudPPP() {
        return estadoSolicitudPPP;
    }

    public void setEstadoSolicitudPPP(boolean estadoSolicitudPPP) {
        this.estadoSolicitudPPP = estadoSolicitudPPP;
    }
}
