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
public class Triangulo {
   
    private Integer ladoA;
    private Integer ladoB;
    private Integer ladoC;        

    public Integer getLadoA() {
        return ladoA;
    }

    public void setLadoA(Integer ladoA) {
        this.ladoA = ladoA;
    }

    public Integer getLadoB() {
        return ladoB;
    }

    public void setLadoB(Integer ladoB) {
        this.ladoB = ladoB;
    }

    public Integer getLadoC() {
        return ladoC;
    }

    public void setLadoC(Integer ladoC) {
        this.ladoC = ladoC;
    }
  
    public Integer calculePerimetro()
    {               
         return ladoA + ladoB + ladoC;       
    }
    
     public Integer calculeArea()
    {      
        //p = (a +  b + c) /2
        //A = √p.(p-a).(p-b).(p-c)
        double semiperimetro = calculePerimetro() / 2;
        return  (int) (Math.sqrt(semiperimetro) * (semiperimetro - ladoA ) * 
                (semiperimetro - ladoB ) * (semiperimetro - ladoC ));
    }
}
