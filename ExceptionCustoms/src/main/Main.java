package main;

import entity.CompteBancaire;
import exception.SoldeInsuffisantException;

public class Main {

	public static void main(String[] args) {
		
		CompteBancaire compte = new CompteBancaire(200);
		
		try {
			compte.retirerArgent(300);
		} catch (SoldeInsuffisantException e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("Votre solde est de " + compte.getSolde() + " euros");

	}

}
