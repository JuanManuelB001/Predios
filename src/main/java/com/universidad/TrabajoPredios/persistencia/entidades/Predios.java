package com.universidad.TrabajoPredios.persistencia.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "predios")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Predios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombrePredio;
    private int tamanoTerreno;
    private String duenoPredio;
    private String ubicacion;
    private LocalDateTime fechaRegistro;
}
