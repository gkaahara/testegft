import java.util.Scanner;

class nascimento {
	public static void main(String[] args) {
    int dia, mes, ano;
    Scanner scanner = new Scanner(System.in);
            System.out.print("Insira o dia de seu nascimento: ");
            dia = scanner.nextInt();
    System.out.println();
            System.out.print("Insira o mês de seu nascimento: ");
            mes = scanner.nextInt();
    System.out.println();
    System.out.print("Insira o ano de seu nascimento: ");
    ano = scanner.nextInt();
    System.out.println();
    if (dia >= 1 && dia <=31){
        if (mes >=1 && mes <= 12){
            if (ano <2018){
                System.out.println("Data válida");
            }
        }
    }
    else{
        System.out.println("Data inválida");
    }
scanner.close();
}
}