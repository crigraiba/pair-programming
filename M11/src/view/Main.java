package view;

import java.awt.Color;

import application.FloristeriaController;
import application.ProductesController;
import application.TicketController;
import domain.Decoracio.Material;

public class Main {
	
	private static FloristeriaController controller = new FloristeriaController();
	private static ProductesController productesController = new ProductesController();
	private static TicketController ticketController = new TicketController();

	public static void main(String[] args) {
		// Creaci� de la floristeria:
		controller.createFloristeria("Flors i Violes");

		// Creaci� dels productes:
		productesController.createArbre(12.5, 500);
		productesController.createArbre(8.25, 200);
		productesController.createDecoracio(Material.FUSTA, 94.85);
		productesController.createDecoracio(Material.PLASTIC, 85.75);
		productesController.createFlor(Color.red, 26.15);
		productesController.createFlor(Color.yellow, 21.65);
		
		// Impressi� del stock i el valor total de la floristeria:
		System.out.println(controller.getStock());
		System.out.println(controller.getValor());
		
		// Esborrem productes segons el seu id:
		productesController.deleteProducte(1);
		productesController.deleteProducte(3);
		
		// Comprovaci� de que els productes esborrats ja no es troben en stock:
		System.out.println(); // Separaci�
		System.out.println();
		
		System.out.println(controller.getStock());
		System.out.println(controller.getValor());
		
		// Creaci� de tickets:
		ticketController.createTicket(new int[]{2});
		ticketController.createTicket(new int[]{5, 6});
		
		// Impressi� dels tickets:
		System.out.println(); // Separaci�
		System.out.println();
		
		System.out.println(ticketController.getTickets());
		
		// Comprovaci� de que els productes venuts ja no es troben en stock:
		System.out.println(); // Separaci�
		System.out.println();
		
		System.out.println(controller.getStock());
		System.out.println(controller.getValor());
	}

}
