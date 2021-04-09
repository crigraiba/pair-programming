package application;

import java.awt.Color;

import domain.Floristeria;
import persistence.FloristeriaRepository;
import domain.Arbre;
import domain.Decoracio;
import domain.Flor;
import domain.Producte;
import domain.Decoracio.Material;

public class ProductesController {
	
	public ProductesController() {
	}

	private FloristeriaRepository repository = new FloristeriaRepository();
	
	public void createArbre(double altura, double preu) {
		Arbre arbre = new Arbre(altura, preu);
		repository.addProducte(arbre);
		Floristeria.updateValor(preu);
	}
	
	public void createDecoracio(Material material, double preu) {
		Decoracio decoracio = new Decoracio(material, preu);
		repository.addProducte(decoracio);
		Floristeria.updateValor(preu);
	}
	
	public void createFlor(Color color, double preu) {
		Flor flor = new Flor(color, preu);
		repository.addProducte(flor);
		Floristeria.updateValor(preu);
	}
	
	public void deleteProducte(int id) {
		// recuperar el producte per id
		Producte producte = repository.getProducteById(id);
		
		if (producte instanceof Arbre) {
			Arbre.updateQuantitat();
		} else if (producte instanceof Decoracio) {
			Decoracio.updateQuantitat();
		} else if (producte instanceof Flor) {
			Flor.updateQuantitat();
		}
		
		Floristeria.updateValor(producte.getPreu() * -1);
		repository.removeProducte(producte);
	}

}
