package br.edu.fasam.figurasgeometricas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;

/**
 *
 * @author Alex Silva
 */
public class RetangulotTest extends TestCase {
    
    public RetangulotTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testCalcularArea()
    {
        Retangulo retangulo = new Retangulo(15,5);
        assertEquals(75 , retangulo.getArea());
    }
    
    public void testCalcularPerimetro()
    {
        Retangulo retangulo = new Retangulo(15,5);
        assertEquals(40 , retangulo.getPerimetro());
    }    
    
    public void testCalcularDiagonal()
    {
        Retangulo retangulo = new Retangulo(15,5);
        assertEquals(15 , retangulo.getDiagonal());
    }       

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
