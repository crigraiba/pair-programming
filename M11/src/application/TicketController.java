package application;

import java.util.ArrayList;
import java.util.List;

import domain.Producte;
import domain.Ticket;
import persistence.FloristeriaRepository;

public class TicketController {
	
	private FloristeriaRepository repository = new FloristeriaRepository();
	private ProductesController productesController= new ProductesController();
	
	public TicketController() {
	}
	
	public void createTicket(int[] ids) {
		
		List<Producte> productes = new ArrayList<>();
		double total = 0;
		
		for(int id : ids) {
			Producte producte = repository.getProducteById(id); 
			total += producte.getPreu();
			productes.add(producte);
			productesController.deleteProducte(id);
		}
		
		Ticket ticket = new Ticket(productes);
		ticket.setTotal(total);
		
		repository.addTicket(ticket);
	}
	
	//TODO getTickets and print - Cristina
	public String getTickets() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Tickets:");
		
		for (Ticket ticket : repository.getTickets()) {
			sb.append("\n----------------------------------------"); // Separació entre tickets
			sb.append("\n" + ticket.toString());
		}
		
		return sb.toString();
	}
	
	// TODO calcular i print valor total - Victor

}
