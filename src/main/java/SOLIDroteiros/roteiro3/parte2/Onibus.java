package SOLIDroteiros.roteiro3.parte2;

public final class Onibus extends VeiculoTransporte {
	private double tarifaBase;

	public Onibus(double tarifaBase) {
		this.tarifaBase = tarifaBase;
	}

	@Override
	public double calcularTarifa() {
		return tarifaBase * 1.2;
	}
}
