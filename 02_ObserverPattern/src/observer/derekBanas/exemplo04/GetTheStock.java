package observer.derekBanas.exemplo04;

public class GetTheStock implements Runnable{
	
	private int startTime;
	private String stock;
	private double price;

	private Subject stockGrabber;

	public GetTheStock(int startTime, String stock, double price, Subject stockGrabber) {
		super();
		this.startTime = startTime;
		this.stock = stock;
		this.price = price;
		this.stockGrabber = stockGrabber;
	}

	@Override
	public void run() {
		
		for(int i =0; i <= 20; i++) {
			
			try {
				Thread.sleep(startTime * 1000);
			} catch (InterruptedException e) {
			}
			
			double randomNumber = (Math.random() * (.06) - .03);
			this.price += randomNumber;
			
			if("IBM".equals(stock))
				((StockGrabber) stockGrabber).setIMBPrice(price);
			
			if("Apple".equals(stock))
				((StockGrabber) stockGrabber).setApplePrice(price);
			
			if("Google".equals(stock))
				((StockGrabber) stockGrabber).setGooglePrice(price);
			
			System.out.println(stock + ": " + (price + randomNumber) + " " + (randomNumber));
			System.out.println();
			
		}
		
	}

}
