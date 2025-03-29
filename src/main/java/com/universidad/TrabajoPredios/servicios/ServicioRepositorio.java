package com.universidad.TrabajoPredios.servicios;

import com.universidad.TrabajoPredios.persistencia.entidades.Predios;
import com.universidad.TrabajoPredios.persistencia.repositorio.PredioRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicioRepositorio {

    PredioRepositorio predioRepo;
    public Predios agregar(Predios predio){
        return predioRepo.save(predio);
    }
    /*
    public List<Predios> mostrarTodos(){
        return  predioRepo.findAll();
    }

     */
}
