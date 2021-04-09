package domain;

public class Decoracio extends Producte {

	private Material material;
	private static int quantitat;
	
	public enum Material {
		FUSTA, PLASTIC;
	}
	
	public Decoracio(Material material, double preu) {
		super(preu);
		this.material = material;
		quantitat++;
	}
	
	public Material getMaterial() {
		return material;
	}
	
	public static int getQuantitat() {
		return quantitat;
	}
	
	public void updateQuantitat() {
		quantitat--;
	}
	
	@Override
	public String toString() {
		return "Id: " + getId() + ", Material: " + material + ", Preu: " + getPreu() + " €";
	}
	
}
