 import java.util.Scanner;
/**
* Author: Ashley Zingillioglu
*/
public class ComboLock {
    //Defining Variables and Instance Variables
    int secret1, secret2, secret3;
    int d = 0; //dial
    int number1, number2, number3;
    int count = 0;

    public ComboLock() {
    }
//Method with Variables
    public ComboLock(int number1, int number2, int number3) {
        this.secret1 = number1;
        this.secret2 = number2;
        this.secret3 = number3;
    }
//Setting secret numbers for passcode
    public void setSecret1(int secret1) {
        this.secret1 = secret1;
    }

    public void setSecret2(int secret2) {
        this.secret2 = secret2;
    }

    public void setSecret3(int secret3) {
        this.secret3 = secret3;
    }

    public void reset() {
        this.d = 0;
        this.number1 = 0;
        this.number2 = 0;
        this.number3 = 0;
        this.count = 0;
    }
//Turning Right
    public void turnRight(int ticks) {
        this.d = ticks;
        if (count == 0) {
            number1 = this.d;
        }
        if ( count == 2) {
            number3 = this.d;
        }
        count++;
        
        if (count == 3) {
            count = 0;
        }
    }
    //Turning Left

    public void turnLeft(int ticks) {
        this.d = ticks;
        if (count == 1) {
            number2 = this.d;
            count++;
        }
    }

    public boolean open() {
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
    public String getSolution () {
        return secret1 + "-" + secret2 + "-" + secret3;
    }
    public boolean equals (ComboLock z) {
        return (secret1 == z.secret1) && (secret2 == z.secret2) && (secret3 == z.secret3);
    }

}

