package com.servicios.sppp.back_end_sppp.repositorios;

import com.servicios.sppp.back_end_sppp.modelos.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepositorio extends JpaRepository<Docente,Long> {
}
