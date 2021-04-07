package application;

import domain.Floristeria;
import persistence.FloristeriaRepository;

public class FloristeriaController {
	
	private FloristeriaRepository repository = new FloristeriaRepository();

	public FloristeriaController() {

	}
	
	public void createFloristeria(String nom) {
		Floristeria floristeria = new Floristeria(nom);
	}
	
	public void createArbre(double altura) {
		Arbre arbre = new Arbre(altura);
		repository.addProducte(arbre);
	}
	
	/*
	 * 	TODO: m�todes per crear la resta de productes
	 */
	
	public void String printStock() {
		
	}
	
	

	
	
}
