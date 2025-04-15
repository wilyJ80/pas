package SOLIDroteiros.roteiro4.parte4;

public final class BoletoBancario extends Pagamento implements PagamentoReembolsavel {
	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento de R$" + valor + " processado no boleto");
	}

	@Override
	public void gerarFatura() {
		System.out.println("Fatura gerada para o boleto");
	}

	@Override
	public void processarReembolso(double valor) {
		System.out.println("Estorno de R$" + valor + " realizado no boleto");
	}
}
