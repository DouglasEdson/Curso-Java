import java.util.Locale;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Iniciando curso Java com Prof° Dr. Nelio Alves.");
//		System.out.println(" ");

		int y = 32;
		double x = 10.35784;

		String nome = "Maria";
		Integer idade = 31;
		Double renda = 4000.0;

		System.out.println(y);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", x);
		System.out.println("Resultado em metros: " + x);
		System.out.printf("Resultado em metros: %.2f\n", x);

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
	}

}
