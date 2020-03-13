package Figuras;

public class Cubo extends PoligonoComVolume{

	@Override
	public double volume() {
		return Math.pow(this.getBase(), 3);
	}
	
}