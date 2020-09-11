
public class Teste {
	public interface AreaCalculavel {
		public String getFigura();

		public int getArea();
	}

	public static void main(String[] args) {
		Circulo circulo = new Circulo(2);
		Retangulo retangulo = new Retangulo(2, 4);
		Quadrado quadrado = new Quadrado(3);
		System.out.println("A �rea do quadrado � " + quadrado.getArea() + ".");
		System.out.println("A �rea do ret�ngulo � " + retangulo.getArea() + ".");
		System.out.println("A �rea do c�rculo � " + circulo.getArea() + ".");
	}
}
