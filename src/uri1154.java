import java.util.Locale;
import java.util.Scanner;

public class uri1154 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		int cont = 0;
		
		int idades = sc.nextInt();
		
		while(idades>=0) {
			soma += idades;
			cont++;
			idades = sc.nextInt();
		}
		System.out.printf("%.2f%n",soma/cont);
	}

}
