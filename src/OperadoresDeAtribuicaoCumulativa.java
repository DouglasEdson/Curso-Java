import java.util.Locale;
import java.util.Scanner;

public class OperadoresDeAtribuicaoCumulativa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite os minutos usados: ");
		Integer minutos = scanner.nextInt();
		Double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("O valor da conta é = R$ %.2f%n", conta);
		scanner.close();
	}
}

