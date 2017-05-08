/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.dao;

import bank.domain.Account;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author myron
 */
public class AccountDAOJPAImplTest {
    
    public AccountDAOJPAImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of create method, of class AccountDAOJPAImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Account account = null;
        AccountDAOJPAImpl instance = null;
        instance.create(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class AccountDAOJPAImpl.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Account account = null;
        AccountDAOJPAImpl instance = null;
        instance.edit(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AccountDAOJPAImpl.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Account account = null;
        AccountDAOJPAImpl instance = null;
        instance.remove(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AccountDAOJPAImpl.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Long id = null;
        AccountDAOJPAImpl instance = null;
        Account expResult = null;
        Account result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByAccountNr method, of class AccountDAOJPAImpl.
     */
    @Test
    public void testFindByAccountNr() {
        System.out.println("findByAccountNr");
        Long accountNr = null;
        AccountDAOJPAImpl instance = null;
        Account expResult = null;
        Account result = instance.findByAccountNr(accountNr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class AccountDAOJPAImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        AccountDAOJPAImpl instance = null;
        List<Account> expResult = null;
        List<Account> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class AccountDAOJPAImpl.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        AccountDAOJPAImpl instance = null;
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
