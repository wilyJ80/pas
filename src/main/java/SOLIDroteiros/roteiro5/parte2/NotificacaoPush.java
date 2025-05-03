package SOLIDroteiros.roteiro5.parte2;

public final class NotificacaoPush implements Notificacao {

	@Override
	public void enviar(String mensagem) {

		System.out.println("Enviando Push Notification: " + mensagem);
	}
}
