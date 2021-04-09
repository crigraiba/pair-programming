package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.Producte;

public class FloristeriaRepository {
	
	private static List<Producte> productes = new ArrayList<>();

	public FloristeriaRepository() {
	}

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

}
