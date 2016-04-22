package observer.exemplo01;
/**
 * 
 * Esta é a classe concreta que implementa a interface Observer.
 * 
 * @author Edney Roldão
 *
 */
public class SMSUsers implements Observer {

	private final Subject subject;
	private String desc;
	private String userInfo;
	
	/**
	 * Constructor
	 * 
	 * @param subject
	 * @param userInfo
	 */
	public SMSUsers(Subject subject, String userInfo) {
		if(subject == null) {
			throw new IllegalArgumentException("No publisher found.");
		}
		
		this.subject = subject;
		this.userInfo = userInfo;
	}
	
	private void display() {
		System.out.println("[" + userInfo + "]: " + desc);
	}
	
	@Override
	public void update(String desc) {
		this.desc = desc;
		display();
	}

	@Override
	public void subscribe() {
		System.out.println("Subscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
		this.subject.subscribeObserver(this);
		System.out.println("Subscribed successfully.");
	}

	@Override
	public void unSubscribe() {
		System.out.println("Unsubscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
		this.subject.unSubscribeObserver(this);
		System.out.println("Unsubscribed successfully.");
	}

}
