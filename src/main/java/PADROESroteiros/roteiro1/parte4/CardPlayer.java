package PADROESroteiros.parte4;

public class CardPlayer extends Player {

	public CardPlayer(String nome, RunBehavior habilidadeCorrer) {
		super(nome, habilidadeCorrer);
	}

	@Override
	public void definirTatica() {
		System.out.println(" - E um jogador muito calmo");

	}

}
