public abstract class Poligono2 extends Poligono {

	@Override
	public double calculaArea() {
		double area = ( super.getAltura() * super.getBase() ) / 2;
		return area;
	}
}