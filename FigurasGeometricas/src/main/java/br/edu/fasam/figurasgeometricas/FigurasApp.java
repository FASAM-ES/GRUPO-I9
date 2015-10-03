/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.figurasgeometricas;

/**
 *
 * @author Renner
 */
public class FigurasApp {
    public static void main(String[] args) {
        
        Quadrado quadrado = new Quadrado(25);
        Imprimir("Área do quadrado: " + quadrado.calcularArea());
        Imprimir("Perímetro do quadrado: " + quadrado.calcularPerimetro());
   
        Retangulo retangulo = new Retangulo(5, 15);
        Imprimir(String.format("Retangulo - Base %.2f Altura %.2f", retangulo.getBase(), retangulo.getAltura()));        
        Imprimir(String.format("Area = %d", retangulo.getArea()));
        Imprimir(String.format("Perimetro = %d", retangulo.getPerimetro()));
        Imprimir(String.format("Diagonal  = %d ", retangulo.getDiagonal()));
        
        Circulo circulo = new Circulo(2.0);
        Imprimir("Calculo da área do circulo: " + circulo.calculaArea());
        Imprimir("Calculo do perímetro: " + circulo.calculaPerimentro());
        
        Triangulo triangulo = new Triangulo(10, 10, 15);
        Imprimir(String.format("Triangulo - Lado A: %d Lado B: %d Lado C: %d ", 
        triangulo.getLadoA(), triangulo.getLadoB(),triangulo.getLadoC()));        
        Imprimir(String.format("Area = %d", triangulo.calculeArea()));
        Imprimir(String.format("Perimetro = %d", triangulo.calculePerimetro()));        
    }
    
    private static void Imprimir(String texto)
    {
        System.out.println(texto);
    }
}
