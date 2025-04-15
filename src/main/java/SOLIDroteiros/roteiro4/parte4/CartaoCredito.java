package SOLIDroteiros.roteiro4.parte4;

public final class CartaoCredito extends Pagamento implements PagamentoReembolsavel {
	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento de R$" + valor + " processado no cartao de credito");
	}

	@Override
	public void gerarFatura() {
		System.out.println("Fatura gerada para o cartao de credito");
	}

	@Override
	public void validarSaldo() {
		System.out.println("Validando saldo disponivel no cartao de credito");
	}

	@Override
	public void processarReembolso(double valor) {
		System.out.println("Estorno de R$" + valor + " realizado no cartao de credito");
	}
}
