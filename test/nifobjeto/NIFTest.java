/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifobjeto;

import nifexceptions.NifDigitosException;
import nifexceptions.NifLetraException;
import nifexceptions.NifLetraExisteException;
import nifexceptions.NifTamanoException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam118
 */
public class NIFTest {
    
    public NIFTest() {
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
    public void testConstructor() throws NifLetraException, NifLetraExisteException, NifDigitosException, NifTamanoException {
        System.out.println("CONSTRUCTOR");
        NIF instance = new NIF("54130769q");
        assertNotNull(instance);
    }
    
    @Test (expected = NifTamanoException.class)
    public void testConstructorTamanoMalo() throws NifLetraException, NifLetraExisteException, NifDigitosException, NifTamanoException {
        System.out.println("CONSTRUCTOR Tamano malo");
        NIF instance = new NIF("54130769q234se");
    }
    
    @Test (expected = NifTamanoException.class)
    public void testConstructorTamanoCorto() throws NifLetraException, NifLetraExisteException, NifDigitosException, NifTamanoException {
        System.out.println("CONSTRUCTOR Tamano malo");
        NIF instance = new NIF("54130");
    }
    
    /**
     * Test of getNif method, of class NIF.
     */
    @Test
    public void testGetNif() throws NifLetraException, NifLetraExisteException, NifDigitosException, NifTamanoException {
        System.out.println("getNif");
        NIF instance = new NIF("54130769q");
        String expResult = "54130769q";
        String result = instance.getNif();
        assertEquals(expResult, result);
    }
    
    
    
}
