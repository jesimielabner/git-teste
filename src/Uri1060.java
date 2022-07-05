import java.util.Locale;
import java.util.Scanner;

public class Uri1060 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] numeros = new double[6];
		int contaPositivos = 0;
		
		for(int i=0;i<6;i++) {
			numeros[i] = sc.nextDouble();
			if(numeros[i] >= 0) {
				contaPositivos++;
			}
		}
		System.out.printf("%d valores positivos%n",contaPositivos);
		sc.close();
	}

}
