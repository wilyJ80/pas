package PADROESroteiros.roteiro3.parte4;

public class Fornecedor implements Observer {

	private String nome;
	private String email;
	private String cnpj;
	private NotificacaoStrategy estrategiaNotificacao;

	public Fornecedor(String nome, String email, String cnpj, NotificacaoStrategy estrategiaNotificacao) {
		this.nome = nome;
		this.email = email;
		this.cnpj = cnpj;
		this.estrategiaNotificacao = estrategiaNotificacao;
	}

	@Override
	public void update(String mensagem) {
		System.out.println("------------ NOTIFICACAO FORNECEDOR ----------");
		System.out.println("Email enviado para " + nome + "(" + email + ")");
		System.out.println("Mensagem: " + mensagem);
		System.out.println("----------------------");
	}

	@Override
	public String getTipoObserver() {
		return "FORNECEDOR";
	}
}
