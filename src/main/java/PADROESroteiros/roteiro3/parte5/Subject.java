package PADROESroteiros.roteiro3.parte5;

public interface Subject {
	void addObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}
