package PADROESroteiros.roteiro3.parte2;

public class TesteNotificacao {

	public static final void main(final String[] args) {

		var newsletter = new Newsletter();

		var cli1 = new Cliente("Cliente Jose", "jose@empresa.com");
		var cli2 = new Cliente("Cliente Maria", "maria@empresa.com");

		newsletter.adicionarObserver(cli1);
		newsletter.adicionarObserver(cli2);

		newsletter.enviarMensagem("Oferta Especial!");
	}
}
