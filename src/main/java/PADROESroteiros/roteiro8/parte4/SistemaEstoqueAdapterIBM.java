package PADROESroteiros.roteiro8.parte4;

public class SistemaEstoqueAdapterIBM implements ISistemaEstoqueAdapter {
	private SistemaEstoque sistemaEstoque;

	public SistemaEstoqueAdapterIBM() {
		this.sistemaEstoque = new SistemaEstoque("IBM");
	}

	// metodos

	@Override
	public void diminuirQuantidadeItem() {
		this.sistemaEstoque.removerItemEstoque();
	}

	@Override
	public void aumentarQuantidadeItem() {
		this.sistemaEstoque.adicionarItemEstoque();

	}
}
