import java.util.Locale;
import java.util.Scanner;

public class Debug {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira a largura do terreno: ");
		double largura = scanner.nextDouble();

		System.out.print("Insira o comprimento do terreno: ");
		double comprimento = scanner.nextDouble();

		System.out.print("Insira o valor do metro quadrado: ");
		double metroQuadrado = scanner.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		scanner.close();
	}

}
