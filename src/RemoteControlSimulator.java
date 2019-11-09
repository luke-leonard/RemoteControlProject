import java.util.Scanner;

public class RemoteControlSimulator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		//This string holds all the 
		String userString;

		//This loop runs until the input is on 
		boolean running = true;
		while (running) {

			//Prompt user and get input
			System.out.print("To begin, please press ON");
			userString = input.next();

			//Check if its equal to on, if so exit the loop
			if (userString.toUpperCase().contentEquals("ON")) {
				turnOn();
				running = false;
				break;
			}
		}
		
		//This loop runs until off is pressed
		boolean isOn = true;
		while (isOn) {
			
			//Prompt the user and get input
			System.out.print("Press any button 1-9 or press \"OFF\": ");
			userString = input.next();
			
			//Call function depending on button, have press button take in the button value, because that would make sense
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
				case "OFF": //If Off break loop
					turnOff();
					isOn = false;
					break;
				default: //If other button pressed, issue not recognized
					System.out.println("Command not recognized!");
			}
		}
		
		//No Memory Leaks
		input.close();
	}
	
	//A method called when the on button is pressed
	public static void turnOn() {
		System.out.println("TURNING ON...");
	}

	//A method that is called when the off button is pressed
	public static void turnOff() {
		System.out.println("TURNING OFF");
	}

	//Call when 1-9 is pressed
	//
	//This structure is to make sure that the code is written with 
	//some sort of use for different buttons in the future
	public static void pressButton(int button) {
		pressButton();
	}
	
	//Call to emit the sound that all numbers emit
	//This is to make sure the auto-grading will work right
	public static void pressButton() {
		System.out.println("BOOP!");
	}

}
