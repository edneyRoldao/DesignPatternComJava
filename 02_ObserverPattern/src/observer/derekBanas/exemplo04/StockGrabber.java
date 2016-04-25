package observer.derekBanas.exemplo04;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double IMBPrice;
	private double applePrice;
	private double googlePrice;
	
	
	public StockGrabber() {
		observers = new ArrayList<>();
	}
	
	
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update(IMBPrice, applePrice, googlePrice);
		}
	}
	
	
	public void setIMBPrice(double newIBMPrice) {
		IMBPrice = newIBMPrice;
		notifyObserver();
	}
	public void setApplePrice(double newApplePrice) {
		applePrice = newApplePrice;
		notifyObserver();
	}
	public void setGooglePrice(double newGooglePrice) {
		googlePrice = newGooglePrice;
		notifyObserver();
	}

}
