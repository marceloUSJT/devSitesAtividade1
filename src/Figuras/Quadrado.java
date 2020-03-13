package Figuras;

public class Quadrado extends Poligono implements Diagonal{
	
	public Quadrado() {
		
	}
	
	public Quadrado(int base, int altura) {
		super.setAltura(altura);
		super.setBase(base);
	}
	
	public double calculaDiagonal() {
		double diagonal = Math.sqrt((super.getAltura() * super.getAltura()) + (super.getBase() * super.getBase()));
		return diagonal;
	}
}