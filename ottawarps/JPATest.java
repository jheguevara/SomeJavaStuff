package com.mcnz.rps;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPATest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rpsdb");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Score score = em.find(Score.class, new Long(1));
		score.increaseWins();

		GameSummary gs = em.find(GameSummary.class, new Long(1));
		//System.out.println(gs.toString());
		String query = "from GameSummary";
		List<GameSummary> summaries = em.createQuery(query).getResultList();
		
		for (GameSummary gameSummary : summaries) {
			
			System.out.println(gameSummary);
			gameSummary.setResult("win");
		}
		
		GameSummary gameSummary = new GameSummary("spock", "rock", "error");
		em.persist(gameSummary);

		em.getTransaction().commit();

	}

}
