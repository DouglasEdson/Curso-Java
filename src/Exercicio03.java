import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		System.out.println("Exercício 03 -");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite dois número inteiro: ");

		Double numeroA, numeroB;

		numeroA = scanner.nextDouble();
		numeroB = scanner.nextDouble();

		if (numeroA % numeroB == 0 || numeroB % numeroA == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são Múltiplos");
		}
		scanner.close();
	}

}
