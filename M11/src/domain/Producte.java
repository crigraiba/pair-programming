package domain;

public abstract class Producte {

	private double preu;
	private int id = 0;
	
	private static int count;
	
	public Producte(double preu) {
		this.preu = preu;
		
		id = count;
		count++;
	}
	
	public double getPreu() {
		return preu;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public abstract String toString();
}
