package jUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entity.Tache;
import repository.TacheRepository;

class TacheRepositoryTest {

	@BeforeEach
	public void setUp() {
		TacheRepository.add(new Tache(1, "Faire les courses"));
		TacheRepository.add(new Tache(2, "Répondre aux mails"));
		TacheRepository.add(new Tache(3, "Préparer le rapport"));
	}
	
	@Test
	public void testAjouterTache() {
		int tailleAvant = TacheRepository.findAll().size();
		TacheRepository.add(new Tache(4, "Appeler le client"));
		assertEquals(tailleAvant + 1 , TacheRepository.findAll().size());
	}
	
	@Test
	public void testDeleteTache() {
		int tailleAvant = TacheRepository.findAll().size();
		TacheRepository.delete(2);
		assertEquals(tailleAvant - 1 , TacheRepository.findAll().size());
	}
	
	@Test
	public void testMarkCompleted() {
		// Récupération de la tache à l'index 0 de la liste
		Tache tache = TacheRepository.findAll().get(0);
		
		assertFalse(tache.isCompletee());
		TacheRepository.markCompleted(tache.getId());
		assertTrue(tache.isCompletee());
		
	}

}
