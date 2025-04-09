package SOLIDroteiros.roteiro4.parte2;

public final class TestePagamento {
	public static final void main(final String[] args) {
		var cartao = new CartaoCredito();
		cartao.gerarFatura();
		cartao.processarPagamento(100.0);

		var boleto = new BoletoBancario();
		boleto.processarPagamento(200.0);

		var cripto = new Criptomoeda();
		cripto.processarPagamento(300.0);
	}
}
