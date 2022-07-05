import java.util.Scanner;

public class uri1173 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] lista = new int[10];
		int n = sc.nextInt();
		lista[0] = n;
		System.out.printf("N[%d] = %d%n",0,lista[0]);
		for(int i=1;i<10; i++) {
			lista[i] = lista[i-1]*2;
			System.out.printf("N[%d] = %d%n",i,lista[i]);
			
		}
		sc.close();
	}

}
