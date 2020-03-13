package Figuras;

public class Quadrado extends Poligono implements Diagonal{
	
	public Quadrado() {
		
	}
	
	public double calculaDiagonal() {
		double diagonal = Math.sqrt((super.getAltura() * 2) + (super.getBase() * 2));
		return diagonal;
	}
	
	public Quadrado(int base, int altura) {
		super.setAltura(altura);
		super.setBase(base);
	}
	
}