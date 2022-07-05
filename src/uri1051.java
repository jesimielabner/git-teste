import java.util.Locale;
import java.util.Scanner;

public class uri1051 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		if(x >= 0 && x <= 2000.00) {
			System.out.println("isento");
		}else if(x >= 2000.01 && x <= 3000.00) {
			System.out.printf("R$ %.2f%n",(x-2000.00)*0.08);
		}else if(x >= 3000.01 && x <= 4500) { 
			System.out.printf("R$ %.2f%n",(x-3000.00)*0.18+(1000.00*0.08));
		}else if(x > 4500.00) {
			System.out.printf("R$ %.2f%n",((x-4500.00)*0.28) + (1000.00*0.08)+(1500.00*0.18));
			
		}
		sc.close();
	}
}
