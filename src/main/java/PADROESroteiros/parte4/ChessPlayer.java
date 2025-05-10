package PADROESroteiros.parte4;

public class ChessPlayer extends Player {

	public ChessPlayer(String nome, RunBehavior habilidadeCorrer) {
		super(nome, habilidadeCorrer);
	}

	@Override
	public void definirTatica() {
		System.out.println(super.nome + " - Domina o centro do tabuleiro");
	}

}
