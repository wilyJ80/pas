package PADROESroteiros.roteiro3.parte4;

public class Cliente implements Observer {

	private String nome;
	private String email;
	private NotificacaoStrategy estrategiaNotificacao;

	public Cliente(String nome, String email, NotificacaoStrategy estrategiaNotificacao) {
		this.nome = nome;
		this.email = email;
		this.estrategiaNotificacao = estrategiaNotificacao;
	}

	@Override
	public void update(String mensagem) {
		String destinatario = (estrategiaNotificacao instanceof NotificacaoEmail) ? email : nome;

		var mensagemFormatada = new StringBuilder();
		mensagemFormatada.append("----- NOTIFICACAO" + getTipoObserver() + "------\n");
		mensagemFormatada.append("Notificacao enviada para " + nome + " (" + destinatario + ")\n");
		mensagemFormatada.append("------------------------\n");

		this.estrategiaNotificacao.enviarMensagem(destinatario, mensagemFormatada.toString());
	}

	@Override
	public String getTipoObserver() {
		return "CLIENTE";
	}

	public void setEstrategiaNotificacao(NotificacaoStrategy estrategiaNotificacao) {
		this.estrategiaNotificacao = estrategiaNotificacao;
	}

}
