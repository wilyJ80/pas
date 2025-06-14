package PADROESroteiros.roteiro8.parte4;

public class TesteControlador {
	public static void main(String[] args) {
		testeControladorContabil();
		testeControladorEstoque();
		testeControladoraRegistradora();
	}

	public static void testeControladorContabil() {
		System.out.println("Criando o Controlador Contabil");
		ControladorContabil controladorcontabil = new ControladorContabil();
		System.out.println("Teste - Contabil DELL");
		controladorcontabil.criarSistemaContabilAdapter("DELL");
		controladorcontabil.calcularImposto();
		System.out.println("Teste - Contabil IBM");
		controladorcontabil.criarSistemaContabilAdapter("IBM");
		controladorcontabil.calcularImposto();
		System.out.println("Teste - Contabil SAP");
		controladorcontabil.criarSistemaContabilAdapter("SAP");
		controladorcontabil.calcularImposto();
	}

	public static void testeControladorEstoque() {
		System.out.println("Criando o Controlador de Estoque");
		ControladorEstoque controladorestoque = new ControladorEstoque();
		System.out.println("Teste - Estoque DELL");
		controladorestoque.criarSistemaEstoqueAdapter("DELL");
		controladorestoque.aumentarQuantidadeItem();
		System.out.println("Teste - Estoque IBM");
		controladorestoque.criarSistemaEstoqueAdapter("IBM");
		controladorestoque.aumentarQuantidadeItem();
		System.out.println("Teste - Estoque SAP");
		controladorestoque.criarSistemaEstoqueAdapter("SAP");
		controladorestoque.aumentarQuantidadeItem();
	}

	public static void testeControladoraRegistradora() {
		System.out.println("Criando o Controlador da Registradora");
		ControladorRegistradora controladorregistradora = new ControladorRegistradora();
		System.out.println("Teste - Estoque DELL");
		controladorregistradora.criarSistemaEstoqueAdapter("DELL");
		controladorregistradora.diminuirQuantidadeItem();
		System.out.println("Teste - Estoque IBM");
		controladorregistradora.criarSistemaEstoqueAdapter("IBM");
		controladorregistradora.diminuirQuantidadeItem();
		System.out.println("Teste - Estoque SAP");
		controladorregistradora.criarSistemaEstoqueAdapter("SAP");
		controladorregistradora.diminuirQuantidadeItem();

		System.out.println("Teste - Contabil DELL");
		controladorregistradora.criarSistemaContabilAdapter("DELL");
		controladorregistradora.registrarVendaSistemaContabil();
		System.out.println("Teste - Contabil IBM");
		controladorregistradora.criarSistemaContabilAdapter("IBM");
		controladorregistradora.registrarVendaSistemaContabil();
		System.out.println("Teste - Contabil SAP");
		controladorregistradora.criarSistemaContabilAdapter("SAP");
		controladorregistradora.registrarVendaSistemaContabil();
	}
}
