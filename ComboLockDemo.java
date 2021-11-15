
import java.util.Scanner;
public class ComboLockDemo {

        public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ComboLock lock = new ComboLock(30, 20, 10);
		
		boolean loop = true;
		
		while (loop) {
			System.out.print("Enter number of ticks to turn to the right (0-39), or an invalid number to quit: ");
			int number1 = in.nextInt(); // User inputs, computer accepts
			if (number1 > 39 || number1 < 0) {
				break;
			}
			lock.turnRight(number1);
			
			System.out.print("Enter number of ticks to turn to the left (0-39), or an invalid number to quit: ");
			int number2 = in.nextInt();// User inputs, computer accepts
			if (number2 > 39 || number2 < 0) {
				break;
			}
			lock.turnLeft(number2);
			
			System.out.print("Enter number of ticks to turn to the right (0-39), or an invalid number to quit: ");
			int number3 = in.nextInt(); // User inputs, computer accepts
			if (number3 > 39 || number3 < 0) {
				break;
			}
			lock.turnRight(number3);
			
			if (lock.open()) { //Success!
				System.out.println("The lock has been opened!");
			} 
			else //Failure!
			{
				System.out.println("The lock has not been opened!");
	
			}
		}
		
	}

}

