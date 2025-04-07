package SOLIDroteiros.roteiro1.parte5;

import java.util.List;

public class CalculadoraPreco {
	public double calcularTotal(List<String> itens) {
		double total = 0;
		for (String item : itens) {
			if (item.equals("Pizza")) {
				total += 30.0;
			} else if (item.equals("Bebida")) {
				total += 10.0;
			}
		}

		if (itens.stream().allMatch(s -> s.equals("Pizza"))) {
			final double desconto = total * 0.1;
			total -= desconto;
		}

		if (itens.stream().allMatch(s -> s.equals("Pizza") || s.equals("Bebida"))) {
			final double desconto = total * 0.15;
			total -= desconto;
		}

		return total;
	}
}
