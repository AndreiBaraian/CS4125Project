package account;
/*
 * @author Lucian Epure
 */
import java.util.Observer;

public interface ObserverSubject {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
