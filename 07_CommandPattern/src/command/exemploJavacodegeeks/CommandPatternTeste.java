package command.exemploJavacodegeeks;

public class CommandPatternTeste {
	
	public static void main(String[] args) {
		init();
	}
	
	
	private static void init() {
		
		ThreadPool pool = new ThreadPool(10);
		
		Email email = null;
		EmailJob emailJ = new EmailJob();
		
		Msg msg = null;
		MsgJob msgJ = new MsgJob();
		
		FileIO file = null;
		FileIOJob fileJ = new FileIOJob();
		
		Logging log = null;
		LoggingJob logJ = new LoggingJob();
		
		for(int i = 0; i < 5; i++) {
			email = new Email();
			emailJ.setEmail(email);
			
			msg = new Msg();
			msgJ.setMsg(msg);
			
			file = new FileIO();
			fileJ.setFile(file);
			
			log = new Logging();
			logJ.setLog(log);
			
			pool.addJob(emailJ);
			pool.addJob(msgJ);
			pool.addJob(fileJ);
			pool.addJob(logJ);
		}
		
		pool.shutdownPool();
	}
	
	

}
