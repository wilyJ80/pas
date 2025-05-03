package SOLIDroteiros.roteiro6.parte2;

public final class ServicoQuarto {

	private MysqlConnection connection;
	private OracleConnection oConnection;

	public ServicoQuarto() {
		this.connection = new MysqlConnection();
		this.oConnection = new OracleConnection();
	}

	public void verificarQuarto() {
		this.connection.connect();
		this.oConnection.connect();
		System.out.println("Logica de negocio para o Servico de Quarto");
	}
}
