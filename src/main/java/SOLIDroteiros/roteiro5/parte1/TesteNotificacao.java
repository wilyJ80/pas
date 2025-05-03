package SOLIDroteiros.roteiro5.parte1;

public final class TesteNotificacao {

	public static final void main(String[] args) {
		var notificacao = new NotificacaoService();

		notificacao.enviarNotificacaoEmail("Bem-vindo ao sistema!");
		notificacao.enviarNotificacaoSMS("Seu codigo de verificacao e 1234");
		notificacao.enviarNotificacaoPush("Voce tem uma nova mensagem.");
	}
}
