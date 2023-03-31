package Programa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Contrato;
import Entidades.Parcelas;
import Serviços.PayPal;
import Serviços.ServiçoContrato;

public class programa {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// ler dados do contrato
		System.out.println("Entre com dados do comtrato: ");
		System.out.print("Numero: ");
		int num = sc.nextInt();

		System.out.println("Data do contrato dd/MM/yyyy ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);

		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();

		Contrato contrato = new Contrato(data, valor, num);

		System.out.print("Numero de parcelas: ");
		int parcelas = sc.nextInt();

		ServiçoContrato serviçoContrato = new ServiçoContrato(new PayPal());
		serviçoContrato.processoContrato(contrato, parcelas);

		// Mostrar valor das parcelas

		System.out.println();
		System.out.println("Parcelas:");

		for (Parcelas p : contrato.getParcela()) {
			System.out.println(p);

		}

		sc.close();
	}

}
