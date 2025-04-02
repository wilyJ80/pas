package SOLIDroteiros.roteiro2.parte2;

import java.util.Arrays;
import java.util.List;

public class TestePedido {
	public static void main(String[] args) {

		var dl1 = new DescontoLivre(0.1);
		var dl2 = new DescontoLivre(0.0);
		var dl3 = new DescontoLivre(0.4);

		List<String> produtos = Arrays.asList("Camiseta", "Calca", "Jaqueta");

		var pedido1 = new PedidoService(produtos, dl1);
		var pedido2 = new PedidoService(produtos, dl2);
		var pedido3 = new PedidoService(produtos, dl3);

		pedido1.processarPedido();
		pedido2.processarPedido();
		pedido3.processarPedido();

	}
}
