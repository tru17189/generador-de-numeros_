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
public class QuickSortTest {
    
    public QuickSortTest() {
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
     * Test of QuickSort1 method, of class QuickSort.
     */
    @Test
    public void testQuickSort1() {
        System.out.println("QuickSort1");
        int left = 0;
        int right = 0;
        QuickSort.QuickSort1(left, right);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of partitionIt method, of class QuickSort.
     */
    @Test
    public void testPartitionIt() {
        System.out.println("partitionIt");
        int left = 0;
        int right = 0;
        long pivot = 0L;
        int expResult = 0;
        int result = QuickSort.partitionIt(left, right, pivot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of swap method, of class QuickSort.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        int dex1 = 0;
        int dex2 = 0;
        QuickSort.swap(dex1, dex2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printSequence method, of class QuickSort.
     */
    @Test
    public void testPrintSequence() {
        System.out.println("printSequence");
        int[] sorted_sequence = null;
        QuickSort.printSequence(sorted_sequence);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class QuickSort.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        QuickSort.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
