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
import org.junit.Test;
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
     * Test of opration method, of class Aritmetic.
     */
    @Test
    public void testOpration() {
        System.out.println("opration");
        String typeOper = "Plus";
        double v1 = 3.4;
        double v2 = 2.2;
        Aritmetic instance = new Aritmetic();
        double expResult = 5.6;
        double result = instance.opration(typeOper, v1, v2);
        assertEquals(expResult, result, 0.0);
        if (result != expResult){
         fail("The test case is a prototype.");
        }
    }
    
}
