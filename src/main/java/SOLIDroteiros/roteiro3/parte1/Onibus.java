package SOLIDroteiros.roteiro3.parte1;

public final class Onibus extends VeiculoTransporte {

	public Onibus(double tarifaBase) {
		super(tarifaBase);
	}

	@Override
	public double calcularTarifa() {
		return tarifaBase * 1.2;
	}
}
