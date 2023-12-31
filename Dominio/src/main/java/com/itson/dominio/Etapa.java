// Copyright (c) Andrea Salazar Abigail Cárdenas, Alec Demian Santana Celaya, 
// Carlos Ariel Angulo Campos, Josue Emamnuel Flores Carballo, 
// Jesus Alejandro Izaguirre Gil. Licensed under the MIT Licence.
// See the LICENSE file in the repository root for full license text.
package com.itson.dominio;

import java.util.ArrayList;
import java.util.List;

public class Etapa {

    private String nombre;
    private int totalSemanas;
    private List<Mesociclo> mesociclos;
    private double volumen;
    private int volMin;
    private int volMax;
    private int instanciasMedio;
    
    public Etapa(String nombre, int totalSemanas, List<Mesociclo> mesociclos) {
        this.nombre = nombre;
        this.totalSemanas = totalSemanas;
        this.mesociclos = mesociclos;
        mesociclos= new ArrayList<>();
    }
    
    public Etapa(String nombre, int totalSemanas) {
        this.nombre = nombre;
        this.totalSemanas = totalSemanas;
        mesociclos= new ArrayList<>();
    }
    
    public Etapa(String nombre) {
        this.nombre = nombre;
        mesociclos= new ArrayList<>();
    }

    public Etapa() {
        mesociclos= new ArrayList<>();
    }

    public Etapa(int totalSemanas) {
        this.totalSemanas = totalSemanas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalSemanas() {
        return totalSemanas;
    }

    public void setTotalSemanas(int totalSemanas) {
        this.totalSemanas = totalSemanas;
    }

    public List<Mesociclo> getMesociclos() {
        return mesociclos;
    }

    public void setMesociclos(List<Mesociclo> mesociclos) {
        this.mesociclos = mesociclos;
    }

    public void addMesociclo(Mesociclo mesociclo){
        mesociclos.add(mesociclo);
    }
    
    public void removeMesociclo(Mesociclo mesociclo){
        mesociclos.remove(mesociclo);
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getVolMin() {
        return volMin;
    }

    public void setVolMin(int volMin) {
        this.volMin = volMin;
    }

    public int getVolMax() {
        return volMax;
    }

    public void setVolMax(int volMax) {
        this.volMax = volMax;
    }

    public int getInstanciasMedio() {
        return instanciasMedio;
    }

    public void setInstanciasMedio(int instanciasMedio) {
        this.instanciasMedio = instanciasMedio;
    }

    
    @Override
    public String toString() {
        return "Etapa{" + "nombre=" + nombre + ", totalSemanas=" + totalSemanas + '}';
    }

}
