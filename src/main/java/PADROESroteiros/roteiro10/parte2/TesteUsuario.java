package PADROESroteiros.roteiro10.parte2;

import java.util.concurrent.TimeUnit;

public class TesteUsuario {
	public static void main(String[] args) {
		System.out.println("--- Testando com PessoaFisicaReceitaFederal (sem Proxy) ---");
		long tempoInicioDireto = System.nanoTime();

		IReceitaFederal pessoaDireta = new PessoaFisicaReceitaFederal("987654321");
		System.out.println("Nome Direto: " + pessoaDireta.getNome());
		System.out.println("CPF Ativo Direto: " + pessoaDireta.isCpfAtivo());
		long tempoFinalDireto = System.nanoTime();
		long duracaoDireta = TimeUnit.NANOSECONDS.toSeconds(tempoFinalDireto - tempoInicioDireto);
		System.out.println("Duração Total (Direta): " + duracaoDireta + " segundos.");
		System.out.println("----------------------------------------------------------\n");

		System.out.println("--- Testando com PessoaFisicaReceitaFederalProxy ---");
		long tempoInicioProxy = System.nanoTime();

		IReceitaFederal pessoaProxy = new PessoaFisicaReceitaFederalProxy("123456789");
		System.out.println(
				"Proxy criado. Observe que o 'PessoaFisicaReceitaFederal criada com Sucesso' não apareceu ainda.");

		System.out.println("CPF via Proxy: " + pessoaProxy.getCpf());
		long tempoAposCpf = System.nanoTime();
		long duracaoAposCpf = TimeUnit.NANOSECONDS.toSeconds(tempoAposCpf - tempoInicioProxy);
		System.out.println("Duração até obter CPF (Proxy): " + duracaoAposCpf + " segundos.");

		System.out.println("Nome via Proxy: " + pessoaProxy.getNome());
		System.out.println("Idade via Proxy: " + pessoaProxy.getIdade());

		System.out.println("CPF Ativo via Proxy: " + pessoaProxy.isCpfAtivo());

		long tempoFinalProxy = System.nanoTime();
		long duracaoProxy = TimeUnit.NANOSECONDS.toSeconds(tempoFinalProxy - tempoInicioProxy);
		System.out.println("Duração Total (Proxy): " + duracaoProxy + " segundos.");
		System.out.println("----------------------------------------------------------");
	}
}
