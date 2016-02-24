import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput implements Runnable {
	boolean proceed = false;

	ReadInput(boolean proceed) {
		this.proceed = proceed;
	}

	@Override
	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 0;
		while (true) {

			try {
				t = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			MessageQueue.setInput(t);

			System.out.println("Read " + t);
			if (t == 1) {
				break;
			}

		}
	}
}
