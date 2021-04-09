<<<<<<< HEAD
package domain;

public abstract class Producte {

	private double preu;
	
	public enum TipusProducte {
		ARBRE, DECORACIO, FLOR;
	}
	
	public Producte(double preu) {
		this.preu = preu;
	}
	
	public double getPreu() {
		return preu;
	}
	
	@Override
	public abstract String toString();
}
=======
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
	
	@Override
	public abstract String toString();
}
>>>>>>> branch 'development' of https://github.com/crigraiba/pair-programming.git
