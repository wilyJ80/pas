package PADROESroteiros.roteiro10.parte1;

import java.util.concurrent.TimeUnit;

public class TesteUsuario {
	public static void main(String[] args) {
		long TempoInicio = System.nanoTime();
		Usuario pessoaFisica = new Usuario("Fulano", 30, "123456789");
		System.out.println("Nome : " + pessoaFisica.getNome()); // System.out.println("Valida Nome : " +
		// System.out.println("CPF Ativo : " + pessoaFisica.verificaCPFAtivo());
		long TempoFinal = System.nanoTime();
		long duracao = TimeUnit.NANOSECONDS.toSeconds(TempoFinal - TempoInicio);
		System.out.println("Duração : " + duracao);
	}
}
