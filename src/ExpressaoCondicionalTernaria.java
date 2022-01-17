import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double preco = 34.5;
		Double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.println(desconto);

		scanner.close();
	}
}
