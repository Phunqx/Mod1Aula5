import java.util.Scanner;

public class EntendendoFor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n, res;
		System.out.println("Qual numero deseja a tabuada?");
		n = leitor.nextInt();
		
		for (int i=1; i<=10; i++) {
			res = n * i;
			System.out.println(res);
		}
		
		leitor.close();
	}

}
