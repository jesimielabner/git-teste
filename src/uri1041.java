import java.util.Locale;
import java.util.Scanner;

public class uri1041 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x>0 && y>0) {
			System.out.println("Q1");
		}
		if(x<0 && y>0) {
			System.out.println("Q2");
		}
		if(y<0 && x<0) {
			System.out.println("Q3");
		}
		if(x>0 && y<0) {
			System.out.println("Q4");
		}
		if(y==0 && x==0) {
			System.out.println("origem");
		}
	}

}
