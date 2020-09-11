import java.util.Scanner;

public class Elefante {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Favor digitar um número de 1 a 100: ");
		int repeat = scanner.nextInt();
		System.out.print("Um elefante ");
		do {
			System.out.println("incomoda ");
			repeat--;
		} while (repeat>=0);
		System.out.println("muito mais!");
		scanner.close();
	}

}
