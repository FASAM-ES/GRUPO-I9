/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.figurasgeometricas;

/**
 *
 * @author JulianoPinheiro
 */
public class Circulo {
    
    private Double raio;
    private final Double pi = 3.14;
    
    public Circulo(Double raio){
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
    public Double calculaArea(){
        return pi * (raio * raio);
    }
    
    public Double calculaPerimentro(){
        return (2 * pi) * raio;
    }
}
