/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko7teht1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author s718409
 */
public class StaattisiaMetodejaTest {
    
    public StaattisiaMetodejaTest() {
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

    @Test
    public void testYmpyranAla() {
        System.out.println("ympyranAla");
        double sade = 3.0;
        double expResult = 28.274333882308138;
        double result = StaattisiaMetodeja.ympyranAla(sade);
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testTarkistaSotu() {
        System.out.println("tarkistaSotu");
        String sotu = "051190-123X";
        boolean expResult = true;
        boolean result = StaattisiaMetodeja.tarkistaSotu(sotu);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMuunna() {
        System.out.println("muunna");
        String mjono = "testijono";
        String expResult = "Testijono";
        String result = StaattisiaMetodeja.muunna(mjono);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
