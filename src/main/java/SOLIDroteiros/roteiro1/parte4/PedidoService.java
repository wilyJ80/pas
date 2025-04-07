package SOLIDroteiros.roteiro1.parte4;

import java.util.List;

public class PedidoService {
    private MysqlConnection connection;
    private List<String> itens;

    public PedidoService(List<String> itens) {
        this.connection = new MysqlConnection();
        this.itens = itens;
    }

    public void processarPedido() {
        this.connection.connect();
        double total = calcularTotal();
        System.out.println("Pedido processado. Valor total: R$" + total);
    }

    private double calcularTotal() {
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
