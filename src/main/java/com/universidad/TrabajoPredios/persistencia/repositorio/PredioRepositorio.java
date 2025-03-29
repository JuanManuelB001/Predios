package com.universidad.TrabajoPredios.persistencia.repositorio;

import com.universidad.TrabajoPredios.persistencia.entidades.Predios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredioRepositorio extends JpaRepository<Predios, Long> {
}
