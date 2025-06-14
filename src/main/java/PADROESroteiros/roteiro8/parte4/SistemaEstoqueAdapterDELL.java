package PADROESroteiros.roteiro8.parte4;

public class SistemaEstoqueAdapterDELL implements ISistemaEstoqueAdapter {
	private SistemaEstoque sistemaEstoque;

	public SistemaEstoqueAdapterDELL() {
		this.sistemaEstoque = new SistemaEstoque("DELL");
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
