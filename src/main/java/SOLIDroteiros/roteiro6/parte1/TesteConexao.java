package SOLIDroteiros.roteiro6.parte1;

public final class TesteConexao {

	public static final void main(final String[] args) {

		ServicoQuarto quarto = new ServicoQuarto();
		quarto.verificarQuarto();

		ServicoReserva reserva = new ServicoReserva();
		reserva.criarReserva();

		RelatorioReserva relatorio = new RelatorioReserva();
		relatorio.gerarRelatorio();
	}
}
