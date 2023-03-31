package Serviços;

public class PayPal implements PagamentoOnline {

	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;

	@Override
	public double taxaPagamento(double valor) {
		return valor * FEE_PERCENTAGE;
	}

	@Override
	public double Juros(double valor, int meses) {
		return valor * MONTHLY_INTEREST * meses;
	}

}
// o serviço do PayPal implementando a interface