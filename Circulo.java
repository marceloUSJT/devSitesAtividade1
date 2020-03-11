public class Circulo extends Figura {
	private double raio;
	
	public Circulo() {
		
	}
	
	public Circulo(double raio) {
		this.setRaio(raio);
	}
	
	@Override
	public double calculaPerimetro() {
		double perimetro = 2 * ( 3.14 * this.raio );
		return perimetro;
	}
	
	@Override
	public double calculaArea() {
		return this.raio * 3.14;
	}
	
	//set
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	//get 
	public double getRaio() {
		return this.raio;
	}
	
	public String toString() {
		String txt = "Circulo\nPerimetro:" +calculaPerimetro()+" | Raio: "+this.getRaio();
		return txt;
	}
}