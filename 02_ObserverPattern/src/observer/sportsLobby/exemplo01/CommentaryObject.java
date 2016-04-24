package observer.sportsLobby.exemplo01;

import java.util.List;

/**
 * Essa é a classe concreta de Subject
 * 
 * Essa classe vai guardar todas as referencias dos observers registrados nela.
 * 
 * @author Edney Roldão
 *
 */
public class CommentaryObject implements Subject, Commentary { 
	
	private final List<Observer> observers;
	private final String subjectDetails;
	private String desc;

	/**
	 * Constructor
	 * 
	 * @param observers
	 * @param subjectDetails
	 */
	public CommentaryObject(List<Observer> observers, String subjectDetails) {
		this.observers = observers;
		this.subjectDetails = subjectDetails;
	}

	@Override
	public void subscribeObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unSubscribeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		System.out.println();
		for (Observer observer : observers) {
			observer.update(desc);
		}
	}

	@Override
	public String subjectDetails() {
		return subjectDetails;
	}

	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		notifyObservers();
	}

}
