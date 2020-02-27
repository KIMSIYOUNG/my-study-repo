package kail.study.java.solid;

public class Computer {
	private Messenger messenger;

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.setMessenger(new LineMessenger());
		computer.boot();
	}

	private void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}

	private void boot() {
		System.out.println("BOOTING.....");
		messenger.boot();
	}
}
