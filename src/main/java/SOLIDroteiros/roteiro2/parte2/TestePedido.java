package SOLIDroteiros.roteiro2.parte2;

import java.util.Arrays;
import java.util.List;

public class TestePedido {
	public static void main(String[] args) {

		List<String> produtos = Arrays.asList("Camiseta", "Calca", "Jaqueta");

		PedidoService services[] = {
				new PedidoService(produtos, new DescontoLivre(0.1)),
				new PedidoService(produtos, new DescontoLivre(0.0)),
				new PedidoService(produtos, new DescontoLivre(0.4))
		};

		for (PedidoService service : services) {
			service.processarPedido();
		}
	}
}
