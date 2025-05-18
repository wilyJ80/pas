package PADROESroteiros.roteiro3.parte4;

public class TesteNotificacao {

	public static final void main(final String[] args) {

		var newsletter = new Newsletter();

		NotificacaoStrategy email = new NotificacaoEmail();
		NotificacaoStrategy sms = new NotificacaoSMS();
		NotificacaoStrategy whatsapp = new NotificacaoWhatsapp();

		var cli1 = new Cliente("Cliente Jose", "jose@empresa.com", email);
		var cli2 = new Cliente("Cliente Maria", "maria@empresa.com", sms);

		var func01 = new Funcionario("Funcionario Pedro", "pedro@empresa.com", "Diretor", whatsapp);

		var forn01 = new Fornecedor("Fornecedor Pedro", "pedro@empresa.com", "111222333666777", email);

		newsletter.adicionarObserver(cli1);
		newsletter.adicionarObserver(cli2);
		newsletter.adicionarObserver(func01);
		newsletter.adicionarObserver(forn01);

		newsletter.enviarMensagem("Oferta Especial!");

		System.out.println("================================");

		// alteracao e envio de outra mensagem

		newsletter.getObservers().stream()
				.filter(o -> o instanceof Fornecedor)
				.map(o -> (Fornecedor) o)
				.forEach(f -> f.setEstrategiaNotificacao(new NotificacaoWhatsapp()));

		newsletter.enviarMensagem("Oferta Especial!");
	}
}
