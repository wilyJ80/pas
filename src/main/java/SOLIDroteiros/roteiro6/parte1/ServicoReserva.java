package SOLIDroteiros.roteiro6.parte1;

public final class ServicoReserva {

	private MysqlConnection connection;

	public ServicoReserva() {
		this.connection = new MysqlConnection();
	}

	public void criarReserva() {
		this.connection.connect();
		System.out.println("Logica de negocio para a Reserva de Quarto");
	}
}
