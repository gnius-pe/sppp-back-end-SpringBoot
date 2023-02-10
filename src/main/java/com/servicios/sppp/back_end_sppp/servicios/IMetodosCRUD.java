package com.servicios.sppp.back_end_sppp.servicios;

import java.util.List;

public interface IMetodosCRUD<T> {
    public List<T> obtenerTodo();

    public T guardar(T t);

    public  T obtenerPorId(long id);

    public void eliminar (long id);
}
