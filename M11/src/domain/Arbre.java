package domain;

public class Arbre extends Producte {

	private double altura;
	
	public Arbre(double altura, double preu) {
		super(preu);
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
}