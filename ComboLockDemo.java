
import java.util.Scanner;
public class ComboLockDemo {

    

        public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ComboLock lock = new ComboLock(23, 5, 15);
		
		boolean loop = true;
		
		while (loop) {
			System.out.print("Enter number of ticks to turn to the right (0-39), or an invalid number to quit: ");
			int number1 = in.nextInt(); // User inputs, computer accepts
			
			if (number1<0 || number1>39) {
			    break;// Have to leave the program because the numbers don't fit within the range. 
			    
			}
			
			System.out.print("Enter number of ticks to turn to the left (0-39), or an invalid number to quit: ");
			int number2 = in.nextInt();// User inputs, computer accepts
			
			if (number2<0 || number2>39) {
			    break;// Have to leave the program because the numbers don't fit within the range. 
			    
			}
			
			System.out.print("Enter number of ticks to turn to the right (0-39), or an invalid number to quit: ");
			int number3 = in.nextInt(); // User inputs, computer accepts
			
			if (number3<0 || number3>39) {
			    break;// Have to leave the program because the numbers don't fit within the range. 
			    
			}
			
			lock.turnRight(number1);
			lock.turnLeft(number2);
			lock.turnRight(number3);
			if (lock.open()) { //Success!
				System.out.println("The lock has been opened!");
			} 
			else //Failure!
			{
				System.out.println("The lock has not been opened!");
	
			}
		}
		
		return;
	}

}

