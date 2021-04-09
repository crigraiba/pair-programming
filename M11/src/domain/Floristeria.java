package domain;

public class Floristeria {
	
	private String nom;
	private static double valor;

	public Floristeria(String nom) {
		this.nom = nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
	
	public static double getValor() {
		return valor;
	}
	
	public static void updateValor(double preu) {
		valor += preu;
	}
	
}
