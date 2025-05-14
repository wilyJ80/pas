package PADROESroteiros.roteiro3.parte1;

public class TesteNotificacao {

	public static final void main(final String[] args) {

		var newsletter = new Newsletter();

		var cli1 = new Cliente("Cliente Jose", "jose@empresa.com");
		var cli2 = new Cliente("Cliente Maria", "maria@empresa.com");

		newsletter.adicionarCliente(cli1);
		newsletter.adicionarCliente(cli2);

		newsletter.enviarMensagem("Oferta Especial!");
	}
}
