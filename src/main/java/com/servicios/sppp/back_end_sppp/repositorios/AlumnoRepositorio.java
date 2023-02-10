package com.servicios.sppp.back_end_sppp.repositorios;

import com.servicios.sppp.back_end_sppp.modelos.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno,Long> {
}
