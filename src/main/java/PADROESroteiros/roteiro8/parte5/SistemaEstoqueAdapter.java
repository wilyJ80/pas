package PADROESroteiros.roteiro8.parte5;

public abstract class SistemaEstoqueAdapter {
	protected SistemaEstoque sistemaEstoque;

	public void diminuirQuantidadeItem() {
		this.sistemaEstoque.removerItemEstoque();
	}

	public void aumentarQuantidadeItem() {
		this.sistemaEstoque.adicionarItemEstoque();
	}
}
