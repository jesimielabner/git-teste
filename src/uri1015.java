import java.util.Locale;
import java.util.Scanner;

public class uri1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma;
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		soma = Math.sqrt( Math . pow (( x2 - x1 ), 2 ) + Math . pow (( y2 - y1 ), 2 ));
		System.out.println(String.format("%.4f",soma));
		sc.close();
    }
		
}

