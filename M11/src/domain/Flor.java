package domain;

import java.awt.Color;

public class Flor extends Producte {

	private Color color;
	private static int quantitat;
	
	public Flor(Color color, double preu) {
		super(preu);
		this.color = color;
		quantitat++;
	}
	
	public Color getColor() {
		return color;
	}
	
	public static int getQuantitat() {
		return quantitat;
	}
	
	public static void updateQuantitat() {
		quantitat--;
	}

	@Override
	public String toString() {
		return "Id: " + getId() + ", Color: (" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + "), Preu: " + getPreu() + " €";
	}
	
}
