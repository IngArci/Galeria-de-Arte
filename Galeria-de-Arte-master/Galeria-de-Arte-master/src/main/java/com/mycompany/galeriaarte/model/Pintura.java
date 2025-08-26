/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.galeriaarte.model;

import java.time.LocalDate;

/**
 *
 * @author Julian Aranguren-2220231103
 */
public class Pintura extends ObraArte{
    private String tecnica;
    private double dimensiones;

    public Pintura(int idObra, String titulo, String autor, LocalDate anioCreacion, double precio, String estado) {
        super(idObra, titulo, autor, anioCreacion, precio, estado);
        this.tecnica = tecnica;
        this.dimensiones = dimensiones;
        
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public double getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(double dimensiones) {
         if (dimensiones < 0) {
            throw new IllegalArgumentException(" no pueden ser negativo");
        }
        this.dimensiones = dimensiones;
    }
    
    
}
