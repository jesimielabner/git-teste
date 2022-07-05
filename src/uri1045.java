import java.util.Locale;
import java.util.Scanner;

public class uri1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float menor,maior,meio;
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		if(a>=b && a>=c){
			maior = a;
			meio = b;
			menor = c;
	    }
		if(b>=a && b>=c){
			maior = b;
			meio = a;
			menor = c;
		}else {
			maior = c;
			meio = a;
			menor = b;
		}
		if(maior >= meio + menor){
			System.out.printf("NAO FORMA TRIANGULO\n");
		} else {
		    if(maior*maior == meio*meio + menor*menor){
    			System.out.printf("TRIANGULO RETANGULO\n");
    		}
    		if(maior*maior > meio*meio + menor*menor){
    			System.out.printf("TRIANGULO OBTUSANGULO\n");
    		}
    		if(maior* maior < meio*meio + menor*menor){
    			System.out.printf("TRIANGULO ACUTANGULO\n");
    		}
    		if(maior == meio && maior == menor){
    			System.out.printf("TRIANGULO EQUILATERO\n");
    		}
    		if(maior == meio && maior != menor && menor != meio){
    			System.out.printf("TRIANGULO ISOSCELES\n");
    		}
    		if(meio == menor && maior != meio && maior != menor){
    			System.out.printf("TRIANGULO ISOSCELES\n");
    		}
    		if(maior == menor && menor != meio && maior != meio){
    			System.out.printf("TRIANGULO ISOSCELES\n");
    		}
		} 
		sc.close();
	}
}