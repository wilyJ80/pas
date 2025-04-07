package SOLIDroteiros.roteiro3.parte1;

public final class Bicicleta extends VeiculoTransporte {

	public Bicicleta() {
		super(0);
	}

	@Override
	public double calcularTarifa() {
		throw new UnsupportedOperationException("Bicicletas nao tem tarifa!");
	}
}
