

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPATest {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rpsdb"); 
		EntityManager em = emf.createEntityManager();
		
		try	{
			em.getTransaction().begin();
			Score score = em.find(Score.class, new Long(1));
			System.out.println(score);
			System.out.println("***");
			score.wins = Integer.parseInt(score.wins)+1 + "";
			
			
			List<GameSummary> l = em.createQuery("Select gs from GameSummary gs").getResultList();
			//List<GameSummary> l = em.createQuery("select gs from GameSummary gs WHERE gs.result='TIE'").getResultList();
			System.out.println(l.size());
			
			for (GameSummary cur : l) {
				System.out.println(cur);
			}
			
			GameSummary gs = new GameSummary();
			gs.client = "Rock";
			gs.server = "Paper";
			gs.result = "Loss";
			gs.date = new java.util.Date();
			gs.id = 0;
			
			em.persist(gs);;
	    

			em.getTransaction().commit();
		} 
		catch (Exception ex) { ex.printStackTrace(); }
		finally { em.close(); }
	}
}
