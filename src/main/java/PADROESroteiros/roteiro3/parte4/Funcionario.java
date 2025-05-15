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
		// TODO Auto-generated method stub
		System.out.println("------------ NOTIFICACAO FUNCIONARIO ----------");
		System.out.println("Email enviado para " + nome + "(" + email + ")");
		System.out.println("Mensagem: " + mensagem);
		System.out.println("----------------------");

	}

	@Override
	public String getTipoObserver() {
		return "FORNECEDOR";
	}
}
