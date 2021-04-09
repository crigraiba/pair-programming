package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.Producte;
import domain.Ticket;

public class FloristeriaRepository {
	
	private static List<Producte> productes = new ArrayList<>();
	private static List<Ticket> tickets= new ArrayList<>();

	public FloristeriaRepository() {
	}

	
	// --- Mètodes de productes ---
	
	public List<Producte> getProductes() {
		return new ArrayList<>(productes);
	}
	
	public void addProducte(Producte producte) {
		productes.add(producte);
	}
	
	public Producte getProducteById (int id) {
		for (Producte producte : productes) {
			if (producte.getId() == id) {
				return producte;
			}
		}
		return null;

	}
	
	public void removeProducte(Producte producte) {
		productes.remove(producte);
	}

	
	// --- Mètodes de tickets ---
	
	public List<Ticket> getTickets() {
		return new ArrayList<>(tickets);
	}
	
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
	
}
