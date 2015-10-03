package br.edu.fasam.figurasgeometricas;

public class Retangulo {

    private double altura;
    private double base;

    public Retangulo() {
        this.altura = 0;
        this.base = 0;
    }

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return 2 * (altura + base);
    }

    public double getArea() {
        return altura * base;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(altura,2) + Math.pow(base,2));
    }
}
