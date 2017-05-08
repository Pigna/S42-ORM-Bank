/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author myron
 */
public class FinancialMgrTest {
    
    public FinancialMgrTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of transfer method, of class FinancialMgr.
     */
    @Test
    public void testTransfer() {
        System.out.println("transfer");
        Long fromAccountNr = null;
        Long toAccountNr = null;
        Long amount = null;
        FinancialMgr instance = new FinancialMgr();
        Boolean expResult = null;
        Boolean result = instance.transfer(fromAccountNr, toAccountNr, amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deposit method, of class FinancialMgr.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        Long accountNr = null;
        Long amount = null;
        FinancialMgr instance = new FinancialMgr();
        Boolean expResult = null;
        Boolean result = instance.deposit(accountNr, amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withDraw method, of class FinancialMgr.
     */
    @Test
    public void testWithDraw() {
        System.out.println("withDraw");
        Long accountNr = null;
        Long amount = null;
        FinancialMgr instance = new FinancialMgr();
        Boolean expResult = null;
        Boolean result = instance.withDraw(accountNr, amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
