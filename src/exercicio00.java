import java.util.Scanner;

public class exercicio00 {
	

		public static void main(String[] args) {
			
			System.out.print("Digite um n�mero: ");
			
			Scanner scanner = new Scanner(System.in);

			Double numeroEscolhido = scanner.nextDouble();
		    
			if (numeroEscolhido > 0) {
				System.out.println("O n�mero escolhido � positivo!");
			}
			else {
				System.out.println("O n�mero escolhido � negativo!");
			}

			scanner.close();
		}
	}


