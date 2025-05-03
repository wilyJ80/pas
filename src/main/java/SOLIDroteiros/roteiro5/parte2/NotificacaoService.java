package SOLIDroteiros.roteiro5.parte2;

public final class NotificacaoService {

	private Notificacao notificacao;

	public NotificacaoService(Notificacao notificacao) {
		this.notificacao = notificacao;
	}

	public void enviarNotificacao(String mensagem) {
		this.notificacao.enviar(mensagem);
	}
}
