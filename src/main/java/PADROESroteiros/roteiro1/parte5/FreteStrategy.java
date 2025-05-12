package PADROESroteiros.parte5;

public interface FreteStrategy {
	double calculaFrete(Pedido pedido) throws FreteNaoDisponivelException;
}
