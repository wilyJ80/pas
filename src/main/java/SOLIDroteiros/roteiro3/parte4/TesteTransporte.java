package SOLIDroteiros.roteiro3.parte4;

public final class TesteTransporte {

	public static final void main(final String[] args) {

		VeiculoTransporte veiculos[] = {
				new Onibus(5.0, 10.0),
				new Bicicleta(10.0)
		};

		for (VeiculoTransporte veiculo : veiculos) {
			System.out.println("Tarifa: " + veiculo.calcularTarifa());
			System.out.println("Distancia: " + veiculo.getDistancia());
			if (veiculo instanceof Onibus) {
				System.out.println("Consumo Total: " + ((Onibus) veiculo).calcularTotalCombustivel(12.0));
			} else {
				System.err.println("Veiculo nao e motorizado");
			}
		}
	}
}
