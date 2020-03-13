package Figuras;

public class Cilindro extends PoligonoComVolume{
	private double raio;
	
	public Cilindro() {
		super();
	}

	public Cilindro(double raio) {
		super();
		this.raio = raio;
	}

	//gets
	public double getRaio() {
		return raio;
	}
	
	//sets
	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double volume() {
		return (Math.PI * Math.pow(raio, 2)) * this.getAltura();
	}
}