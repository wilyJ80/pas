package SOLIDroteiros.roteiro5.parte3;

public final class TesteNotificacao {

	public static final void main(final String[] args) {

		var email = new NotificacaoEmail();
		var sms = new NotificacaoSMS();
		var push = new NotificacaoPush();

		email.enviar("Bem-vindo ao sistema!");
		sms.enviar("Seu codigo de verificacao e 1234");
		push.enviar("Voce tem uma nova mensagem.");
	}
}
