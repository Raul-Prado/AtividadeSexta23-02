package notamedia;

import java.util.Scanner;

public class NotamediaClass {

	public static void main(String[] args) {
		//variaveis
		float NotaAluno1;
		float NotaAluno2;
		float NotaAluno3;
		float NotaAluno4;
		float NotaMediaAluno;
		
		//ler entrada de dados
		Scanner scanner = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite sua primeira nota: ");
		NotaAluno1 = scanner.nextFloat();
		System.out.println("Digite sua segunda nota: ");
		NotaAluno2 = scanner.nextFloat();
		System.out.println("Digite sua terceira nota: ");
		NotaAluno3 = scanner.nextFloat();
		System.out.println("Digite sua quarta nota: ");
		NotaAluno4 = scanner.nextFloat();
		
		NotaMediaAluno = (NotaAluno1+NotaAluno2+NotaAluno3+NotaAluno4)/4;
		
		System.out.println("Nota média é: " + NotaMediaAluno);
		
	} 

}
