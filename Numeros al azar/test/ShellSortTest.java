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
public class ShellSortTest {
    
    public ShellSortTest() {
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
     * Test of main method, of class ShellSort.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        ShellSort.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertionSortNew method, of class ShellSort.
     */
    @Test
    public void testInsertionSortNew() {
        System.out.println("insertionSortNew");
        int[] arr = null;
        int gap = 0;
        ShellSort.insertionSortNew(arr, gap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffleArray method, of class ShellSort.
     */
    @Test
    public void testShuffleArray() throws Exception {
        System.out.println("shuffleArray");
        int[] ar = null;
        ShellSort.shuffleArray(ar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
