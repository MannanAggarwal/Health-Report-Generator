/**
 * This is Assignment 1.
 * This class will prompt the user to enter the values for the fields asked.
 * After the input is done displayMyHealthData method of class MyHealthData will be called to display
 * the health data report and this will be done using the object of 
 * class MyHealthData.
 * Input will be done by using the object of Scanner class.
 * 
 * <pre>Class: CST8284_313_310</pre>
 * <pre>Professor: Fedor Ilitchev</pre>
 * <pre>Demo: 9 November, 2022</pre>
 * 
 * @author Mannan Aggarwal
 * @version 1.0
 * @since 11.0.15
 */
import java.util.Scanner;

/**
 *This is Assignment 1 class that contains main method in it.
 * @param args Command line arguments are not used by this program.
 */
public class Assignment1 {
	
	/**
	 * This method will execute all the statements including the nested for loops as mentioned above.
	 * 
	 * @param args arguments passed from command line
	 */
	
	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		MyHealthData data = new MyHealthData();
		String firstName;
		String lastName;
		String gender;
		int birthYear;
		int currentYear;
		double height;
		double weight;
		
		System.out.println("Enter your First Name: ");
		firstName = SC.nextLine();
		System.out.println("Enter your Last Name: ");
		lastName = SC.nextLine();
		System.out.println("Enter your Gender: ");
		gender = SC.nextLine();
		System.out.println("Enter your Birth Year: ");
		birthYear = SC.nextInt();
		System.out.println("Enter Current Year: ");
		currentYear = SC.nextInt();
		System.out.println("Enter your Height(in inches): ");
		height = SC.nextDouble();
		System.out.println("Enter your Weight(in pounds): ");
		weight = SC.nextDouble();
		
		/** 
		 * These methods of MyHealthData class will process all the values and produce information for 
		 * displayMyHealthData method.	
		 */
		data.setFirstName(firstName);
		data.setLastName(lastName);
		data.setGender(gender);
		data.setBirthYear(birthYear);
		data.setCurrentYear(currentYear);
		data.setHeight(height);
		data.setWeight(weight);
		
		
		data.displayMyHealthData();
		
		
		
	}

}
