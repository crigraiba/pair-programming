package domain;

public class Floristeria {
	
	private String nom;
	private double valor;

	public Floristeria(String nom) {
		this.nom = nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void updateValor(double preu) {
		valor += preu;
	}
	
	// floristeria.updateValor(preu)
	// a ProducteController -> createArbre, createFlor, createDecoracio

}
