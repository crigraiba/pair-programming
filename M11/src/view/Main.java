package view;

import java.awt.Color;

import application.FloristeriaController;
import application.ProductesController;
import domain.Decoracio.Material;

public class Main {
	
	private static FloristeriaController controller = new FloristeriaController();
	private static ProductesController productesController = new ProductesController();

	public static void main(String[] args) {
		controller.createFloristeria("Flors i Violes");

		productesController.createArbre(12.5, 500);
		productesController.createArbre(8.25, 200);
		productesController.createDecoracio(Material.FUSTA, 94.85);
		productesController.createDecoracio(Material.PLASTIC, 85.75);
		productesController.createFlor(Color.red, 26.15);
		productesController.createFlor(Color.yellow, 21.65);
		
		System.out.println(controller.getStock());
		System.out.println(controller.getValor());
		
		// Esborrar producte segons el seu id
		productesController.deleteProducte(1);
		productesController.deleteProducte(3);
		
		System.out.println();
		System.out.println();
		
		System.out.println(controller.getStock());
		System.out.println(controller.getValor());
	}

}
