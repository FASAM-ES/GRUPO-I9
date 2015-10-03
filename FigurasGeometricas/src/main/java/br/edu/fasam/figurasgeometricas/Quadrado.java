/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.figurasgeometricas;

/**
 *
 * @author sidine
 */
public class Quadrado {
    private Integer lado;

    /**
     * @return the lado
     */
    public Integer getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(Integer lado) {
        this.lado = lado;
    }
    
    public Integer calcularArea()
    {
        return lado * lado;
    }
    
    public Integer calcularPerimetro()
    {
        return lado * 4;
    }
    
    public Quadrado(Integer pLado){
        lado = pLado;
    }
}
