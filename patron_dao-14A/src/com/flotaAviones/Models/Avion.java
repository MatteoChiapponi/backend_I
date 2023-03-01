package com.flotaAviones.Models;

import java.time.LocalDate;

public class Avion {
    private Long Id;
    private String marca;
    private String modelo;
    private String matricula;
    private LocalDate inicioServicio;

    public Avion(Long id, String marca, String modelo, String matricula, LocalDate inicioServicio) {
        Id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.inicioServicio = inicioServicio;
    }

    public Avion(String marca, String modelo, String matricula, LocalDate inicioServicio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.inicioServicio = inicioServicio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getInicioServicio() {
        return inicioServicio;
    }

    public void setId(Long id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "Id=" + Id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", inicioServicio=" + inicioServicio +
                '}';
    }
}
