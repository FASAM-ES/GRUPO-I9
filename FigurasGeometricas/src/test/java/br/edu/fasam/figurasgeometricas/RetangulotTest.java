package br.edu.fasam.figurasgeometricas;

import junit.framework.TestCase;

public class RetangulotTest extends TestCase {

    private Retangulo retangulo;

    public RetangulotTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        retangulo = new Retangulo(15, 5);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCalcularArea() {
        assertEquals(75, retangulo.getArea());
        assertFalse("Calculo incorreto", retangulo.getArea() == 76);
    }

    public void testCalcularPerimetro() {
        assertEquals(40, retangulo.getPerimetro());
        assertFalse("Calculo incorreto", retangulo.getPerimetro() == 41);
    }

    public void testCalcularDiagonal() {
        assertEquals(15, retangulo.getDiagonal());
        assertFalse("Calculo incorreto", retangulo.getDiagonal() == 16);
    }
}
