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
		// Creació de la floristeria i de productes:
		controller.createFloristeria("Flors i Violes");
		
		productesController.createArbre(12.5, 500);
		productesController.createArbre(8.25, 200);
		productesController.createDecoracio(Material.FUSTA, 94.85);
		productesController.createDecoracio(Material.PLASTIC, 85.75);
		productesController.createFlor(Color.red, 26.15);
		productesController.createFlor(Color.yellow, 21.65);

		System.out.println("     ==== STOCK DESPRÉS DE CREAR ELS PRODUCTES ===\n");
		System.out.println(controller.getStock());
		System.out.println(controller.getValor());

		// Esborrar producte segons el seu id
		productesController.deleteProducte(1);
		productesController.deleteProducte(3);

		// Comprovació de que els productes esborrats ja no es troben en stock:
		System.out.println();
		System.out.println();

		System.out.println("     ==== STOCK DESPRÉS D'ESBORRAR EL PRODUCTES 1, 3 ===\n");
		System.out.println(controller.getStock());
		System.out.println(controller.getValor());

		// Creació de tickets:
		ticketController.createTicket(new int[] { 4 });
		ticketController.createTicket(new int[] { 5, 6 });

		// Impressió dels tickets:
		System.out.println();
		System.out.println();

		System.out.println("     ==== IMPRESSIÓ DELS TICKETS CREATS I PREU TOTAL DE LES VENDES ===\n");
		System.out.println(ticketController.getTickets());
		
		// Comprovació de que els productes comprats ja no es troben en stock:
		System.out.println();
		System.out.println();
		
		System.out.println("     ==== STOCK DESPRÉS DE COMPRAR EL PRODUCTES 4, 5, 6 ===\n");
		System.out.println(controller.getStock());
		System.out.println(controller.getValor());
				
	}

}
