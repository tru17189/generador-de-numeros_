/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ottoalexander
 */
public class RadixSortTest {
    
    public RadixSortTest() {
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
     * Test of main method, of class RadixSort.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RadixSort.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sort method, of class RadixSort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        Object[] list = null;
        Object[] expResult = null;
        Object[] result = RadixSort.sort(list);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxDigits method, of class RadixSort.
     */
    @Test
    public void testGetMaxDigits() {
        System.out.println("getMaxDigits");
        Object[] list = null;
        int expResult = 0;
        int result = RadixSort.getMaxDigits(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDigits method, of class RadixSort.
     */
    @Test
    public void testGetDigits() {
        System.out.println("getDigits");
        int i = 0;
        int expResult = 0;
        int result = RadixSort.getDigits(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDigitAt method, of class RadixSort.
     */
    @Test
    public void testGetDigitAt() {
        System.out.println("getDigitAt");
        int number = 0;
        int radix = 0;
        int expResult = 0;
        int result = RadixSort.getDigitAt(number, radix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
