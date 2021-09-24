/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CaesTest {
     Caes instance; 
    public CaesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
     instance = new Caes("wasd",10);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testFalar() {
        System.out.println("falar");
        String mensagem = "";
        String expResult = "Meu nome é " + "wasd" + ", " + mensagem;
        String result = instance.falar(mensagem);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testAndar() {
        System.out.println("andar");
        long num_passos = 2000;
        boolean expResult = false;
        boolean result = instance.andar(num_passos);
        assertEquals(expResult, result);
        assertEquals("cansado", instance.humor);
        
    }

    @Test
    public void testComer() {
        System.out.println("comer");
        instance.comer();
        assertEquals("satisfeito", instance.humor);
    }
   
    @Test
    public void testDormir() {
        System.out.println("dormir");
        instance.qtd_passos=2000;
        boolean expResult = true;
        boolean result = instance.dormir();
        assertEquals(expResult, result);
        assertEquals( "animado", instance.humor);
        
    }
    
}
