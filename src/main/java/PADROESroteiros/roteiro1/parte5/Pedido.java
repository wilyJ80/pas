package PADROESroteiros.roteiro1.parte5;

public abstract class Pedido {
	private double valor;
	private String setor;

	private FreteStrategy freteStrategy;

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

	public void setFreteStrategy(FreteStrategy fs) {
		this.freteStrategy = fs;
	}

	public double calculaFrete() throws FreteNaoDisponivelException {
		if (freteStrategy == null) {
			throw new IllegalStateException("Nenhuma strategy de frete configurada");
		}
		return freteStrategy.calculaFrete(this);
	}
}
