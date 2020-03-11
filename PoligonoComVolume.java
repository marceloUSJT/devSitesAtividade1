public abstract class PoligonoComVolume {
	private double base;
	private double altura;
	private double profundidade;
	
	public PoligonoComVolume() {
		super();
	}

	public PoligonoComVolume(double base, double altura, double profundidade) {
		super();
		this.base = base;
		this.altura = altura;
		this.profundidade = profundidade;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

	public abstract double volume();
}