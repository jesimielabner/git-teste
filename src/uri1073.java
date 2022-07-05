import java.util.Scanner;

public class uri1073 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		for (int i = 0; i < n; i++) {
			int daVez = sc.nextInt();
			if (daVez >= 10 && daVez <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.printf("%d in%n", in);
		System.out.printf("%d out%n", out);
	}
}