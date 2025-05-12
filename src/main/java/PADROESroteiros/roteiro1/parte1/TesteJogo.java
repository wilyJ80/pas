package PADROESroteiros.parte1;

public class TesteJogo {

	public static final void main(final String[] args) {

		System.out.println("Detalhes do jogador de Tenis");
		var guga = new TennisPlayer("Gustavo Kuerten");
		guga.treinar();
		guga.estiloCompetidor();
		guga.definirTatica();
		System.out.println("*************");

		System.out.println("Detalhes do Jogador de Futebol");
		var ronaldo = new SoccerPlayer("Ronaldinho Gaucho");
		ronaldo.treinar();
		ronaldo.estiloCompetidor();
		ronaldo.definirTatica();
		System.out.println("***************");
	}

}
