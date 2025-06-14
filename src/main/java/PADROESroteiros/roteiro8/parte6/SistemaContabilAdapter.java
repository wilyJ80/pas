package PADROESroteiros.roteiro8.parte6;

public abstract class SistemaContabilAdapter {
	protected SistemaContabil sistemacontabil;

	public void finalizarVenda() {
		this.sistemacontabil.registrarVenda();
	}

	public void registrarImposto() {
		this.sistemacontabil.calcularImposto();
	}
}
