package br.edu.fasam.figurasgeometricas;

import junit.framework.TestCase;

/**
 *
 * @author Renner
 */
public class TrianguloTest extends TestCase {
    
    public TrianguloTest(String testName) {
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

    public void testCalculeArea() {
        Triangulo triangulo = new Triangulo(10,10,15);
        
        assertEquals(40, (int)triangulo.calculeArea());
    }
}
