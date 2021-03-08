import java.util.Scanner;

public class Vetores {
	public static final int TAMANHO = 3;
	public static void main(String[] args) {
		
		double vetor[] = new double[TAMANHO];
		double consumoTotal = 0.00;
		
		Scanner leitor = new Scanner(System.in);

		for (int i=0; i<vetor.length;i++) {
			System.out.println("Por favor, digite o consumo do " + (i+1) + "º aluno:");
			vetor[i] = leitor.nextDouble();
			consumoTotal = consumoTotal + vetor[i];
		}
		leitor.close();

		for (int i=0; i<vetor.length;i++) {
			System.out.println("O aluno " + (i+1) + " consumiu R$ " + vetor[i]);	
		}
		System.out.println("O consumo total foi de R$ " + consumoTotal);
				
		
		

	}

}
