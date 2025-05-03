package SOLIDroteiros.roteiro6.parte2;

public final class RelatorioReserva {

	private MysqlConnection connection;
	private OracleConnection oConnection;

	public RelatorioReserva() {
		this.connection = new MysqlConnection();
		this.oConnection = new OracleConnection();
	}

	public void gerarRelatorio() {
		this.connection.connect();
		this.oConnection.connect();
		System.out.println("Logica de negocio para a geracao do relatorio");
	}
}
