package PADROESroteiros.roteiro8.parte3;

public class ControladorRegistradora {

    private ISistemaContabilAdapter sistemacontabilAdapter;
    private ISistemaEstoqueAdapter sistemaestoqueAdapter;

    public ControladorRegistradora() {
        System.out.println("Controlador de Registradora Criado");
    }

    public void criarSistemaContabilAdapter(String nome) {
        if (nome.equals("IBM"))
            this.sistemacontabilAdapter = new SistemaContabilAdapterIBM();
        else if (nome.equals("DELL"))
            this.sistemacontabilAdapter = new SistemaContabilAdapterDELL();
    }

    public void criarSistemaEstoqueAdapter(String nome) {
        if (nome.equals("IBM"))
            this.sistemaestoqueAdapter = new SistemaEstoqueAdapterIBM();
        else if (nome.equals("DELL"))
            this.sistemaestoqueAdapter = new SistemaEstoqueAdapterDELL();
    }

    public void diminuirQuantidadeItem() {
        this.sistemaestoqueAdapter.diminuirQuantidadeItem();
    }

    public void registrarVendaSistemaContabil() {
        this.sistemacontabilAdapter.finalizarVenda();
    }
}
