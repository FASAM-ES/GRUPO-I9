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
        System.out.printf("Retangulo - Base %.2f Altura %.2f\n", retangulo.getBase(), retangulo.getAltura());        
        System.out.printf("Area = %d\n", retangulo.getArea());
        System.out.printf("Perimetro = %d\n", retangulo.getPerimetro());
        System.out.printf("Diagonal  = %d\n ", retangulo.getDiagonal());
        
        Circulo circulo = new Circulo(2.0);
        System.out.println("Calculo da área do circulo: " + circulo.calculaArea());
        System.out.println("Calculo do perímetro: " + circulo.calculaPerimentro());
        
        Triangulo triangulo = new Triangulo(10, 10, 15);
        System.out.printf("Triangulo - Lado A: %d Lado B: %d Lado C: %d \n",
        triangulo.getLadoA(), triangulo.getLadoB(),triangulo.getLadoC());        
        System.out.printf("Area = %d\n", triangulo.calculeArea());
        System.out.printf("Perimetro = %d\n", triangulo.calculePerimetro());
        
    }
}
