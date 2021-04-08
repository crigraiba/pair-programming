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
	
	public void createArbre(double altura, double preu) {
		Arbre arbre = new Arbre(altura, preu);
		repository.addProducte(arbre);
	}
	
	public void createDecoracio(Material material, double preu) {
		Decoracio decoracio = new Decoracio(material, preu);
		repository.addProducte(decoracio);
	}
	
	public void createFlor(Color color, double preu) {
		Flor flor = new Flor(color, preu);
		repository.addProducte(flor);
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
		
		return "Nom: " + floristeria.getNom() + "\nStock:" + sbArbres.toString() + sbFlors.toString() + sbDecoracions.toString();
	}
	
}
