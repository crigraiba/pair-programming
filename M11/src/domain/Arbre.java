package domain;

public class Arbre extends Producte {

	private double altura;
	private static int quantitat;
	
	public Arbre(double altura, double preu) {
		super(preu);
		this.altura = altura;
		quantitat++;
	}
	
	public double getAltura() {
		return altura;
	}
	
	@Override
	public String toString() {
		return "Altura: " + altura + " m, Preu: " + getPreu() + " €" + " ID" + id;
	}
	
	
	
}
