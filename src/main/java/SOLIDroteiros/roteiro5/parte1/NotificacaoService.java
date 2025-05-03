package SOLIDroteiros.roteiro5.parte1;

public final class NotificacaoService {

	public final void enviarNotificacaoEmail(String mensagem) {
		System.out.println("Enviando e-mail: " + mensagem);
	}

	public final void enviarNotificacaoSMS(String mensagem) {
		System.out.println("Enviando SMS: " + mensagem);
	}

	public final void enviarNotificacaoPush(String mensagem) {
		System.out.println("Enviando Push Notification: " + mensagem);
	}
}
