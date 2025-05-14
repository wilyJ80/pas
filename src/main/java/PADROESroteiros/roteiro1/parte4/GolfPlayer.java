package PADROESroteiros.roteiro1.parte4;

public class GolfPlayer extends Player {

	public GolfPlayer(String nome, RunBehavior habilidadeCorrer) {
		super(nome, habilidadeCorrer);
	}

	@Override
	public void definirTatica() {
		System.out.println(" - Pontua com o no. de tacadas previstas");
	}
}
