package domain;

public class Decoracio extends Producte {

	private Material material;
	
	private enum Material {
		FUSTA, PLASTIC;
	}
	
	public Decoracio(Material material, double preu) {
		super(preu);
		this.material = material;
	}
	
	public Material getMaterial() {
		return material;
	}
	
}
