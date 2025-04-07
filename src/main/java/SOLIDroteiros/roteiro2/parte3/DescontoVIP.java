package SOLIDroteiros.roteiro2.parte3;

public final class DescontoVIP implements RegraDesconto {

	@Override
	public final double calcular(double total) {
		return total * 0.8;
	}

}
