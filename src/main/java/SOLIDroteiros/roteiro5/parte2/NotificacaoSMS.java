package SOLIDroteiros.roteiro5.parte2;

public final class NotificacaoSMS implements Notificacao {

	@Override
	public void enviar(String mensagem) {

		System.out.println("Enviando SMS: " + mensagem);
	}
}
