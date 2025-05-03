package SOLIDroteiros.roteiro6.parte3;

public sealed interface Connection permits MysqlConnection, OracleConnection, SqlServerConnection {
	public void connect();
}
