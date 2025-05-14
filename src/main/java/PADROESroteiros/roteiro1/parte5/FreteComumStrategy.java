package PADROESroteiros.roteiro1.parte5;

public class FreteComumStrategy implements FreteStrategy {
	@Override
	public double calculaFrete(Pedido pedido) {
		return pedido.getValor() * 0.05;
	}
}
