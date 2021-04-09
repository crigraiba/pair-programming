package view;

import java.awt.Color;
import java.util.ArrayList;

import application.FloristeriaController;
import application.ProductesController;
import application.TicketController;
import domain.Decoracio.Material;

public class Main {
	
	private static FloristeriaController controller = new FloristeriaController();
	private static ProductesController productesController = new ProductesController();
	private static TicketController ticketController = new TicketController();

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
		
		
		ticketController.createTicket(new int[]{ 1,2,3,4 });
		
		
		
		// TODO printTickets
		
		
		// Main:
		// List<Producte>
		// ticketController.createTicket(new int[1, 2, 3, 4]);
		
		// TicketController:
		// createTicket(List<Integer> ids)
		
		// List<Producte> productes
		
		// for (int id : ids)
		// producte = getProducteById(id)
		// productes.add(producte)
		
		// Ticket ticket = new Ticket(productes)
		// ticket.updateProducte(producte) -> List<Producte> productes de Ticket
		
	}

}
