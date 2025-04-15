package SOLIDroteiros.roteiro4.parte5;

public final class Criptomoeda extends Pagamento {
	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento de R$" + valor + " processado na criptomoeda");
	}

	@Override
	public void gerarFatura() {
	}
}
