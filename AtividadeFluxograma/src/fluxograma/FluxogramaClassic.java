package fluxograma;

import java.util.Scanner;

public class FluxogramaClassic {

	public static void main(String[] args) {
		// Variaveis
		float Atualsalario;
		float AbonoSalario;
		float NovoSalario;
		
		// ler dados
		Scanner scanner = new Scanner(System.in);
		
		// entrada de dados
		System.out.println("Digite seu Salario: ");
		Atualsalario = scanner.nextFloat();
		
		System.out.println("Digite seu Abono: ");
		AbonoSalario = scanner.nextFloat();
		
		NovoSalario = Atualsalario+AbonoSalario;
		System.out.println("Seu novo salario para o ano de 2024 será:" + NovoSalario);

	}

}
