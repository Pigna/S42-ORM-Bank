/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import bank.domain.Account;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import util.DatabaseCleaner;

/**
 *
 * @author myron
 */
public class opdracht1test {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPU");
    EntityManager em = emf.createEntityManager();
    DatabaseCleaner dbCleaner = new DatabaseCleaner(em); 
    
    public void ClearDB()
    {
        try
        {
            dbCleaner.clean();
        }
        catch(Exception e)
        {
            System.out.println("Error in db cleaner: " + e.getMessage());
        }
    }
    @Test
    public void PersistCommit()
    {
        ClearDB();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPU");
        EntityManager em = emf.createEntityManager();
        Account account = new Account(111L);
        em.getTransaction().begin();
        em.persist(account);
        //TODO: verklaar en pas eventueel aan
        assertNull(account.getId());
        em.getTransaction().commit();
        System.out.println("AccountId: " + account.getId());
        //TODO: verklaar en pas eventueel aan
        assertTrue(account.getId() > 0L);
    }
//Wat is de waarde van asserties en printstatements? Corrigeer verkeerde asserties zodat de test ‘groen’ wordt.
//Welke SQL statements worden gegenereerd?
//Wat is het eindresultaat in de database?
//Verklaring van bovenstaande drie observaties.

    @Test
    public void Rollback()
    {
        ClearDB();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPU");
        EntityManager em = emf.createEntityManager();
        Account account = new Account(111L);
        em.getTransaction().begin();
        em.persist(account);
        assertNull(account.getId());
        em.getTransaction().rollback();
        // TODO code om te testen dat table account geen records bevat. Hint: bestudeer/gebruik AccountDAOJPAImpl
    }
    
    @Test
    public void Flushen()
    {
        ClearDB();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPU");
        EntityManager em = emf.createEntityManager();
        Long expected = -100L;
        Account account = new Account(111L);
        account.setId(expected);
        em.getTransaction().begin();
        em.persist(account);
        //TODO: verklaar en pas eventueel aan
        //assertNotEquals(expected, account.getId();
        em.flush();
        //TODO: verklaar en pas eventueel aan
        //assertEquals(expected, account.getId();
        em.getTransaction().commit();
        //TODO: verklaar en pas eventueel aan
    }
    
    @Test
    public void VeranderingenPersist()
    {
        ClearDB();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPU");
        EntityManager em = emf.createEntityManager();
        Long expectedBalance = 400L;
        Account account = new Account(114L);
        em.getTransaction().begin();
        em.persist(account);
        account.setBalance(expectedBalance);
        em.getTransaction().commit();
        assertEquals(expectedBalance, account.getBalance());
        //TODO: verklaar de waarde van account.getBalance
        Long  cid = account.getId();
        account = null;
        EntityManager em2 = emf.createEntityManager();
        em2.getTransaction().begin();
        Account found = em2.find(Account.class,  cid);
        //TODO: verklaar de waarde van found.getBalance
        assertEquals(expectedBalance, found.getBalance());
    }
    
    Account acc = new Account(1L);
    Account acc2 = new Account(2L);
    Account acc9 = new Account(9L);
    //Refresh
    //In de vorige opdracht verwijzen de objecten account en found naar dezelfde rij in de database. Pas een van de objecten aan, persisteer naar de database. Refresh vervolgens het andere object om de veranderde state uit de database te halen. Test met asserties dat dit gelukt is.
    @Test
    public void Merge1()
    {
        ClearDB();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPU");
        EntityManager em = emf.createEntityManager();
        //Merge is een van de lastigere methoden uit JPA api. Het is belangrijk dat je deze opgave daarom zorgvuldig uitvoert.
        // scenario 1
        Long balance1 = 100L;
        em.getTransaction().begin();
        em.persist(acc);
        acc.setBalance(balance1);
        em.getTransaction().commit();
        //TODO: voeg asserties toe om je verwachte waarde van de attributen te verifieren.
        //TODO: doe dit zowel voor de bovenstaande java objecten als voor opnieuw bij de entitymanager opgevraagde objecten met overeenkomstig Id.
    }

    @Test
    public void Merge2()
    {
        ClearDB();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPU");
        EntityManager em = emf.createEntityManager();
        // scenario 2
        Long balance2a = 211L;
        acc = new Account(2L);
        em.getTransaction().begin();
        acc9 = em.merge(acc);
        acc.setBalance(balance2a);
        acc9.setBalance(balance2a+balance2a);
        em.getTransaction().commit();
        //TODO: voeg asserties toe om je verwachte waarde van de attributen te verifiëren.
        //TODO: doe dit zowel voor de bovenstaande java objecten als voor opnieuw bij de entitymanager opgevraagde objecten met overeenkomstig Id. 
        // HINT: gebruik acccountDAO.findByAccountNr
    }

    @Test
    public void Merge3()
    {
        ClearDB();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPU");
        EntityManager em = emf.createEntityManager();
        // scenario 3
        Long balance3b = 322L;
        Long balance3c = 333L;
        acc = new Account(3L);
        em.getTransaction().begin();
        Account acc2 = em.merge(acc);
        assertTrue(em.contains(acc)); // verklaar
        assertTrue(em.contains(acc2)); // verklaar
        assertEquals(acc,acc2);  //verklaar
        acc2.setBalance(balance3b);
        acc.setBalance(balance3c);
        em.getTransaction().commit() ;
        //TODO: voeg asserties toe om je verwachte waarde van de attributen te verifiëren.
        //TODO: doe dit zowel voor de bovenstaande java objecten als voor opnieuw bij de entitymanager opgevraagde objecten met overeenkomstig Id.
    }

    @Test
    public void Merge4()
    {
        ClearDB();
        
        // scenario 4
        Account account = new Account(114L) ;
        account.setBalance(450L) ;
        EntityManager em = emf.createEntityManager() ;
        em.getTransaction().begin() ;
        em.persist(account) ;
        em.getTransaction().commit() ;

        Account account2 = new Account(114L) ;
        Account tweedeAccountObject = account2 ;
        tweedeAccountObject.setBalance(650l) ;
        assertEquals((Long)650L,account2.getBalance()) ;  //verklaar
        account2.setId(account.getId()) ;
        em.getTransaction().begin() ;
        account2 = em.merge(account2) ;
        assertSame(account,account2) ;  //verklaar
        assertTrue(em.contains(account2)) ;  //verklaar
        assertFalse(em.contains(tweedeAccountObject)) ;  //verklaar
        tweedeAccountObject.setBalance(850l) ;
        assertEquals((Long)650L,account.getBalance()) ;  //verklaar
        assertEquals((Long)650L,account2.getBalance()) ;  //verklaar
        em.getTransaction().commit() ;
        em.close() ;
    }
    Account accF1;
    Account accF2;
    
    @Test
    public void FindClear1()
    {
        ClearDB();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPU");
        EntityManager em = emf.createEntityManager();
        
        Account acc1 = new Account(77L);
        em.getTransaction().begin();
        em.persist(acc1);
        em.getTransaction().commit();
        //Database bevat nu een account.

        // scenario 1        

        accF1 = em.find(Account.class, acc1.getId());
        accF2 = em.find(Account.class, acc1.getId());
        assertSame(accF1, accF2);
    }
    
    @Test
    public void FindClear2()
    {
        ClearDB();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPU");
        EntityManager em = emf.createEntityManager();
        // scenario 2        
        accF1 = em.find(Account.class, acc.getId());//was acc1
        em.clear();
        accF2 = em.find(Account.class, acc.getId());//was acc1
        assertSame(accF1, accF2);
        //TODO verklaar verschil tussen beide scenario’s
    }
    
    @Test
    public void Remove()
    {
        ClearDB();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPU");
        EntityManager em = emf.createEntityManager();
        
        Account acc1 = new Account(88L);
        em.getTransaction().begin();
        em.persist(acc1);
        em.getTransaction().commit();
        Long id = acc1.getId();
        //Database bevat nu een account.

        em.remove(acc1);
        assertEquals(id, acc1.getId());        
        Account accFound = em.find(Account.class, id);
        assertNull(accFound);
        //TODO: verklaar bovenstaande asserts
    }

}
