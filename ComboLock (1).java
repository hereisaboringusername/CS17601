 import java.util.Scanner;
/**
* Author: Ashley Zingillioglu
*/
public class ComboLock {
    //Defining Variables and Instance Variables
    int secret1, secret2, secret3;
    int d; //dial
    int number1, number2, number3;
   
    int count = 0;

    public ComboLock() {
    }
//Method with Variables
    public ComboLock(int number1, int number2, int number3) {
        this.secret1 = number1;
        this.secret2 = number2;
        this.secret3 = number3;
        this.d = 0;
    }

    public void reset() {
        this.d = 0;
        
        this.count = 0;
    }
    
//Turning Right
    public void turnRight(int ticks) {
        
        count++;
        if (this.d + ticks > 39) {
        	this.d = this.d + ticks -  40;
        }
        else {
        	this.d = this.d + ticks;
        }
        
 
        if (count == 1) {
        	number1 = this.d;
        }
        else if (count == 3) {
        	number3 = this.d;
        }
       
    }
    //Turning Left

    public void turnLeft(int ticks) {
    	
       count++;
        if (this.d - ticks < 0) {
        	this.d = this.d - ticks + 40;
        }
        else this.d = this.d- ticks;
        
        number2 = this.d;
    }
    public boolean open() {
    	System.out.println("Combo:");
    	System.out.println(Integer.toString(secret1));
    	System.out.println(Integer.toString(secret2));
    	System.out.println(Integer.toString(secret3));
    	System.out.println("Numbers:");
    	System.out.println(Integer.toString(number1));
    	System.out.println(Integer.toString(number2));
    	System.out.println(Integer.toString(number3));
        if (number1 == secret1 && number2 == secret2 && number3 == secret3) {
            return true;
        } else {
            return false;
        }
    }

    
    public int getCurrentNumber() {
        return d;
    }
    
    public String toString() {
        return d + "";
    }
}


