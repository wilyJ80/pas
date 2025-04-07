package SOLIDroteiros.roteiro3.parte3;

public final class Onibus extends VeiculoTransporte {
	private double tarifaBase;
	private double consumoPorKm;

	public Onibus(double tarifaBase, double distancia) {
		super(distancia);
		this.tarifaBase = tarifaBase;
	}

	@Override
	public double calcularTarifa() {
		return tarifaBase * 1.2;
	}

	@Override
	public double calcularTotalCombustivel(double consumoPorKm) {
		this.consumoPorKm = consumoPorKm;
		return this.consumoPorKm * this.getDistancia();
	}
}
