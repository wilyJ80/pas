package PADROESroteiros.roteiro2.parte2;

public class TestePagamento {

	public static final void main(final String[] args) {

		var gateway = new Gateway();
		double valor = 1000;

		var pagtoCredito = new PagamentoCredito(valor, gateway);
		pagtoCredito.realizarCobranca();
		System.out.println("************************");

		var pagtoDebito = new PagamentoDebito(valor, gateway);
		pagtoDebito.realizarCobranca();
		System.out.println("************************");

		var pagtoDinheiro = new PagamentoDinheiro(valor, gateway);
		pagtoDinheiro.realizarCobranca();

	}
}
