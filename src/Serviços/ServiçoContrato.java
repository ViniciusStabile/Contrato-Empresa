package Serviços;

import java.time.LocalDate;

import Entidades.Contrato;
import Entidades.Parcelas;

public class ServiçoContrato {

	private PagamentoOnline pagamentoOnline;

	public ServiçoContrato(PagamentoOnline pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}

	// serviço do contrato onde ele separa cada parcela
	// e define o valor de cada uma
	
	public void processoContrato(Contrato contrato, int meses) {

		double valorBasico = contrato.getValor() / meses;

		for (int i = 1; i <= meses; i++) {
			LocalDate dataVencimento = contrato.getData().plusMonths(i);
			double juros = pagamentoOnline.Juros(valorBasico, i);
			double taxa = pagamentoOnline.taxaPagamento(valorBasico + juros);
			double pagamentoTotal = juros + taxa + valorBasico;
			contrato.getParcela().add(new Parcelas(dataVencimento, pagamentoTotal));

		}
	}

}
