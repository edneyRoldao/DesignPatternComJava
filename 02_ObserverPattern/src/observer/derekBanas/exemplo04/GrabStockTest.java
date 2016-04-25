package observer.derekBanas.exemplo04;

public class GrabStockTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();

		System.out.println();
		System.out.println("**********");
		StockObserver observer1 = new StockObserver(stockGrabber);
		stockGrabber.setApplePrice(2000.00);
		stockGrabber.setGooglePrice(1500.00);
		stockGrabber.setIMBPrice(999.45);

		System.out.println();
		System.out.println("**********");
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setApplePrice(2500.00);
		stockGrabber.setGooglePrice(1700.00);
		stockGrabber.setIMBPrice(1099.45);
		
		System.out.println();
		System.out.println("**********");
		stockGrabber.unregister(observer1);
		stockGrabber.setApplePrice(3000.00);
		stockGrabber.setGooglePrice(2500.00);
		stockGrabber.setIMBPrice(1499.45);
		
		//Usando threads
		Runnable getGooglePrice = new GetTheStock(2, "Google", 222.78, stockGrabber);
		Runnable getIBMPrice = new GetTheStock(2, "IBM", 145.88, stockGrabber);
		Runnable getApplePrice = new GetTheStock(2, "Apple", 185.23, stockGrabber);
		
		new Thread(getGooglePrice).start();
		new Thread(getIBMPrice).start();
		new Thread(getApplePrice).start();
		
	}
	
}
