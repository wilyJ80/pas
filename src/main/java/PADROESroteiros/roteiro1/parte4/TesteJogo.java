package PADROESroteiros.roteiro1.parte4;

public class TesteJogo {

	public static final void main(final String[] args) {

		var correRapido = new RunFast();
		var naoCorre = new RunNoWay();

		System.out.println("Detalhes do jogador de Tenis");
		var guga = new TennisPlayer("Gustavo Kuerten", correRapido);
		guga.treinar();
		guga.estiloCompetidor();
		guga.definirTatica();
		guga.correr();
		System.out.println("****************");

		System.out.println("Detalhes do Jogador de Futebol");
		var ronaldo = new SoccerPlayer("Ronaldinho Gaucho", correRapido);
		ronaldo.treinar();
		ronaldo.estiloCompetidor();
		ronaldo.definirTatica();
		ronaldo.correr();
		System.out.println("****************");

		System.out.println("Detalhes do Jogador de Cartas");
		var josecartas = new CardPlayer("Jose das Cartas", naoCorre);
		josecartas.treinar();
		josecartas.estiloCompetidor();
		josecartas.definirTatica();
		josecartas.correr();
		System.out.println("****************");

		System.out.println("Detalhes do Jogador de Xadrez");
		var kasparov = new ChessPlayer("Kasparov", naoCorre);
		kasparov.treinar();
		kasparov.definirTatica();
		kasparov.correr();
		System.out.println("****************");

		System.out.println("Detalhes do Jogador de Golf");
		var tigerwoods = new GolfPlayer("Tiger Woods", naoCorre);
		tigerwoods.treinar();
		tigerwoods.estiloCompetidor();
		tigerwoods.definirTatica();
		tigerwoods.correr();
		System.out.println("****************");
	}
}
