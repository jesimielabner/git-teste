import java.util.Scanner;

public class uri1052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cont = 0;
		int in = 0;
		for(int i=0;i<n;i++) {
			int daVez = sc.nextInt();
			if(n>=10 && n<=20) {
				cont++;
			}else{
				in++;
			}
		}
		System.out.printf("%d%n in",cont);
		System.out.printf("%d%n out",in);
	}
}	