package salario;

import java.util.Scanner;

public class SalarioClass {

	public static void main(String[] args) {
		//variaveis
		float SalarioBruto;
		float AdicionalNoturno;
		float HorasExtras;
		float Descontos;
		float SalarioLiquido;
		
		//ler dados
		Scanner scanner = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite seu salario bruto: ");
		SalarioBruto = scanner.nextFloat();
		System.out.println("Digite seu adicional noturno: ");
		AdicionalNoturno = scanner.nextFloat();
		System.out.println("Digite suas horas extras em R$ ");
		HorasExtras = scanner.nextFloat();
		System.out.println("Digite seus descontos: ");
		Descontos = scanner.nextFloat();
		
		SalarioLiquido = SalarioBruto+AdicionalNoturno+(HorasExtras*5)-Descontos;
		System.out.println("Seu salario é:" + SalarioLiquido);
		
	}

}
