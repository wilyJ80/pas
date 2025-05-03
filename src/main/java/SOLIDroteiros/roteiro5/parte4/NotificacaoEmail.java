package SOLIDroteiros.roteiro5.parte4;

public final class NotificacaoEmail implements Notificacao {

	@Override
	public void enviar(String mensagem) {

		System.out.println("Enviando e-mail: " + mensagem);
	}
}
