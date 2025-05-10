package PADROESroteiros.parte5;

public class Teste {
	public static void main(String[] args) {
		PedidoEletronicos pe = new PedidoEletronicos(1_000.0, "eletronicos");
		PedidoMoveis pm = new PedidoMoveis(2_000.0, "moveis");

		var comum = new FreteComumStrategy();
		var expresso = new FreteExpressoStrategy();

		pe.setFreteStrategy(comum);
		pm.setFreteStrategy(comum);
		try {
			System.out.println("Eletrônicos - frete comum: " + pe.calculaFrete());
			System.out.println("Móveis      - frete comum: " + pm.calculaFrete());
		} catch (Exception e) {
			e.printStackTrace();
		}

		pe.setFreteStrategy(expresso);
		try {
			System.out.println("Eletrônicos - frete expresso: " + pe.calculaFrete());
		} catch (FreteNaoDisponivelException e) {
			System.err.println(e.getMessage());
		}

		pm.setFreteStrategy(expresso);
		try {
			System.out.println("Móveis      - frete expresso: " + pm.calculaFrete());
		} catch (FreteNaoDisponivelException e) {
			System.err.println(e.getMessage());
		}
	}
}
