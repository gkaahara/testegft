import java.lang.Math;

public class Circulo implements Teste.AreaCalculavel {
	int raio = 0;

	public double getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public int getArea() {
		int area = 0;
		area = (int) (Math.PI * raio);
		return area;
	}

	public String getFigura() {
		return "Circulo";
	}

	public Circulo(int raio) {
		super();
		this.raio = raio;
	}

}
