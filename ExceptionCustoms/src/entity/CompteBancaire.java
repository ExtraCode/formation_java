package entity;

import exception.SoldeInsuffisantException;

public class CompteBancaire {
	
	private double solde;

	public CompteBancaire(double solde) {
		this.solde = solde;
	}
	
	public void retirerArgent(int montant) throws SoldeInsuffisantException {
		
		if(montant > solde) {
			// pas assez d'argent
			throw new SoldeInsuffisantException("Solde insuffisant pour effectuer le retrait");
		}
		
		solde = solde - montant;
		
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
