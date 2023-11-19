/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasUnitarias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vicky
 */
public class ComponenteGrafTest {
    
    public ComponenteGrafTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of supCircunferencia method, of class ComponenteGraf.
     */
    @Test
    public void testSupCircunferencia() {
        System.out.println("Prueba supCircunferencia");
        double r = 3;
        ComponenteGraf instance = new ComponenteGraf();
        double expResult = 28.274333882308138;
        double result = instance.supCircunferencia(r);
        assertEquals(expResult, result,0.0);
        
    }
    
}
