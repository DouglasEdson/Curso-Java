import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		System.out.println("Exercício 04");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a hora inicial: ");
		
		Integer horaInicial = scanner.nextInt();

		System.out.print("Digite a hora final: ");

		Integer horaFinal = scanner.nextInt();

		Integer duracao;

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		scanner.close();

	}

}
