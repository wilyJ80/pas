package PADROESroteiros.parte5;

public class FreteExpressoStrategy implements FreteStrategy {

	@Override
	public double calculaFrete(Pedido pedido) throws FreteNaoDisponivelException {
		String setor = pedido.getSetor();
		if (!podeUsarExpresso(setor)) {
			throw new FreteNaoDisponivelException(
					"Frete expresso não disponível para o setor: " + setor);
		}
		return pedido.getValor() * 0.10;
	}

	private boolean podeUsarExpresso(String setor) {
		// por exemplo: eletrônicos sempre disponível, móveis nem sempre
		return "eletronicos".equalsIgnoreCase(setor);
	}
}
