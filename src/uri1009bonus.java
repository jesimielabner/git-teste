import java.util.Locale;
import java.util.Scanner;

public class uri1009bonus {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma;
		String vendedor = sc.nextLine();
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		
		soma = salario + (0.15*vendas);
		System.out.printf("TOTAL = R$ %.2f%n",soma);
		sc.close();
	}
}
