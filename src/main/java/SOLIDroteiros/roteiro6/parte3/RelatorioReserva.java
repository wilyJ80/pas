package SOLIDroteiros.roteiro6.parte3;

public final class RelatorioReserva {

	private Connection connection;

	public RelatorioReserva(Connection conn) {
		this.connection = conn;
	}

	public void gerarRelatorio() {
		this.connection.connect();
		System.out.println("Logica de negocio para a geracao do relatorio");
	}
}
