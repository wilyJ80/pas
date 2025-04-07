package SOLIDroteiros.roteiro2.parte3;

public final class DescontoPadrao implements RegraDesconto {

	@Override
	public final double calcular(double total) {
		return total * 0.9;
	}

}
