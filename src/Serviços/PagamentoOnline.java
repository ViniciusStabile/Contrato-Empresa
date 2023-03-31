package Serviços;

public interface PagamentoOnline {

	public double taxaPagamento(double valor);

	public double Juros(double valor, int meses);
}
// uma interface pois futuramente 
//pode haver mais modos de pagamento online