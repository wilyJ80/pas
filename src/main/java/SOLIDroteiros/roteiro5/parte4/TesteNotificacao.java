package SOLIDroteiros.roteiro5.parte4;

public final class TesteNotificacao {

	public static final void main(final String[] args) {

		var email = new NotificacaoEmail();
		var sms = new NotificacaoSMS();
		var push = new NotificacaoPush();
		var whatsapp = new NotificacaoWhatsapp();

		email.enviar("Bem-vindo ao sistema!");
		sms.enviar("Seu codigo de verificacao e 1234");
		push.enviar("Voce tem uma nova mensagem.");
		whatsapp.enviar("Voce recebeu uma mensagem no WhatsApp");

	}
}
