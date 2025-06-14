package PADROESroteiros.roteiro8.parte6;

public class ControladorContabil {
	private SistemaContabilAdapter sistemacontabilAdapter;
	private AdapterFactory adapterFactory;

	public ControladorContabil() {
		System.out.println("Controlador de Sistema Contabil Criado");
		this.adapterFactory = AdapterFactory.getInstance();
	}

	public void criarSistemaContabilAdapter(String nome) {
		this.sistemacontabilAdapter = this.adapterFactory.criarSistemaContabilAdapter(nome);
	}

	public void calcularImposto() {
		this.sistemacontabilAdapter.registrarImposto();
	}
}
