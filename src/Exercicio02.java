import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		System.out
				.println("Exercício 02 - Fazer um programa ler um número" + " e dizer se este número é ímpar ou par.");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");

		Double numero = scanner.nextDouble();

		if (numero % 2 == 0) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O úmero é ímpar!");
		}
		scanner.close();
	} 
	
}
