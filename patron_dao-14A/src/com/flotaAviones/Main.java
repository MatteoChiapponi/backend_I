package com.flotaAviones;

import com.flotaAviones.Models.Avion;
import com.flotaAviones.Services.AvionesService;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaInicio = LocalDate.of(2022,02,23);
        Avion avion = new Avion("mercedez","2022","uox925",fechaInicio);
        AvionesService avionesService = new AvionesService();
        System.out.println(avionesService.registrarAvion(avion).toString());
        System.out.println(avionesService.buscarAvion(2L));
        avionesService.eliminarAvion(1l);
        List<Avion> aviones=avionesService.buscarTodosLosAviones();
        for (Avion a:aviones) {
            System.out.println(a.toString());
        }
    }
}
