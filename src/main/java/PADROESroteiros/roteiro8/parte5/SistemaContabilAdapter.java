package PADROESroteiros.roteiro8.parte5;

public abstract class SistemaContabilAdapter {
	protected SistemaContabil sistemacontabil;

	public void finalizarVenda() {
		this.sistemacontabil.registrarVenda();
	}

	public void registrarImposto() {
		this.sistemacontabil.calcularImposto();
	}
}
