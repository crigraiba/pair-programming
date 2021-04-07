package application;

import domain.Arbre;
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
	 * 	TODO: mètodes per crear la resta de productes
	 */
	
	public void printStock() {
		// FIXME instància d'on la trec
		return System.out.println(floristeria.toString());
	}
	
	

	
	
}
