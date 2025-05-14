package PADROESroteiros.roteiro2.parte3;

public abstract class Pedido {
	private double valor;
	private String setor;

	public Pedido(double valor, String setor) {
		this.valor = valor;
		this.setor = setor;
	}

	public double getValor() {
		return valor;
	}

	public String getSetor() {
		return setor;
	}

	public double calculaFrete() throws FreteNaoDisponivelException {
		if (!disponivelFrete()) {
			throw new FreteNaoDisponivelException("Frete nao disponivel para o setor: " + setor);
		}
		return getTaxaFrete() * valor;
	}

	protected abstract boolean disponivelFrete();

	protected abstract double getTaxaFrete();
}
