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
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
   
        Retangulo retangulo = new Retangulo(5, 15);
        System.out.println(String.format("Retangulo - Base %.2f Altura %.2f", retangulo.getBase(), retangulo.getAltura()));        
        System.out.println(String.format("Area = %d", retangulo.getArea()));
        System.out.println(String.format("Perimetro = %d", retangulo.getPerimetro()));
        System.out.println(String.format("Diagonal  = %d ", retangulo.getDiagonal()));
        
        Circulo circulo = new Circulo(2.0);
        System.out.println("Calculo da área do circulo: " + circulo.calculaArea());
        System.out.println("Calculo do perímetro: " + circulo.calculaPerimentro());
        
        Triangulo triangulo = new Triangulo(10, 10, 15);
        System.out.println(String.format("Triangulo - Lado A: %d Lado B: %d Lado C: %d ",
        triangulo.getLadoA(), triangulo.getLadoB(),triangulo.getLadoC()));        
        System.out.println(String.format("Area = %d", triangulo.calculeArea()));
        System.out.println(String.format("Perimetro = %d", triangulo.calculePerimetro()));
        
    }
}
