
public class Retangulo implements Teste.AreaCalculavel {
	int base, altura;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public int getArea() {
		int area = 0;
		area = base * altura;
		return area;
	}

	public String getFigura() {
		return "Retangulo";
	}

	public Retangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

}
