/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.jarc.quoteeasy4all.calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author jruiz
 */
public class AritmeticTest {
    
    public AritmeticTest() {
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
     * Test of Plus method, of class Aritmetic.
     */
    @org.junit.Test
    public void testPlus() {
        System.out.println("Plus");
        double v1 = 4.5;
        double v2 = 3.2;
        Aritmetic instance = new Aritmetic();
        double expResult = 7.7;
        double result = instance.Plus(v1, v2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
         fail("The test case is a prototype.");
        }
    }
    
}
