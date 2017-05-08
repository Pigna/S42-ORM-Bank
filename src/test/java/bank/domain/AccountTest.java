/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.domain;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author myron
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class Account.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Account instance = new Account();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Account.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long Id = null;
        Account instance = new Account();
        instance.setId(Id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountNr method, of class Account.
     */
    @Test
    public void testGetAccountNr() {
        System.out.println("getAccountNr");
        Account instance = new Account();
        Long expResult = null;
        Long result = instance.getAccountNr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountNr method, of class Account.
     */
    @Test
    public void testSetAccountNr() {
        System.out.println("setAccountNr");
        Long accountNr = null;
        Account instance = new Account();
        instance.setAccountNr(accountNr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class Account.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Account instance = new Account();
        Long expResult = null;
        Long result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBalance method, of class Account.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        Long balance = null;
        Account instance = new Account();
        instance.setBalance(balance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThreshold method, of class Account.
     */
    @Test
    public void testGetThreshold() {
        System.out.println("getThreshold");
        Account instance = new Account();
        Long expResult = null;
        Long result = instance.getThreshold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThreshold method, of class Account.
     */
    @Test
    public void testSetThreshold() {
        System.out.println("setThreshold");
        Long threshold = null;
        Account instance = new Account();
        instance.setThreshold(threshold);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Account.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Long amount = null;
        Account instance = new Account();
        Boolean expResult = null;
        Boolean result = instance.add(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
