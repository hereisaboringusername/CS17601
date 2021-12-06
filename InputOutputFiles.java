package lab9.interfaces;

import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class InputOutputFiles
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//Use a Scanner to allow the user to input the file path to 'lines.txt' file.
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		while (true)
		{
			//User should be prompted with 'Please enter the path to open the input file for example C:\\Downloads\\lines.txt : 
			System.out.println("Please enter the path to open the input file (e.g. C:\\Downloads\\lines.txt):");
			String filePath = scanner.nextLine();
//Use 'try' and 'catch' to detect when the user has entered an invalid path causing a 'FileNotFoundException'
			try
			{
				File inputFile = new File(filePath);
				//Use the file path input by the user to open 'lines.txt'
				PrintWriter outputFile = new PrintWriter("outlines.txt");

				Scanner in = new Scanner(inputFile);
				
				while (in.hasNext()) 
				{
					String what = in.next();
					//If the file path is valid, run the remaining code that reads 'lines.txt; and writes output to 'outlines.txt'
					outputFile.println(what);
				}

				in.close();
				outputFile.close(); 
				break;
			}
		//Use 'try' and 'catch' to detect when the user has entered an invalid path causing a 'FileNotFoundException'
			catch (FileNotFoundException e)
			{
				//Print the error message: 'File is not found, please try again' and prompt the user to enter the path again as in Step 1.
				System.out.println("File is not found, please try again.\n");
			}
		}
//Your program should work for a valid file path and for an invalid file path
					

		scanner.close();
	}
}
