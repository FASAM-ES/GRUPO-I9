/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.figurasgeometricas;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 * @author sidine
 */
public class QuadradoTest extends TestCase {
    
    public QuadradoTest(String testName) {
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

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    
    public void testeQuadrado()
    {
        Quadrado quadrado = new Quadrado(12);
        Assert.assertEquals(144, (int)quadrado.calcularArea());
        Assert.assertEquals(48, (int)quadrado.calcularPerimetro());
        Assert.assertEquals(12, (int)quadrado.getLado());
    }
}
