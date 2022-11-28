package com.servicios.sppp.back_end_sppp.servicios;
import com.servicios.sppp.back_end_sppp.modelos.Docente;
import java.util.List;

public interface IServicioDocente {

    public List<Docente> obtenerTodo();
    public Docente guardar(Docente docente);

    public Docente obtenerPorId(long id);

    public void eliminar(long id);
}
