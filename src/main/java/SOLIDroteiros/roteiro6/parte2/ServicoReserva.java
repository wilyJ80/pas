package SOLIDroteiros.roteiro6.parte2;

public final class ServicoReserva {

	private MysqlConnection connection;
	private OracleConnection oConnection;

	public ServicoReserva() {
		this.connection = new MysqlConnection();
		this.oConnection = new OracleConnection();
	}

	public void criarReserva() {
		this.connection.connect();
		this.oConnection.connect();
		System.out.println("Logica de negocio para a Reserva de Quarto");
	}
}
