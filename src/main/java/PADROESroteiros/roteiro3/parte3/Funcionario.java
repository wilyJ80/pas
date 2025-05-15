package PADROESroteiros.roteiro3.parte3;

public class Funcionario implements Observer {

	private String nome;
	private String email;
	private String cargo;

	public Funcionario(String nome, String email, String cargo) {
		this.nome = nome;
		this.email = email;
		this.cargo = cargo;
	}

	@Override
	public void update(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("------------ NOTIFICACAO FUNCIONARIO ----------");
		System.out.println("Email enviado para " + nome + "(" + email + ")");
		System.out.println("Mensagem: " + mensagem);
		System.out.println("----------------------");

	}
}
