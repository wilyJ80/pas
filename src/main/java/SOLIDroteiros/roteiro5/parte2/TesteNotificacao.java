package SOLIDroteiros.roteiro5.parte2;

public final class TesteNotificacao {

	public static final void main(final String[] args) {

		var service1 = new NotificacaoService(new NotificacaoEmail());
		var service2 = new NotificacaoService(new NotificacaoSMS());
		var service3 = new NotificacaoService(new NotificacaoPush());

		service1.enviarNotificacao("Bem-vindo ao sistema!");
		service2.enviarNotificacao("Seu codigo de verificacao e 1234.");
		service3.enviarNotificacao("Voce tem uma nova mensagem.");
	}
}
