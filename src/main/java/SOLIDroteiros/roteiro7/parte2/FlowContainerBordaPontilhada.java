package SOLIDroteiros.roteiro7.parte2;

import java.util.ArrayList;
import java.util.List;

public final class FlowContainerBordaPontilhada extends Container {

	private List<Component> elements;

	public FlowContainerBordaPontilhada() {
		this.elements = new ArrayList<Component>();
	}

	@Override
	public void addComponent(Component c) {
		this.elements.add(c);
	}

	@Override
	public void removeComponent(Component c) {
		this.elements.remove(c);
	}

	@Override
	public void doLayout() {
		System.out.println("O Container utilizado e o FlowContainer");
		System.out.println("Este container contem bordas pontilhadas");
		System.out.println("Estes sao os elementos presentes no container");
		System.out.println(elements);
		System.out.println("Usando o metodo dispose como heranca para fechar o container");
		this.dispose();
		System.out.println("------------------------------------");
	}
}
