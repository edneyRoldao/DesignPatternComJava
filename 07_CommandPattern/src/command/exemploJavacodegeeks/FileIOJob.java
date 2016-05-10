package command.exemploJavacodegeeks;

public class FileIOJob implements Job {

	private FileIO file;
	
	public void setFile(FileIO file) {
		this.file = file;
	}
	
	@Override
	public void run() {
		System.out.println("Job ID: " + Thread.currentThread().getId() + " executing fileIO jobs.");

		if(file != null) {
			file.execute();
		}
		
		try {
			
			Thread.sleep(1000);
	
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
	}

}
