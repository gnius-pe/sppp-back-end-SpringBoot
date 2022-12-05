package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.PreDocumentosPPP;
import com.servicios.sppp.back_end_sppp.repositorios.PreDocumentosPPPRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreDocumentoServicioImpl implements IPreDocumentosPPP{

    @Autowired
    PreDocumentosPPPRepositorio preDocumentosPPPRepositorio;

    @Override
    public List<PreDocumentosPPP> obtenerTodo() {
        return preDocumentosPPPRepositorio.findAll();
    }

    @Override
    public PreDocumentosPPP guardar(PreDocumentosPPP preDocumentosPPP) {
        return preDocumentosPPPRepositorio.save(preDocumentosPPP);
    }

    @Override
    public PreDocumentosPPP obtenerPorId(long id) {
        return preDocumentosPPPRepositorio.findById(id).orElse(null);
    }

    @Override
    public void aliminar(long id) {
        preDocumentosPPPRepositorio.deleteById(id);
    }
}
