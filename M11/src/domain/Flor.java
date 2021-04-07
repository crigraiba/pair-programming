package domain;

import java.awt.Color;

public class Flor extends Producte {

	private Color color;
	
	public Flor(Color color, double preu) {
		super(preu);
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
}
