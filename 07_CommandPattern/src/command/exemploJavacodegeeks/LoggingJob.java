package command.exemploJavacodegeeks;

public class LoggingJob implements Job {

	private Logging log;
	
	public void setLog(Logging log) {
		this.log = log;
	}
	
	@Override
	public void run() {
		System.out.println("Job ID: " + Thread.currentThread().getId() + " executing Logging jobs.");

		if(log != null) {
			log.log();
		}
		
		try {
			
			Thread.sleep(1000);
	
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
	}

}
