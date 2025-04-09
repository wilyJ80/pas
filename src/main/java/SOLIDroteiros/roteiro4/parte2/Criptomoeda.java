package SOLIDroteiros.roteiro4.parte2;

public class Criptomoeda implements MetodoPagamento, MetodoPagamentoComSaldo {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento de R$" + valor + " com criptomoeda");
	}

	@Override
	public void validarSaldo() {
		System.out.println("Validando saldo disponível na carteira de criptomoeda");
	}

}
