
package domain;

import java.util.List;

public class Ticket {
	
	private List<Producte> productes; // producte1 (id1) prod2 (id2)
	private double total;
	private int id = 0;
	
	private static int count; // id1 id2
	
	public Ticket(List<Producte> productes) {		
	// public Ticket() {
		this.productes = productes;
		
		count++;
		id = count;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public double getTotal() {
		return total;
	}

	public int getId() {
		return id;
	}

	public List<Producte> getProductes() {
		return productes;
	}
	
	/*public void updateProducte(Producte producte) {
		productes.add(producte);
	}*/
	
	// TODO a TicketController : String getTicket(int id)
	
}

