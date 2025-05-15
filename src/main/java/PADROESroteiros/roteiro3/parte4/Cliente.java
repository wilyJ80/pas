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
		// TODO:
	}

	@Override
	public String getTipoObserver() {
		return "CLIENTE";
	}
}
