package observer.derekBanas.exemplo04;

@SuppressWarnings("unused")
public class StockObserver implements Observer {

	// Atributos
	private double IBMPrice, applePrice, googlePrice;
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject stockGrabber;
	
	
	// Construtor
	public StockObserver(Subject stockGrabber) {
		
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		
		System.out.println("New Observer " + this.observerID);
		
		stockGrabber.register(this);
		
	}
	
	
	@Override
	public void update(double IBMPrice, double applePrice, double googlePrice) {
		this.IBMPrice = IBMPrice;
		this.applePrice = applePrice;
		this.googlePrice = googlePrice;
		
		printThePrices();
		
	}
	
	public void printThePrices() {
		System.out.println(this.observerID + "\n IBM: " + this.IBMPrice + " \n Apple: " + this.applePrice + " \n Google: " + this.googlePrice);
	}
	

}
