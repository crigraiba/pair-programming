
package domain;

public abstract class Producte {

	private double preu;
	protected int id = 0;


	private static int count;
	
	public Producte(double preu) {
		this.preu = preu;
		count++;
		id = count;
	}
	
	public double getPreu() {
		return preu;
	}

	public int getId() {
		return this.id;
	}
	
	@Override
	public abstract String toString();
}

