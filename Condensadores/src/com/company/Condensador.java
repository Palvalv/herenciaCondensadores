package com.company;

import java.util.Objects;

public abstract class Condensador implements Comparable{
    //Atributos
    protected int capacitancia;
    protected String numSerie;

    //Constructores
    protected Condensador() {
        this.capacitancia = 0;
        this.numSerie = "DefaultSerialNumber";
    }

    protected Condensador (int capacitancia, String numSerie){
        this();
        setCapacitancia(capacitancia);
        setNumSerie(numSerie);
    }

    //Getters y Setters
    public int getCapacitancia() {
        return capacitancia;
    }

    public String getNumSerie() {
        return numSerie;
    }

    protected void setCapacitancia(int capacitancia) {
        this.capacitancia = capacitancia;
    }

    protected void setNumSerie(String numSerie) {
        if (numSerie.length() == 8 && contieneSoloNumerosYLetras(numSerie)) {
            this.numSerie = numSerie;
        }
    }

    // Metodos
    public String toString() {
        return "Condensador{" +
                "capacitancia=" + capacitancia +
                ", numSerie='" + numSerie + '\'' +
                '}';
    }

    public boolean equals(Object obj){
        Condensador otro = (Condensador) obj;
        return (this.capacitancia == otro.capacitancia) && (this.numSerie.equals(otro.numSerie));
    }

    public int compareTo(Object obj) {
        Condensador otro = (Condensador) obj;
//        if(this.capacitancia < otro.capacitancia){
//            return -1;
//        } else if (this.capacitancia == otro.capacitancia){
//            return 0;
//        }
//        return 1;
        return this.capacitancia - otro.capacitancia;
    }

    private boolean contieneSoloNumerosYLetras (String cadena){
        char res = '0';
        for (int i = 0; i < cadena.length(); i++) {
            res = cadena.charAt(i);
            if(!((res > 47 && res < 58)|| (res > 64 && res < 91) || (res > 96 && res < 123))){
                return false;
            }
        }
        return true;
    }
}
