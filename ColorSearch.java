import java.util.Scanner;
import java.util.ArrayList;


public class ColorSearch {


	public static ArrayList<String> colors = new ArrayList<String>();	

	public static void SearchColor(String searchc){
		for(int color = 0; color<colors.size(); color ++) {
			// check for color
			if (searchc.equalsIgnoreCase(colors.get(color))) {
				System.out.println("The color " + searchc+ " was found after " + (color+1) + " searches.");
				return;
			}
		}
		System.out.println("The color " + searchc.toLowerCase() + " was not found after " + colors.size() + " searches.");
	}

	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);

		ColorSearch search = new ColorSearch();
		String colorvalue = "";
		String  quit  = "";
		boolean loop = true; 


		while(loop) {
			System.out.println("Enter a color name, or ‘Q’ to quit: ");
			colorvalue = scan.nextLine();
			if (colorvalue.equals("Q")) 
				break;
			colors.add(colorvalue);


		}
		while(loop) {
			System.out.println("Enter a color to search for, or ‘Q’ to quit: ");
			colorvalue = scan.nextLine();
			if (colorvalue.equals("Q")) 
				break;
			SearchColor(colorvalue);
		}
	}

}