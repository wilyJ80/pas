package PADROESroteiros.roteiro3.parte4;

public class Funcionario implements Observer {

	private String nome;
	private String email;
	private String cargo;
	private NotificacaoStrategy estrategiaNotificacao;

	public Funcionario(String nome, String email, String cargo, NotificacaoStrategy estrategiaNotificacao) {
		this.nome = nome;
		this.email = email;
		this.cargo = cargo;
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
		return "FUNCIONARIO";
	}
}
