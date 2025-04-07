package SOLIDroteiros.roteiro3.parte4;

public final class Onibus extends VeiculoTransporte implements VeiculoMotorizado {
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
		return this.consumoPorKm * super.getDistancia();
	}
}
