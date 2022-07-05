import java.util.Locale;
import java.util.Scanner;

public class uri1046 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		if (horaInicial>horaFinal){
			int horasDeFesta = 0;
			for(;horaInicial!=horaFinal;horaInicial++) {
				horasDeFesta++;
				if(horaInicial==23) {
					horaInicial=-1;
				}
			}
			System.out.println("O JOGO DUROU "+horasDeFesta+" HORA(S)");
		}else if( horaFinal>horaInicial) {
			int horasDeFesta = 0;
			for(;horaInicial!=horaFinal;horaInicial++) {
				horasDeFesta++;
			}
			System.out.println("O JOGO DUROU "+horasDeFesta+" HORA(S)");
		}else{
			System.out.println("O JOGO DUROU 24 HORAS(S)");
		}
		sc.close();
	}

}
