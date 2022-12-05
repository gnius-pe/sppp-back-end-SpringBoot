package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.PreDocumentosPPP;

import java.util.List;

public interface IPreDocumentosPPP {

    public List<PreDocumentosPPP> obtenerTodo();

    public PreDocumentosPPP guardar(PreDocumentosPPP preDocumentosPPP);

    public PreDocumentosPPP obtenerPorId(long id);

    public void aliminar(long id);
}
