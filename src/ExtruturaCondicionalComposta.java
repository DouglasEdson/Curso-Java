import java.util.Scanner;

public class ExtruturaCondicionalComposta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer hora;

		System.out.print("Quantas horas? ");
		hora = scanner.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else {
			System.out.println("Boa tarde");
		}
		scanner.close();
	}
}
