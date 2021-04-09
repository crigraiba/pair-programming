
package domain;

import java.util.List;

public class Ticket {
	
	private List<Producte> productes;
	private double total;
	private int id = 0;
	
	private static int count;
	
	public Ticket(List<Producte> productes) {
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (Producte producte : productes)
			sb.append("\n\t" + producte.toString());
		
		return "Id: " + id + "\nProductes:" + sb.toString() + "\nTotal: " + total + " €";
	}
	
}

