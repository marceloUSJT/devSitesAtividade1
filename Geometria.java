import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		ArrayList<Figura> lista = new ArrayList<Figura>();
		lista.add(new Triangulo(4, 3));
		lista.add(new Retangulo(5, 3));
		lista.add(new Quadrado(4, 4));
		lista.add(new Losango(5, 1));
		lista.add(new Circulo(4));
		
		for(Figura figura : lista) {
			System.out.println(figura.toString());
		}
		
	}
}