package Figuras;

public class Piramide extends PoligonoComVolume {
	@Override
	public double volume() {
		return ((this.getBase() * this.getAltura()) * this.getProfundidade()) / 3;
	}
}