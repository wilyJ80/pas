package PADROESroteiros.roteiro8.parte3;

public class TesteControlador {
	public static void main(String[] args) {
		testeControladorContabil();
		testeControladorEstoque();
		testeControladoraRegistradora();
	}

	public static void testeControladorContabil() {
		System.out.println("Criando o Controlador Contabil");
		ControladorContabil controladorcontabil = new ControladorContabil();
		System.out.println("Teste de Integração do Controlador Contabil - Sistema Contabil DELL");
		controladorcontabil.criarSistemaContabilAdapter("DELL");
		controladorcontabil.calcularImposto();
		System.out.println("Teste de Integração do Controlador Contabil - Sistema Contabil IBM");
		controladorcontabil.criarSistemaContabilAdapter("IBM");
		controladorcontabil.calcularImposto();
	}

	public static void testeControladorEstoque() {
		System.out.println("Criando o Controlador de Estoque");
		ControladorEstoque controladorestoque = new ControladorEstoque();
		System.out.println("Teste de Integração do Controlador de Estoque - Sistema de Estoque DELL");
		controladorestoque.criarSistemaEstoqueAdapter("DELL");
		controladorestoque.aumentarQuantidadeItem();
		System.out.println("Teste de Integração do Controlador de Estoque - Sistema de Estoque IBM");
		controladorestoque.criarSistemaEstoqueAdapter("IBM");
		controladorestoque.aumentarQuantidadeItem();
	}

	public static void testeControladoraRegistradora() {
		System.out.println("Criando o Controlador da Registradora");
		ControladorRegistradora controladorregistradora = new ControladorRegistradora();
		System.out.println("Teste de Integração do Controlador da Registradora - Sistema de Estoque DELL");
		controladorregistradora.criarSistemaEstoqueAdapter("DELL");
		controladorregistradora.diminuirQuantidadeItem();
		System.out.println("Teste de Integração do Controlador da Registradora - Sistema de Estoque IBM");
		controladorregistradora.criarSistemaEstoqueAdapter("IBM");
		controladorregistradora.diminuirQuantidadeItem();
		System.out.println("Teste de Integração do Controlador da Registradora - Sistema Contabil DELL");
		controladorregistradora.criarSistemaContabilAdapter("DELL");
		controladorregistradora.registrarVendaSistemaContabil();
		System.out.println("Teste de Integração do Controlador da Registradora - Sistema Contabil IBM");
		controladorregistradora.criarSistemaContabilAdapter("IBM");
		controladorregistradora.registrarVendaSistemaContabil();
	}
}
