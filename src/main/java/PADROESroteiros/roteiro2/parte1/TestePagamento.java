package PADROESroteiros.roteiro2.parte1;

public class TestePagamento {

	public static final void main(final String[] args) {

		final var gateway = new Gateway();
		final double valor = 1000;

		var pagtoCredito = new PagamentoCredito(valor, gateway);
		pagtoCredito.realizarCobranca();
		System.out.println("******************");

		var pagtoDebito = new PagamentoDebito(valor, gateway);
		pagtoDebito.realizarCobranca();
		System.out.println("******************");

		var pagtoDinheiro = new PagamentoDinheiro(valor, gateway);
		pagtoDinheiro.realizarCobranca();
	}

}
