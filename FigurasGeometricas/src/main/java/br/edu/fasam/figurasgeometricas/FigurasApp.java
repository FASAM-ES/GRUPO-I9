package br.edu.fasam.figurasgeometricas;

public class FigurasApp {

    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo(5, 15);
        System.out.printf("Retangulo - Base %.2f Altura %.2f\n", retangulo.getBase(), retangulo.getAltura());        
        System.out.printf("Area = %.2f\n", retangulo.getArea());
        System.out.printf("Perimetro = %.2f\n", retangulo.getPerimetro());
        System.out.printf("Diagonal  = %.2f\n ", retangulo.getDiagonal());
    }
}
