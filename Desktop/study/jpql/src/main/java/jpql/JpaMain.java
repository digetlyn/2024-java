package jpql;

import jakarta.persistence.*;
import org.hibernate.boot.model.relational.SqlStringGenerationContext;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JpaMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Member member1 = new Member();
            member1.setUsername("관리자1");
            em.persist(member1);

            Member member2 = new Member();
            member2.setUsername("관리자2");
            em.persist(member2);

//            TypedQuery<Member> q1 = em.createQuery("select m from Member m", Member.class);
//            TypedQuery<String> q2 = em.createQuery("select m.username from Member m", String.class);
//            Query q3 = em.createQuery("select m.username, m.age from Member m");
            em.flush();
            em.clear();


            String query = "select group_concat(m.username) From Member m";

            List<String> result = em.createQuery(query, String.class)
                            .getResultList();

            for (String s : result) {
                System.out.println("s = " + s);

            }
            

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}