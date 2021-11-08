/**
   This program demonstrates the measurable Quiz class.
 */
public class MeasurableTester
{
	public static void showData (Measurable[] data, String dataName) {
		double avg = Data.average(data);
		System.out.println("Average  " + dataName + ": " + avg);
		Measurable max = Data.max(data);
		System.out.println("Maximum  " + dataName + ": " + max.getMeasure());
	}

	public static void main(String[] args)
	{

		//Implementing Quiz Data
		System.out.println("Quiz Data:");
		Measurable[] quiz = new Measurable[5];
		quiz[0] = new Quiz(95);
		quiz[1] = new Quiz(80);
		quiz[2] = new Quiz(90);
		quiz[3] = new Quiz(50);
		quiz[4] = new Quiz(75);
		
		//Calculating Average
		double avg=Data.average(quiz);
		System.out.println("Average : " + avg);
		System.out.println("Expected: 78");
		System.out.println("");
		
		//Calculating Max
		Measurable maxData = Data.max(quiz);
		System.out.println("Maximum score: " + maxData.getMeasure());
		System.out.println("Expected: 95");
		System.out.println("");

		//Implementing Country Data
		System.out.println("Country data:");
		Measurable[] Countries = new Measurable[3];
		Countries[0] = new Country("Uruguay", 176220);
		Countries[1] = new Country("Thailand", 513120);
		Countries[2] = new Country("Belgium", 30510);
		showData(Countries, "area");
		System.out.println("Expected  : 239950");
		System.out.println("Expected  : 513120");
		System.out.println("");

        //Implementing Bank Account Data
		System.out.println("Bank Account data :");
		Measurable[] bank = new Measurable[3];
		bank[0] = new BankAccount(176220);
		bank[1] = new BankAccount(513120);
		bank[2] = new BankAccount(30510);
		showData(bank, "balance");
		System.out.println("Expected average: 239950");
		System.out.println("Expected maximum: 513120");
		System.out.println("");
	}
}
