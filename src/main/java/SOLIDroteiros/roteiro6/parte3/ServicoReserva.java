package SOLIDroteiros.roteiro6.parte3;

public final class ServicoReserva {

	private Connection connection;

	public ServicoReserva(Connection conn) {
		this.connection = conn;
	}

	public void criarReserva() {
		this.connection.connect();
		System.out.println("Logica de negocio para a Reserva de Quarto");
	}
}
