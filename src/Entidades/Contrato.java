package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

	private List<Parcelas> parcela = new ArrayList<>();

	// caracteristicas dos contratos 
	
	private LocalDate data;
	private Double valor;
	private Integer NumeroContrato;

	public Contrato(LocalDate data, Double valor, Integer NumeroContrato) {
		this.data = data;
		this.valor = valor;
		this.NumeroContrato = NumeroContrato;
	}

	public List<Parcelas> getParcela() {
		return parcela;
	}

	public void setParcela(List<Parcelas> parcela) {
		this.parcela = parcela;
	}

	public LocalDate getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}

	public int getNumeroParcela() {
		return NumeroContrato;
	}

}
