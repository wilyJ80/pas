package SOLIDroteiros.roteiro4.parte5;

public abstract class Pagamento {
	public abstract void processarPagamento(double valor);

	public void gerarFatura() {
		System.out.println("Este método não se aplica a esta forma de pagaento.");
	}

	public void validarSaldo() {
		throw new UnsupportedOperationException("Esse metodo de pagamento nao suporta validacao de saldo");
	}
}
