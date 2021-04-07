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

	
	
	
	
	

}
