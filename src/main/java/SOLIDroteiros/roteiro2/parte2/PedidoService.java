package SOLIDroteiros.roteiro2.parte2;

import java.util.List;

public class PedidoService {
	private List<String> itens;
	private double total;
	private RegraDesconto regraDesconto;

	public PedidoService(List<String> itens, RegraDesconto regraDesconto) {
		this.itens = itens;
		this.regraDesconto = regraDesconto;
		this.total = calcularTotal();
	}

	private double calcularTotal() {
		double total = 0;
		for (String item : itens) {
			if (item.equals("Camiseta")) {
				total += 50.0;
			} else if (item.equals("Calca")) {
				total += 100.0;
			} else if (item.equals("Jaqueta")) {
				total += 200.0;
			}
		}
		return total;
	}

	public void processarPedido() {
		double valorFinal = regraDesconto.calcular(this.total);
		System.out.println("Pedido processado. Valor final com desconto: R$" + valorFinal);
	}
}
