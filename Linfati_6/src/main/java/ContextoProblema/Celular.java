/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContextoProblema;

/**
 *
 * @author gilio
 */
public class Celular {

    private String modelo;
    private double tamaño;

    public Celular(String modelo, double tamaño) {
        this.modelo = modelo;
        this.tamaño = tamaño;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getTamaño() {
        return this.tamaño;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Modelo = " + modelo + " ; Tamaño pantalla = " + tamaño + " pulgadas";
    }
}
