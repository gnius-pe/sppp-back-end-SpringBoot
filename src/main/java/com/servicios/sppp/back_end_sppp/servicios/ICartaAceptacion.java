package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.CartaACeptacion;

import java.util.List;

public interface ICartaAceptacion {
    public List<CartaACeptacion> obtenerTodo();

    public CartaACeptacion guardar(CartaACeptacion cartaACeptacion);

    public CartaACeptacion obtenerPorId(long id);

    public void eliminar(long id);
}
