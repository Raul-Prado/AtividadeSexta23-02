package diferencaentrenumeros;

import java.util.Scanner;
public class DiferencaNumeros {

	public static void main(String[] args) {
		//variaveis
		float Numero1;
		float Numero2;
		float Numero3;
		float Numero4;
		float DiferencaNumero;
		
		//ler dados
		Scanner scanner = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite Numero 1: ");
		Numero1 = scanner.nextFloat();
		System.out.println("Digite Numero 2: ");
		Numero2 = scanner.nextFloat();
		System.out.println("Digite Numero 3: ");
		Numero3 = scanner.nextFloat();
		System.out.println("Digite Numero 4: ");
		Numero4 = scanner.nextFloat();		
		
		DiferencaNumero = (Numero1*Numero2)- (Numero3*Numero4);
		System.out.println("A diferença entre numeros é:" + DiferencaNumero);

	}

}
