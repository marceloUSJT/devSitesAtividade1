public class Retangulo extends Poligono implements Diagonal{
	
	public Retangulo() {
		
	}
	
	public Retangulo(int base, int altura) {
		super.setAltura(altura);
		super.setBase(base);
	}
	
	public double calculaDiagonal() {
		double diagonal = Math.sqrt((super.getAltura() * super.getAltura()) + (super.getBase() * super.getBase()));
		return diagonal;
	}
	
	@Override
	public double calculaPerimetro() {
		double perimetro = 2 * (super.getAltura() + super.getBase());
		return perimetro;
	}
	
}