class MessageQueue {
	static int input;

	public static synchronized int getInput() {
		return input;
	}

	public static synchronized void setInput(int input) {
		MessageQueue.input = input;
		System.out.println(input);
	}

}
