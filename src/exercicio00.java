import java.util.Scanner;

public class exercicio00 {
	

		public static void main(String[] args) {
			
			System.out.print("Digite um número: ");
			
			Scanner scanner = new Scanner(System.in);

			Double numeroEscolhido = scanner.nextDouble();
		    
			if (numeroEscolhido > 0) {
				System.out.println("O número escolhido é positivo!");
			}
			else {
				System.out.println("O número escolhido é negativo!");
			}

			scanner.close();
		}
	}


