import java.util.Scanner;

public class uri1042 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int maior = 0; 
		int segundo = 0;
		int terceiro = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a >= b && a >=c) {
			maior = a;
			segundo = b;
			terceiro = c;
		}
		if(b>=a && b>=c) {
			maior = b;
			segundo = a;
			terceiro = c;
		}
		if(c>=a && c>=b) {
			maior = c;
			segundo = b;
			terceiro = a;
		}
		if(segundo >= terceiro) {
			System.out.println(terceiro);
			System.out.println(segundo);
			System.out.println(maior);
		}else {
			System.out.println(segundo);
			System.out.println(terceiro);
			System.out.println(maior);
		}
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
	}

}
