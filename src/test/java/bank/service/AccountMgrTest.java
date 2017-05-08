/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.service;

import bank.domain.Account;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author myron
 */
public class AccountMgrTest {
    
    public AccountMgrTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createAccount method, of class AccountMgr.
     */
    @Test
    public void testCreateAccount() {
        System.out.println("createAccount");
        Long accountNr = null;
        AccountMgr instance = new AccountMgr();
        Account expResult = null;
        Account result = instance.createAccount(accountNr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccount method, of class AccountMgr.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        Long accountNr = null;
        AccountMgr instance = new AccountMgr();
        Account expResult = null;
        Account result = instance.getAccount(accountNr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
