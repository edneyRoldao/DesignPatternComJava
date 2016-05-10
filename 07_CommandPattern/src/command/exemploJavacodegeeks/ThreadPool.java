package command.exemploJavacodegeeks;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {

	private final BlockingQueue<Job> jobQueue;
	private final Thread[] jobThreads;
	private volatile boolean shutdown;

	public ThreadPool(int n) {
		jobQueue = new LinkedBlockingQueue<>();
		jobThreads = new Thread[n];

		for (int i = 0; i < n; i++) {
			jobThreads[i] = new Worker("" + i);
			jobThreads[i].start();
		}

	}

	public void addJob(Job j) {
		try {

			jobQueue.put(j);

		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void shutdownPool() {
		while (!jobQueue.isEmpty()) {
			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		shutdown = true;
		for (Thread workerThread : jobThreads) {
			workerThread.interrupt();
		}
	}

	private class Worker extends Thread {

		public Worker(String name) {
			super(name);
		}

		@Override
		public void run() {
			while (!shutdown) {
				try {

					Job job = jobQueue.take();
					job.run();

				} catch (InterruptedException e) {

				}
			}
		}
	}

}
