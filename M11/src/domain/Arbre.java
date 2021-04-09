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
	
	public static int getQuantitat() {
		return quantitat;
	}
	
	public static void updateQuantitat() {
		quantitat--;
	}
	
	@Override
	public String toString() {
		return  "Id: " + getId() + ", Altura: " + altura + " m, Preu: " + getPreu() + " €";
	}
	
	
	
}
