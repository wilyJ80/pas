package PADROESroteiros.roteiro1.parte2;

public class GolfPlayer extends Player {

	public GolfPlayer(String nome) {
		super(nome);
	}

	@Override
	public void definirTatica() {
		System.out.println(" - Pontua com o no. de tacadas previstas");
	}

	@Override
	public void correr() {
	}
}
