package dio.trilha.java.basico;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Por favor, digite o nome do cliente: ");
		String nomeCliente = sc.nextLine();
		System.out.println("Por favor, digite o número da agência: ");
		String numeroAgencia = sc.nextLine();
		System.out.println("Por favor, digite o número da conta:" );
		int numeroConta = sc.nextInt();
		System.out.println("Por favor, digite o saldo: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência"
				+ " é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível"
						+ " para saque");
		
		sc.close();
	}

}