package messages;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class SaveMessage {
    public static void main(String[] args) {
        EntityManagerFactory emf = createEntityManagerFactory("hibernatecourse");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Message message = new Message(1,"Hello World");
        em.persist(message);
        tx.commit();
        em.close();
        emf.close();
        System.out.println("Message saved");
    }
}
