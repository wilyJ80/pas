package PADROESroteiros.roteiro8.parte5;

public class SistemaContabil {
    private String nome;

    public SistemaContabil(String nome) {
        this.nome = nome;
    }

    public void registrarVenda() {
        System.out.println("Venda Registrada no " + this.nome + " - Sistema Contabil \n");
    }

    public void calcularImposto() {
        System.out.println("Imposto calculado no " + this.nome + " - Sistema Contabil \n");

    }

}
