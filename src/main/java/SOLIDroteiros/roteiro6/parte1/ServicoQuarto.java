package SOLIDroteiros.roteiro6.parte1;

public final class ServicoQuarto {

	private MysqlConnection connection;

	public ServicoQuarto() {
		this.connection = new MysqlConnection();
	}

	public void verificarQuarto() {
		this.connection.connect();
		System.out.println("Logica de negocio para o Servico de Quarto");
	}
}
