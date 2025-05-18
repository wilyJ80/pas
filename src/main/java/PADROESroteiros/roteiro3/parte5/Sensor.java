package PADROESroteiros.roteiro3.parte5;

import java.util.ArrayList;
import java.util.List;

public abstract class Sensor implements Subject {
	protected List<Observer> observers = new ArrayList<>();
	protected double leitura;

	public void setLeitura(double leitura) {
		this.leitura = leitura;
		notifyObservers();
	}

	public double getLeitura() {
		return leitura;
	}

	public abstract String getTipoSensor();

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(this, leitura);
		}
	}
}
