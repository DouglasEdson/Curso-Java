import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		System.out
				.println("Exerc�cio 02 - Fazer um programa ler um n�mero" + " e dizer se este n�mero � �mpar ou par.");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um n�mero inteiro: ");

		Double numero = scanner.nextDouble();

		if (numero % 2 == 0) {
			System.out.println("O n�mero � par!");
		} else {
			System.out.println("O �mero � �mpar!");
		}
		scanner.close();
	} 
	
}
