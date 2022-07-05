import java.util.Locale;
import java.util.Scanner;

public class uri1040 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		
		float media;
		
		media = ( (n1*2) + (n2*3) + (n3*4) + (n4*1) ) /10;
		System.out.printf("Media: %.1f%n",media);
		
		if(media>=7) {
			System.out.println("Aluno aprovado.");
		} else if(media<5) {
			System.out.println("Aluno reprovado.");
		} else if(media>=5 && media<7) {
			System.out.println("Aluno em exame.");
			float exame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n",exame);
			media = (media + exame)/2f;
			
			if(media>=5) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n",media);
		}
		
	}
}
