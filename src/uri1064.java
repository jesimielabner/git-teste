import java.util.Locale;
import java.util.Scanner;

public class uri1064 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		double media = 0;
		double x;
		
		for(int i=0;i<6;i++) {
			x = sc.nextDouble();
			if(x>0) {
				cont++;
				media += x;
			}
		}
		media = media/cont;
		System.out.println(cont + " valores positivos");
		System.out.println(String.format("%.1f", media));
	}

}
