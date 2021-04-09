package application;

import java.awt.Color;

import domain.Arbre;
import domain.Decoracio;
import domain.Flor;
import domain.Decoracio.Material;
import persistence.FloristeriaRepository;

public class ProductesController {
	
	public ProductesController() {
	}

	private FloristeriaRepository repository = new FloristeriaRepository();
	
	public void createArbre(double altura, double preu) {
		Arbre arbre = new Arbre(altura, preu);
		Arbre.getQuantitat++;
		repository.addProducte(arbre);
	}
	
	public void createDecoracio(Material material, double preu) {
		Decoracio decoracio = new Decoracio(material, preu);
		Decoracio.getQuantitat++;
		repository.addProducte(decoracio);
	}
	
	public void createFlor(Color color, double preu) {
		Flor flor = new Flor(color, preu);
		Flor.getQuantitat++;
		repository.addProducte(flor);
	}
	

}
