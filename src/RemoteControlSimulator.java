import java.util.Scanner;

public class RemoteControlSimulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean running = true;
		String userString;

		while (running) {

			System.out.print("To begin, please press ON");
			userString = input.next();

			if (userString.toUpperCase().contentEquals("ON")) {
				running = false;
				break;
			}
		}
		turnOn();

		running = true;
		while (running) {
			System.out.print("Press any button 1-9 or press \"OFF\": ");
			userString = input.next();
			switch (userString.toUpperCase()) {
				case "0":
					pressButton(0);
					break;
				case "1":
					pressButton(1);
					break;
				case "2":
					pressButton(2);
					break;
				case "3":
					pressButton(3);
					break;
				case "4":
					pressButton(4);
					break;
				case "5":
					pressButton(5);
					break;
				case "6":
					pressButton(6);
					break;
				case "7":
					pressButton(7);
					break;
				case "8":
					pressButton(9);
					break;
				case "OFF":
					turnOff();
					running = false;
					break;
				default:
					System.out.println("Command not recognized!");
			}
		}

		input.close();
	}

	public static void turnOn() {
		System.out.println("TURNING ON...");
	}

	public static void turnOff() {
		System.out.println("TURNING OFF");
	}

	public static void pressButton(int button) {
		pressButton();
	}

	public static void pressButton() {
		System.out.println("BOOP!");
	}

}
