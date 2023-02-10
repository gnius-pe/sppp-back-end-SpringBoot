package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.CartaACeptacion;
import com.servicios.sppp.back_end_sppp.repositorios.CartaAceptacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaAceptacionImpl implements IMetodosCRUD<CartaACeptacion>{

    @Autowired
    CartaAceptacionRepositorio cartaAceptacionRepositorio;

    @Override
    public List<CartaACeptacion> obtenerTodo() {
        return cartaAceptacionRepositorio.findAll();
    }

    @Override
    public CartaACeptacion guardar(CartaACeptacion cartaACeptacion) {
        return cartaAceptacionRepositorio.save(cartaACeptacion);
    }

    @Override
    public CartaACeptacion obtenerPorId(long id) {
        return cartaAceptacionRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        cartaAceptacionRepositorio.deleteById(id);
    }
}
