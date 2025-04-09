package SOLIDroteiros.roteiro4.parte3;

public class TestePagamento {
	public static void main(String[] args) {
		Pagamento cartao = new CartaoCredito();
		cartao.gerarFatura();
		cartao.processarPagamento(100.0);
		if (cartao instanceof PagamentoReembolsavel) {
			((PagamentoReembolsavel) cartao).processarReembolso(50.0);
		}

		Pagamento boleto = new BoletoBancario();
		boleto.gerarFatura();
		boleto.processarPagamento(200.0);
		if (boleto instanceof PagamentoReembolsavel) {
			((PagamentoReembolsavel) boleto).processarReembolso(100.0);
		}

		Pagamento cripto = new Criptomoeda();
		try {
			cripto.gerarFatura();
		} catch (UnsupportedOperationException e) {
			System.err.println("ERRO - Gerar fatura: " + e.getMessage());
		}
		cripto.processarPagamento(300.0);
		if (cripto instanceof PagamentoReembolsavel) {
			((PagamentoReembolsavel) cripto).processarReembolso(100.0);
		}
	}
}
