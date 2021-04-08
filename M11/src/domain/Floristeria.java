package domain;

public class Floristeria {
	
	private String nom;
	// private List<Producte> productes; ?

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
	// public String printFloristeria (List<Producte> productes) {
	public String toString() {
		// TODO Separar en funció de la subclasse
		// \t tabulació

		StringBuilder sbArbres = new StringBuilder();
		StringBuilder sbFlors = new StringBuilder();
		StringBuilder sbDecoracions = new StringBuilder();
		
		sbArbres.append("\n\tARBRES:");
		sbFlors.append("\tFLORS:");
		sbDecoracions.append("\tDECORACIONS:");
		
		// FIXME d'on surt la llista productes?
		for (Producte producte : productes) {
			if (producte instanceof Arbre)
				sbArbres.append("\n\t\t" + producte.toString());
			else if (producte instanceof Flor)
				sbFlors.append("\n\t\t" + producte.toString());
			else if (producte instanceof Decoracio)
				sbDecoracions.append("\n\t\t" + producte.toString());
		}
		
		return "Nom:" + nom + "\nStock:" + sbArbres.toString() + sbFlors.toString() + sbDecoracions.toString();
	}

}
