/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jokee.app.service;

import com.jokee.app.pojo.Jokee;
import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ann
 */
public class JokeeFacadeRESTTest {
    
    public JokeeFacadeRESTTest() {
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
     * Test of create method, of class JokeeFacadeREST.
     */
    @org.junit.Test
    public void testCreate() {
        System.out.println("create");
        Jokee entity = null;
        JokeeFacadeREST instance = new JokeeFacadeREST();
        instance.create(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class JokeeFacadeREST.
     */
    @org.junit.Test
    public void testEdit() {
        System.out.println("edit");
        Integer id = null;
        Jokee entity = null;
        JokeeFacadeREST instance = new JokeeFacadeREST();
        instance.edit(id, entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class JokeeFacadeREST.
     */
    @org.junit.Test
    public void testRemove() {
        System.out.println("remove");
        Integer id = null;
        JokeeFacadeREST instance = new JokeeFacadeREST();
        instance.remove(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class JokeeFacadeREST.
     */
    @org.junit.Test
    public void testFind() {
        System.out.println("find");
        Integer id = null;
        JokeeFacadeREST instance = new JokeeFacadeREST();
        Jokee expResult = null;
        Jokee result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class JokeeFacadeREST.
     */
    @org.junit.Test
    public void testFindAll() {
        System.out.println("findAll");
        JokeeFacadeREST instance = new JokeeFacadeREST();
        List<Jokee> expResult = null;
        List<Jokee> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class JokeeFacadeREST.
     */
    @org.junit.Test
    public void testFindRange() {
        System.out.println("findRange");
        Integer from = null;
        Integer to = null;
        JokeeFacadeREST instance = new JokeeFacadeREST();
        List<Jokee> expResult = null;
        List<Jokee> result = instance.findRange(from, to);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countREST method, of class JokeeFacadeREST.
     */
    @org.junit.Test
    public void testCountREST() {
        System.out.println("countREST");
        JokeeFacadeREST instance = new JokeeFacadeREST();
        String expResult = "";
        String result = instance.countREST();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increaseLike method, of class JokeeFacadeREST.
     */
    @org.junit.Test
    public void testIncreaseLike() {
        System.out.println("increaseLike");
        int id = 0;
        JokeeFacadeREST instance = new JokeeFacadeREST();
        String expResult = "";
        String result = instance.increaseLike(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increaseDislike method, of class JokeeFacadeREST.
     */
    @org.junit.Test
    public void testIncreaseDislike() {
        System.out.println("increaseDislike");
        int id = 0;
        JokeeFacadeREST instance = new JokeeFacadeREST();
        String expResult = "";
        String result = instance.increaseDislike(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntityManager method, of class JokeeFacadeREST.
     */
    @org.junit.Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        JokeeFacadeREST instance = new JokeeFacadeREST();
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
