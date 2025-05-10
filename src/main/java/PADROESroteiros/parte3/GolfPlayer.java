package PADROESroteiros.parte3;

public class GolfPlayer extends Player {

	public GolfPlayer(String nome) {
		super(nome);
	}

	@Override
	public void definirTatica() {
		System.out.println(" - Pontua com o no. de tacadas previstas");
	}

}
