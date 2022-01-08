
public class exercicio01 {
	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";

		Integer age = 30;
		Integer code = 5290;
		Character gender = 'F';

		Double price1 = 2100.0;
		Double price2 = 650.50;
		Double measure = 53.234567;

		System.out.println("Products:");
		System.out.print(product1 + ", which price is $ " + price1 + "\n");
		System.out.print(product2 + ", which price is $ " + price2 + "\n\n");

		System.out.println("Record: " + age + "years old, code" + code + "and gender: " + gender + "\n");

		System.out.println("Measure with eight decimal places: " + measure);
		System.out.println("Rouded (three decimal places): " + measure);
		System.out.println("US decimal pointit : " + measure);
	}

}
