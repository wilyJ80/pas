package SOLIDroteiros.roteiro6.parte1;

public final class RelatorioReserva {

	private MysqlConnection connection;

	public RelatorioReserva() {
		this.connection = new MysqlConnection();
	}

	public void gerarRelatorio() {
		this.connection.connect();
		System.out.println("Logica de negocio para a geracao do relatorio");
	}
}
