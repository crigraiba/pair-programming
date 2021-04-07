package domain;

public class Floristeria {
	
	private String nom;
	// private List<Producte> productes;

	public Floristeria(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		// TODO Separar en funció de la subclasse
		// \t tabulació
		
		// FIXME
		for (Producte producte : productes) {
			sb.append("\n\t\t" + producte.toString());
		}
		
		return "Nom:" + nom + "\nStock:" + sb.toString();
	}

}
