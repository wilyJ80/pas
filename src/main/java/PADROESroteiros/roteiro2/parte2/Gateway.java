package PADROESroteiros.roteiro2.parte2;

import java.util.Random;

public class Gateway {

	public boolean cobrar(double valor) {
		System.out.println("Valor cobrado: " + valor);

		var random = new Random();
		boolean autorizado = random.nextBoolean();
		System.out.println("Cobranca Autorizada : " + autorizado);

		return autorizado;
	}
}
