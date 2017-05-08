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
public class AccountDAOTest {
    
    public AccountDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of count method, of class AccountDAO.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        AccountDAO instance = new AccountDAOImpl();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AccountDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Account account = null;
        AccountDAO instance = new AccountDAOImpl();
        instance.create(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class AccountDAO.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Account account = null;
        AccountDAO instance = new AccountDAOImpl();
        instance.edit(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AccountDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Long id = null;
        AccountDAO instance = new AccountDAOImpl();
        Account expResult = null;
        Account result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class AccountDAO.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        AccountDAO instance = new AccountDAOImpl();
        List<Account> expResult = null;
        List<Account> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByAccountNr method, of class AccountDAO.
     */
    @Test
    public void testFindByAccountNr() {
        System.out.println("findByAccountNr");
        Long accountNr = null;
        AccountDAO instance = new AccountDAOImpl();
        Account expResult = null;
        Account result = instance.findByAccountNr(accountNr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AccountDAO.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Account account = null;
        AccountDAO instance = new AccountDAOImpl();
        instance.remove(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AccountDAOImpl implements AccountDAO {

        public int count() {
            return 0;
        }

        public void create(Account account) {
        }

        public void edit(Account account) {
        }

        public Account find(Long id) {
            return null;
        }

        public List<Account> findAll() {
            return null;
        }

        public Account findByAccountNr(Long accountNr) {
            return null;
        }

        public void remove(Account account) {
        }
    }
    
}
