package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.FormatoF1;

import java.util.List;

public interface IFormatoF1 {

    public List<FormatoF1> obtenerTodo();

    public FormatoF1 guardar (FormatoF1 formatoF1);

    public FormatoF1 obtenerPorId(long id);

    public void eliminar(long id);
}
