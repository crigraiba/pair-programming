package application;


import domain.Arbre;

import java.awt.Color;


import domain.Decoracio;
import domain.Decoracio.Material;
import domain.Flor;

import domain.Floristeria;
import persistence.FloristeriaRepository;

public class FloristeriaController {
	
	private FloristeriaRepository repository = new FloristeriaRepository();

	public FloristeriaController() {
	}
	
	public void createFloristeria(String nom) {
		Floristeria floristeria = new Floristeria(nom);
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
	
	
	// public void printStrock(Floristeria floristeria) {
	public void printStock() {
		// FIXME instància floristeria d'on la trec
		return System.out.println(floristeria.toString());
	}
	
}
