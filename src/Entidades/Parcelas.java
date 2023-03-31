package Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// oque cada parcela recebe

public class Parcelas {

	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate dataVencimento;
	private Double valor;

	public Parcelas(LocalDate dataVencimento, Double valor) {
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public Double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return dataVencimento.format(fmt) + " - " + String.format("%.2f", valor);
		
	}

}
