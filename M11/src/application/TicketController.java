package application;

import java.util.List;

import domain.Producte;
import domain.Ticket;
import persistence.FloristeriaRepository;

public class TicketController {
	
	private FloristeriaRepository repository = new FloristeriaRepository();
	private ProductesController productesController= new ProductesController();
	
	public TicketController() {
		
	}
	
	public void createTicket(List<Integer> idsProductes) {
		
		Ticket ticket = new Ticket();
		double total = 0;
		
		for(int id : idsProductes) {
			Producte producte = repository.getProducteById(id); 
			total += producte.getPreu();
			ticket.addProducte(producte);
			productesController.deleteProducte(id);
		}
		
		ticket.setTotal(total);
		
		repository.addTicket(ticket);
	}

}
