import java.util.Scanner;

public class uri1073novo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n;i++) {
			if(i%2==0) {
				System.out.printf("%d^%d = %d%n",i ,2 ,i*i);
			}
		}

	}

}
