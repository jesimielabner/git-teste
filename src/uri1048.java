import java.util.Locale;
import java.util.Scanner;

public class uri1048 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double reajuste;
		double novoSalario;
		double porcentagem;
		
		if(salario >= 0 && salario <= 400) {
			reajuste = salario*0.15;
			novoSalario = salario+reajuste;
			porcentagem = 15;
		} else if(salario>400 && salario<=800) {
			reajuste = salario * 0.12;
			novoSalario = salario + reajuste;
			porcentagem = 12;
		} else if(salario > 800 && salario <= 1200) {
			reajuste = salario * 0.10 ;
			novoSalario = salario + reajuste ;
			porcentagem = 10;
		} else if(salario > 1200 && salario <= 2000) {
			reajuste = salario * 0.07;
			novoSalario = salario + reajuste ;
			porcentagem = 7;
		} else {
			reajuste = salario * 0.04 ;
			novoSalario = salario + reajuste ;
			porcentagem = 4;
		}
		
		System.out.printf("Novo salario: %.2f%n",novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n",reajuste);
		System.out.printf("Em percentual: %.0f %%",porcentagem);
		System.out.println();
	}	
}
