import java.io.IOException;

public class First {

	public static void main(String[] args) throws NumberFormatException,
			IOException, InterruptedException {
		ReadInput readObj = new ReadInput(true);
		Thread readThread = new Thread(readObj);
		readThread.start();
		System.out.println(MessageQueue.getInput());
		Person john = new Person("John", 19800220, 76);
		Person john1 = new Person("John1", 29800220, 86);
		PPThread pJohnThread = new PPThread(john, 1000);
		PPThread pJohnThread1 = new PPThread(john1, 1000);

		pJohnThread.start();
		Thread.sleep(20);
		pJohnThread1.start();
	}
}

class PPThread extends Thread {
	// private volatile boolean running = true;
	private Person p;
	private int pause;

	public PPThread(Person p, int pause) {
		super();
		this.p = p;
		this.pause = pause;
	}

	public void run() {
		while (MessageQueue.getInput() != 1) {
			if (MessageQueue.getInput() == 2) {
				p.print();
				try {
					Thread.sleep(pause);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if (MessageQueue.getInput() == 3
					|| MessageQueue.getInput() == 0) {
				continue;
			} else {
				break;
			}

		}

	}

	/*
	 * public void terminate() { running = false; }
	 */
}
