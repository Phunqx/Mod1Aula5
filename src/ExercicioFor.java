import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int colaboradores = 10, placa;
		String nome, setor, meio;
		for(int i=0; i<colaboradores; i++) {
			System.out.println("Qual seu nome?");
			nome = leitor.next();
			System.out.println("Qual seu setor?");
			setor = leitor.next();
			System.out.println("Qual seu meio de transporte?");
			meio = leitor.next();
			if(meio.equalsIgnoreCase("ônibus")) {
				System.out.println("Rodízio não se aplica");
			}
			else {
				System.out.println("Qual o último dígito da sua placa?");
				placa = leitor.nextInt();
				System.out.print("Seu dia de rodízio é ");
				if(placa == 1 || placa == 2)
					System.out.println("segunda-feira");
				else if(placa == 3 || placa == 4)
					System.out.println("terça-feira");
				else if(placa == 5 || placa == 6)
					System.out.println("quarta-feira");
				else if(placa == 7 || placa == 8)
					System.out.println("quinta-feira");
				else
					System.out.println("sexta-feira");
			}
		}
		
		leitor.close();
	}

}
