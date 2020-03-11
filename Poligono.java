public abstract class Poligono extends Figura {
	private int base;
	private int altura;
	
	@Override
	public double calculaArea() {
		double area = this.base * this.altura;
		return area;
	}
	
	@Override
	public double calculaPerimetro() {
		double perimetro = 4 * this.base;
		return perimetro;
	}
	
	//set
	public void setBase(int base) {
		this.base = base;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	//get
	public int getBase() {
		return this.base;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public String toString() {
		String txt = "Altura:"+this.getAltura()+" | Base: "+this.getBase();
		
		return txt;
	}
}