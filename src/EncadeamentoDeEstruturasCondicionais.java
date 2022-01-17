import java.util.Scanner;

public class EncadeamentoDeEstruturasCondicionais {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer hora;

		System.out.print("Quantas horas? ");
		hora = scanner.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} 
		else if (hora < 18) {
			System.out.println("Boa tarde");
		} 
		else {
			System.out.println("Boa noite");
		}
		scanner.close();

	}
}
