import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		System.out.println("Exerc�cio 03 -");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite dois n�mero inteiro: ");

		Double numeroA, numeroB;

		numeroA = scanner.nextDouble();
		numeroB = scanner.nextDouble();

		if (numeroA % numeroB == 0 || numeroB % numeroA == 0) {
			System.out.println("S�o m�ltiplos");
		} else {
			System.out.println("N�o s�o M�ltiplos");
		}
		scanner.close();
	}

}
