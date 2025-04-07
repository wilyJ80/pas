package SOLIDroteiros.roteiro3.parte3;

public final class TesteTransporte {

	public static final void main(final String[] args) {
		VeiculoTransporte veiculos[] = {
				new Onibus(5.0, 10.0),
				new Bicicleta(10.0)
		};

		for (VeiculoTransporte veiculo : veiculos) {
			System.out.println("Tarifa: " + veiculo.calcularTarifa());
			System.out.println("Distancia: " + veiculo.getDistancia());
			System.out.println("Consumo Total: " + veiculo.calcularTotalCombustivel(12));
		}
	}
}
