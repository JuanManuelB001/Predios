package com.universidad.TrabajoPredios.controladores;


import com.universidad.TrabajoPredios.persistencia.entidades.Predios;
import com.universidad.TrabajoPredios.servicios.ServicioRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/predios")
@AllArgsConstructor
public class PredioControlador {
    ServicioRepositorio servicioRepo;

    @GetMapping("/")
    public List<Predios> listar(){
        return servicioRepo.mostrarTodos();
    }

    @PostMapping("/")
    public Predios agregar(@RequestBody Predios predio){
        return servicioRepo.agregar(predio);
    }
}
