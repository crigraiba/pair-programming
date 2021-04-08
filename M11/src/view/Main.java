package view;

import java.awt.Color;

import application.FloristeriaController;
import domain.Decoracio.Material;

public class Main {
	
	private static FloristeriaController controller = new FloristeriaController();

	public static void main(String[] args) {
		controller.createFloristeria("Flors i Violes");

		controller.createArbre(12.5, 500);
		controller.createArbre(8.25, 200);
		controller.createDecoracio(Material.FUSTA, 94.85);
		controller.createDecoracio(Material.PLASTIC, 85.75);
		controller.createFlor(Color.red, 26.15);
		controller.createFlor(Color.yellow, 21.65);
		
		System.out.println(controller.getStock());
	}

}
