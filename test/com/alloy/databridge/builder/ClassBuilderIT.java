/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alloy.databridge.builder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Intern
 */
public class ClassBuilderIT {
    
    public ClassBuilderIT() {
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
     * Test of buildClass method, of class ClassBuilder.
     */
    @Test
    public void testBuildClass() {
        System.out.println("buildClass");
        ClassBuilder instance = new ClassBuilder();
        byte[] result = instance.buildClass();
        assertNotNull(result);
    }

    /**
     * Test of createClass method, of class ClassBuilder.
     */
    @Test
    public void testCreateClass() {
        System.out.println("createClass");
        String name = "";
        ClassBuilder instance = new ClassBuilder();
        instance.createClass(name);
        
        byte[] classByteVector = instance.buildClass();
        
        assertNotNull(classByteVector);
    }

    /**
     * Test of createField method, of class ClassBuilder.
     */
    @Test
    public void testCreateField() {
        System.out.println("createField");
        String name = "field1";
        String type = "Integer";
        ClassBuilder instance = new ClassBuilder();
        String className = "TestAddField";
        instance.createClass(className);
        instance.createField(name, type);
//        
        byte[] classByteVector = instance.buildClass();
               
        assertNotNull(classByteVector);
    }
    
}
