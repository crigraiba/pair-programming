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
		// Creació de la floristeriai de productes:
		controller.createFloristeria("Flors i Violes");
		
		productesController.createArbre(12.5, 500);
		productesController.createArbre(8.25, 200);
		productesController.createDecoracio(Material.FUSTA, 94.85);
		productesController.createDecoracio(Material.PLASTIC, 85.75);
		productesController.createFlor(Color.red, 26.15);
		productesController.createFlor(Color.yellow, 21.65);
		
		// Impressió del stock i valor total de la floristeria:
		System.out.println(controller.getStock());
		System.out.println(controller.getValor());
		
		// Esborrar productes segons el seu id:
		productesController.deleteProducte(1);
		productesController.deleteProducte(3);
		
		// Comprovació de que els productes esborrats ja no es troben en stock:
		System.out.println();
		System.out.println();
		
		System.out.println(controller.getStock());
		System.out.println(controller.getValor());
		
		// Creació de tickets:
		ticketController.createTicket(new int[]{4});
		ticketController.createTicket(new int[]{5, 6});
		
		// Impressió dels tickets:
		System.out.println();
		System.out.println();
		
		System.out.println(ticketController.getTickets());
		
		// Comprovació de que els productes venuts ja no es troben en stock:
		System.out.println();
		System.out.println();
		
		System.out.println(controller.getStock());
		System.out.println(controller.getValor());
		
		// Impressió del total de diners guanyats amb les vendes:
		System.out.println();
		System.out.println();
		
		// TODO Victor
	}

}
