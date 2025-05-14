package PADROESroteiros.roteiro2.parte3;

public class PedidoMoveis extends Pedido {
	public PedidoMoveis(double valor, String setor) {
		super(valor, setor);
	}

	@Override
	protected boolean disponivelFrete() {
		return "moveis".equalsIgnoreCase(getSetor());
	}

	@Override
	protected double getTaxaFrete() {
		return 0.05;
	}
}
