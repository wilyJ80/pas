package PADROESroteiros.roteiro2.parte3;

public class Teste {
	public static void main(String[] args) {

		PedidoEletronicos pe = new PedidoEletronicos(1_000.0, "eletronicos");
		PedidoMoveis pm = new PedidoMoveis(2_000.0, "moveis");

		try {
			System.out.println("Eletrônicos - frete: " + pe.calculaFrete());
			System.out.println("Móveis      - frete: " + pm.calculaFrete());
		} catch (FreteNaoDisponivelException e) {
			System.err.println(e.getMessage());
		}
	}
}
