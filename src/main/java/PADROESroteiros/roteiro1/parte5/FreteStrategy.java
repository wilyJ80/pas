package PADROESroteiros.roteiro1.parte5;

public interface FreteStrategy {
	double calculaFrete(Pedido pedido) throws FreteNaoDisponivelException;
}
