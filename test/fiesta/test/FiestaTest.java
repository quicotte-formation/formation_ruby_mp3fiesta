/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiesta.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author gilbert
 */
public class FiestaTest {
    
    @Before
    public void flushAndPopulateDB() {
        EntityManager em = Persistence.createEntityManagerFactory("FiestaPU").createEntityManager();
    }

    @Test
    public void dummy() {
        
    }
}
