package br.edu.fasam.test;

import br.edu.fasam.figurasgeometricas.Circulo;
import junit.framework.TestCase;

/**
 *
 * @author JulianoPinheiro
 */
public class CirculoTest extends TestCase {
    
    public CirculoTest(String testName) {
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
    
    public void testCalculaArea(){
        Circulo circulo = new Circulo(2.0);
        assertEquals(12.56, circulo.calculaArea());
    }
    
    public void testCalculaPerimetro(){
        Circulo circulo = new Circulo(2.0);
        assertEquals(12.56, circulo.calculaPerimentro());
    }
    
     public void testCalculaArea3(){
        Circulo circulo = new Circulo(3.0);
        assertEquals(28.26, circulo.calculaArea());
    }
    
    public void testCalculaPerimetro3(){
        Circulo circulo = new Circulo(3.0);
        assertEquals(18.84, circulo.calculaPerimentro());
    }
}
