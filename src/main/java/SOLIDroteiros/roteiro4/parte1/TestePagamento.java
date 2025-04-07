package SOLIDroteiros.roteiro4.parte1;

public class TestePagamento {
	public static final void main(final String[] args) {
		MetodoPagamento metodos[] = {
				new CartaoCredito(),
				new BoletoBancario(),
				new Criptomoeda()
		};

		double valor = 100;
		for (MetodoPagamento metodo : metodos) {
			metodo.processarPagamento(valor);
			metodo.gerarFatura();
			valor += 100;
		}
	}
}
