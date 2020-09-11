
public class Quadrado implements Teste.AreaCalculavel {
	int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public int getArea() {
		int area = 0;
		area = lado * lado;
		return area;
	}

	public String getFigura() {
		return "Quadrado";
	}

	public Quadrado(int lado) {
		super();
		this.lado = lado;
	}

}
