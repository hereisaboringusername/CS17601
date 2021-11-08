/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
     
	  //Countries
	  System.out.println("Quiz Data");
	  Measurable[] quiz = new Measurable[5];
      quiz[0] = new Quiz(95);
      quiz[1] = new Quiz(80);
      quiz[2] = new Quiz(90);
      quiz[3] = new Quiz(50);
      quiz[4] = new Quiz(75);
      double avg=Data.average(quiz);
      System.out.println("Average area: " + avg);
      System.out.println("Expected: 78");
      System.out.println("");
      double maxData = Data.max(quiz);
      System.out.println("Maximum score: " + maxData);
      System.out.println("Expected: 95");
      System.out.println("");
     
      //Bank Accounts
    //  System.out.println("Bank account data");
   //   Measurable[] bank = new Measurable[3];
   //   bank[0] = new BankAccount(176220);
   //   bank[1] = new BankAccount(513120);
   //   bank[2] = new BankAccount(30510);
   //   avg=Data.average(bank);
   //   System.out.println("Average balance: " + avg);
   //   System.out.println("Expected: 239950");
   //   System.out.println("");
   //   maxData = Data.max(bank);
   //   System.out.println("Maximum balance: " + maxData);
   //   System.out.println("Expected: 513120");

   }
}
