package application;

import java.awt.Color;

import domain.Floristeria;
import persistence.FloristeriaRepository;
import domain.Producte;
import domain.Arbre;
import domain.Flor;
import domain.Decoracio;
import domain.Decoracio.Material;

public class FloristeriaController {
	
	private FloristeriaRepository repository = new FloristeriaRepository();

	private Floristeria floristeria;
	
	public FloristeriaController() {
	}
	
	public void createFloristeria(String nom) {
		floristeria = new Floristeria(nom);
	}
	
	public void updateFloristeriaValor(double preu) {
		floristeria.updateValor(preu);
	}

	
	public String getStock() {
		// Separació en funció de la subclasse

		StringBuilder sbArbres = new StringBuilder();
		StringBuilder sbFlors = new StringBuilder();
		StringBuilder sbDecoracions = new StringBuilder();
		
		sbArbres.append("\n\tARBRES:");
		sbFlors.append("\n\tFLORS:");
		sbDecoracions.append("\n\tDECORACIONS:");
		
		for (Producte producte : repository.getProductes()) {
			if (producte instanceof Arbre)
				sbArbres.append("\n\t\t" + producte.toString());
			else if (producte instanceof Flor)
				sbFlors.append("\n\t\t" + producte.toString());
			else if (producte instanceof Decoracio)
				sbDecoracions.append("\n\t\t" + producte.toString());
		}
		
		// TODO Cristina - Afegir quantitats totals de cada tipus (3 getQuantitats)
		
		return "Nom: " + floristeria.getNom() + "\nStock:" + sbArbres.toString() + sbFlors.toString() + sbDecoracions.toString();
	}
	
	
	public String getValor() {
		return "Total: " + floristeria.getValor() + " €";
	}
}
