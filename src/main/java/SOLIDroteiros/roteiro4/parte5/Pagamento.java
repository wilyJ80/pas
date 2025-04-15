package SOLIDroteiros.roteiro4.parte5;

public abstract class Pagamento {
	public abstract void processarPagamento(double valor);

	public abstract void gerarFatura();

	public void validarSaldo() {
		throw new UnsupportedOperationException("Esse metodo de pagamento nao suporta validacao de saldo");
	}
}
