package PADROESroteiros.roteiro8.parte6;

public class SistemaEstoque {
    private String nome;

    public SistemaEstoque(String nome) {
        this.nome = nome;
    }

    public void removerItemEstoque() {
        System.out.println("Item removido do estoque no " + this.nome + " - Sistema Estoque \n");
    }

    public void adicionarItemEstoque() {
        System.out.println("Item adicionado no estoque no " + this.nome + " - Sistema Estoque \n");
    }

}
