package command.exemploJavacodegeeks;

public class MsgJob implements Job {

	private Msg msg;
	
	public void setMsg(Msg msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		System.out.println("Job ID: " + Thread.currentThread().getId() + " executing msg jobs.");

		if(msg != null) {
			msg.sendMsg();
		}
		
		try {
			
			Thread.sleep(1000);
	
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
	}

}
