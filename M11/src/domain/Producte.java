package domain;

public abstract class Producte {

	private double preu;
	
	public Producte(double preu) {
		this.preu = preu;
	}
	
	public double getPreu() {
		return preu;
	}
	
	@Override
	public abstract String toString();
}
