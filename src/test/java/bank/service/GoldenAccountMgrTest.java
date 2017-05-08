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
public class GoldenAccountMgrTest {
    
    public GoldenAccountMgrTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createGoldenAccount method, of class GoldenAccountMgr.
     */
    @Test
    public void testCreateGoldenAccount() {
        System.out.println("createGoldenAccount");
        Long accountNr = null;
        GoldenAccountMgr instance = new GoldenAccountMgr();
        Account expResult = null;
        Account result = instance.createGoldenAccount(accountNr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updrade2GoldenAccount method, of class GoldenAccountMgr.
     */
    @Test
    public void testUpdrade2GoldenAccount() {
        System.out.println("updrade2GoldenAccount");
        Long accountNr = null;
        GoldenAccountMgr instance = new GoldenAccountMgr();
        Account expResult = null;
        Account result = instance.updrade2GoldenAccount(accountNr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
