package SOLIDroteiros.roteiro6.parte3;

public final class ServicoQuarto {

	private Connection connection;

	public ServicoQuarto(Connection conn) {
		this.connection = conn;
	}

	public void verificarQuarto() {
		this.connection.connect();
		System.out.println("Logica de negocio para o Servico de Quarto");
	}
}
