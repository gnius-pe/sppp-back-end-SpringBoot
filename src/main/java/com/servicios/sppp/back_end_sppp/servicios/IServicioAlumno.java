package com.servicios.sppp.back_end_sppp.servicios;

import com.servicios.sppp.back_end_sppp.modelos.Alumno;

import java.util.List;

public interface IServicioAlumno {

    public List<Alumno> obtenerTodo();

    public Alumno guardar (Alumno alumno);

    public Alumno obtenerPorId(long id);

    public void eliminar(long id);
}
