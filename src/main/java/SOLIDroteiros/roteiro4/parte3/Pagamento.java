package SOLIDroteiros.roteiro4.parte3;

public abstract class Pagamento {
	public abstract void processarPagamento(double valor);

	public void gerarFatura() {
		throw new UnsupportedOperationException("Esse metodo de pagamento nao suporta fatura");
	}

	public void validarSaldo() {
		throw new UnsupportedOperationException("Esse metodo de pagamento nao suporta validacao de saldo");
	}
}
