package SOLIDroteiros.roteiro4.parte3;

public final class Criptomoeda extends Pagamento {
	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento de R$" + valor + " processado na criptomoeda");
	}

	@Override
	public void gerarFatura() {
		System.out.println("Validando saldo disponivel na carteira de criptomoeda");
	}
}
