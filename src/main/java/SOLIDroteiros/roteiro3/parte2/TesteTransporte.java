package SOLIDroteiros.roteiro3.parte2;

public final class TesteTransporte {

	public static final void main(final String[] args) {
		final var onibus = new Onibus(5.0);
		System.out.println("Tarifa Onibus: R$" + onibus.calcularTarifa());

		try {
			final var bicicleta = new Bicicleta();
			System.out.println("Tarifa Bicicleta: R$" + bicicleta.calcularTarifa());
		} catch (UnsupportedOperationException e) {
			System.out.println("Bicicletas nao tem tarifa, entao ignoramos esse calculo.");
		}
	}
}
