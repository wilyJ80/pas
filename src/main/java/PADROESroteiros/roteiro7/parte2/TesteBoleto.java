package PADROESroteiros.roteiro7.parte2;

public class TesteBoleto {
	public static void main(String[] args) {
		BoletoSimpleFactory factory = new BoletoSimpleFactory();
		BancoCaixa banco = new BancoCaixa(factory);
		try {
			banco.gerarBoleto(10, 100);
			banco.gerarBoleto(30, 100);
			banco.gerarBoleto(60, 100);
			banco.gerarBoleto(90, 100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
