package PADROESroteiros.roteiro8.parte5;

public class ControladorRegistradora {

    private SistemaContabilAdapter sistemacontabilAdapter;
    private SistemaEstoqueAdapter sistemaestoqueAdapter;

    public ControladorRegistradora() {
        System.out.println("Controlador de Registradora Criado");
    }

    public void criarSistemaContabilAdapter(String nome) {
        if (nome.equals("IBM"))
            this.sistemacontabilAdapter = new SistemaContabilAdapterIBM();
        else if (nome.equals("DELL"))
            this.sistemacontabilAdapter = new SistemaContabilAdapterDELL();
        else if (nome.equals("SAP"))
            this.sistemacontabilAdapter = new SistemaContabilAdapterSAP();
    }

    public void criarSistemaEstoqueAdapter(String nome) {
        if (nome.equals("IBM"))
            this.sistemaestoqueAdapter = new SistemaEstoqueAdapterIBM();
        else if (nome.equals("DELL"))
            this.sistemaestoqueAdapter = new SistemaEstoqueAdapterDELL();
        else if (nome.equals("SAP"))
            this.sistemaestoqueAdapter = new SistemaEstoqueAdapterSAP();
    }

    public void diminuirQuantidadeItem() {
        this.sistemaestoqueAdapter.diminuirQuantidadeItem();
    }

    public void registrarVendaSistemaContabil() {
        this.sistemacontabilAdapter.finalizarVenda();
    }
}
