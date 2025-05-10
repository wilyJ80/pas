package SOLIDroteiros.roteiro7.parte3;

import java.util.ArrayList;
import java.util.List;

public class FlowContainer extends Container {
	protected List<Component> elements;

	public FlowContainer() {
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
		System.out.println("Estes sao os elementos presentes no container");
		System.out.println(elements);
		System.out.println("Usando o metodo dispose como heranca para fechar o container");
		this.dispose();
		System.out.println("------------------------------------");
	}
}
