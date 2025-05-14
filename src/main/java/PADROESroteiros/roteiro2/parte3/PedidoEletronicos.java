package PADROESroteiros.roteiro2.parte3;

public class PedidoEletronicos extends Pedido {

	public PedidoEletronicos(double valor, String setor) {
		super(valor, setor);
	}

	@Override
	protected boolean disponivelFrete() {
		return true;
	}

	@Override
	protected double getTaxaFrete() {
		return 0.1;
	}
}
