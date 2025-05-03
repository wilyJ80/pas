package SOLIDroteiros.roteiro6.parte3;

public final class TesteConexao {

	public static final void main(final String[] args) {

		var mysqlConn = new MysqlConnection();
		var oracleConn = new OracleConnection();
		var sqlServerConn = new SqlServerConnection();

		ServicoQuarto quarto = new ServicoQuarto(mysqlConn);
		quarto.verificarQuarto();

		ServicoReserva reserva = new ServicoReserva(oracleConn);
		reserva.criarReserva();

		RelatorioReserva relatorio = new RelatorioReserva(sqlServerConn);
		relatorio.gerarRelatorio();
	}
}
