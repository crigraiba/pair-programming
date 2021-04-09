package application;

import domain.Floristeria;
import persistence.FloristeriaRepository;
import domain.Producte;
import domain.Arbre;
import domain.Flor;
import domain.Decoracio;

public class FloristeriaController {
	
	private FloristeriaRepository repository = new FloristeriaRepository();

	private Floristeria floristeria;
	
	public FloristeriaController() {
	}
	
	public void createFloristeria(String nom) {
		floristeria = new Floristeria(nom);
	}
	
	public String getStock() {
		// Separació en funció de la subclasse

		StringBuilder sbArbres = new StringBuilder();
		StringBuilder sbFlors = new StringBuilder();
		StringBuilder sbDecoracions = new StringBuilder();
		
		sbArbres.append("\n\tARBRES:");
		sbFlors.append("\n\tFLORS:");
		sbDecoracions.append("\n\tDECORACIONS:");
		
		sbArbres.append("\n\tQuantitat: " + Arbre.getQuantitat());
		sbFlors.append("\n\tQuantitat: " + Flor.getQuantitat());
		sbDecoracions.append("\n\tQuantitat: " + Decoracio.getQuantitat());
		
		for (Producte producte : repository.getProductes()) {
			if (producte instanceof Arbre)
				sbArbres.append("\n\t\t" + producte.toString());
			else if (producte instanceof Flor)
				sbFlors.append("\n\t\t" + producte.toString());
			else if (producte instanceof Decoracio)
				sbDecoracions.append("\n\t\t" + producte.toString());
		}
		
		return "Nom: " + floristeria.getNom() + "\nStock:" + sbArbres.toString() + sbFlors.toString() + sbDecoracions.toString();
	}

	// Actualització del valor de la floristeria:
	
	public String getValor() {
		return "Total: " + Floristeria.getValor() + " €";
	}
}
