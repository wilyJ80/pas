package SOLIDroteiros.roteiro6.parte3;

public final class SqlServerConnection implements Connection {

	@Override
	public final void connect() {
		System.out.println("Conectando com o SQL Server");
	}
}
