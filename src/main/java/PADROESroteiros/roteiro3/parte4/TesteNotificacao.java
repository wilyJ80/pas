package PADROESroteiros.roteiro3.parte4;

public class TesteNotificacao {

	public static final void main(final String[] args) {

		var newsletter = new Newsletter();

		var cli1 = new Cliente("Cliente Jose", "jose@empresa.com");
		var cli2 = new Cliente("Cliente Maria", "maria@empresa.com");

		var func01 = new Funcionario("Funcionario Pedro", "pedro@empresa.com", "Diretor");

		var forn01 = new Fornecedor("Fornecedor Pedro", "pedro@empresa.com", "111222333666777");

		newsletter.adicionarObserver(cli1);
		newsletter.adicionarObserver(cli2);
		newsletter.adicionarObserver(func01);
		newsletter.adicionarObserver(forn01);

		newsletter.enviarMensagem("Oferta Especial!");
	}
}
