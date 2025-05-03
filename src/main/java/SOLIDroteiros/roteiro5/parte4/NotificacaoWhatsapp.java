package SOLIDroteiros.roteiro5.parte4;

public final class NotificacaoWhatsapp implements Notificacao {

	@Override
	public void enviar(String mensagem) {

		System.out.println("Enviando Whatsapp: " + mensagem);
	}
}
