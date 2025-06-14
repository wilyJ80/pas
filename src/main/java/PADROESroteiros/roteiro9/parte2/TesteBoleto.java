package PADROESroteiros.roteiro9.parte2;

public class TesteBoleto {
	public static void main(String[] args) {
		Banco banco = new Banco();
		System.out.println(" \n --- BANCO CAIXA --- \n ");
		CalculosFactory caixaCalculosFatory = new CaixaCalculosFactory();
		try {
			banco.gerarBoleto(100, caixaCalculosFatory);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(" \n --- BANCO DO BRASIL --- \n ");
		CalculosFactory bbCalculosFatory = new BBCalculosFactory();
		try {
			banco.gerarBoleto(100, bbCalculosFatory);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
