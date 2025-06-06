package SOLIDroteiros.roteiro7.parte4;

public final class TesteHeranca {

	public static void main(String[] args) {

		var button = new Component("Button");
		var textBox = new Component("TextBox");
		var textField = new Component("TextField");
		var checkBox = new Component("CheckBox");
		var combobox = new Component("ComboBox");
		var label = new Component("Label");
		var radioButton = new Component("RadioButton");

		Container c1 = new GridContainer(2, 2);
		c1.addComponent(button);
		c1.addComponent(textBox);
		c1.addComponent(textField);
		c1.addComponent(checkBox);

		c1.doLayout();

		System.out.println("*************************");

		Container c2 = new FlowContainer();
		c2.addComponent(combobox);
		c2.addComponent(label);
		c2.addComponent(radioButton);

		c2.doLayout();

		System.out.println("*************************");

		Container c3 = new FlowContainer(new BordaPontilhada());
		c3.addComponent(radioButton);
		c3.addComponent(combobox);
		c3.addComponent(label);

		c3.doLayout();
		System.out.println("*************************");

		Container c4 = new FlowContainer(new BordaSolida());
		c4.addComponent(radioButton);
		c4.addComponent(combobox);
		c4.addComponent(label);

		c4.doLayout();
	}
}
