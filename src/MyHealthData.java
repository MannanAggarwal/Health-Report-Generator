/**
 * This is the MyHealthData class.
 * This class is having all the getters and setters and other
 * methods to perform calculations and finally all data will be
 * used in Health Data Report output.
 * 
 * <pre>Class: CST8284_313_310</pre>
 * <pre>Professor: Fedor Ilitchev</pre>
 * <pre>Demo: 9 November, 2022</pre>
 * 
 * @author Mannan Aggarwal
 * @version 1.0
 * @since 11.0.15
 */

public class MyHealthData {
	
	//firstName component of Health Report.
	private String firstName;
	//lastName component of Health Report.
	private String lastName;
	//gender component of Health Report.
	private String gender;
	//birthYear component of Health Report.
	private int birthYear;
	//currentYear component of Health Report.
	private int currentYear;
	//height component of Health Report.
	private double height;
	//weight component of Health Report.
	private double weight;
	
	//constructor
	
	public MyHealthData() {
		
	}
	
	//constructor
	public MyHealthData(String firstName, String lastName, String gender, double height, double weight, int birthYear, int currentYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
	}
	
	
	
	/**
	 * @return firstName 
	 * The firstName component of Health Report when the method is called.
	 */
	
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This sets the firstName component of the Health Report.
	 * @param firstName the firstName component of the Health Report
	 */

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @return lastName 
	 * The lastName component of Health Report when the method is called.
	 */


	public String getLastName() {
		return lastName;
	}
	
	/**
	 * This sets the lastName component of the Health Report.
	 * @param lastName the lastName component of the Health Report.
	 */

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return gender 
	 * The gender component of Health Report when the method is called.
	 */


	public String getGender() {
		return gender;
	}

	/**
	 * This sets the gender component of the Health Report.
	 * @param gender the gender component of the Health Report
	 */

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * @return birthYear
	 * The birthYear component of Health Report when the method is called.
	 */


	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * This sets the birthYear component of the Health Report.
	 * @param birthYear the birthYear component of the Health Report
	 */

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	/**
	 * @return currentYear 
	 * The currentYear component of Health Report when the method is called.
	 */


	public int getCurrentYear() {
		return currentYear;
	}

	/**
	 * This sets the currentYear component of the Health Report.
	 * @param currentYear the currentYear component of the Health Report
	 */

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	
	/**
	 * @return height 
	 * The height component of Health Report when the method is called.
	 */


	public double getHeight() {
		return height;
	}

	/**
	 * This sets the height component of the Health Report.
	 * @param height the height component of the Health Report
	 */

	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * @return weight
	 * The weight component of Health Report when the method is called.
	 */


	public double getWeight() {
		return weight;
	}

	/**
	 * This sets the weight component of the Health Report.
	 * @param weight the weight component of the Health Report
	 */

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * @return age
	 * The age component of Health Report when the method is called.
	 * Age is calculated using current year and birth year.
	 */
	
	public int getAge() {
		
		int age = currentYear - birthYear;
		return age;
		
	}
	
	/**
	 * @return maximum heart rate
	 * The maximum heart rate component of Health Report when the method is called.
	 */
	
	public int getMaximumHeartRate() {
		
		int maximumHeartRate = 220 - getAge();
		return maximumHeartRate;
		
	}
	
	/**
	 * @return minimum target heart rate
	 * The minimum target heart rate component of Health Report when the method is called.
	 */
	
	public double getMinimumTargetHeartRate() {
		
		double minimumTargetHeartRate = (50 * getMaximumHeartRate()) / 100 ;
		return minimumTargetHeartRate;
		
	}
	
	/**
	 * @return maximum target heart rate 
	 * The maximum target heart rate component of Health Report when the method is called.
	 */
	
	public double getMaximumTargetHeartRate() {
		
		double maximumTargetHeartRate = (85 * getMaximumHeartRate()) / 100 ;
		return maximumTargetHeartRate;
		
	}
	
	/**
	 * @return BMI
	 * The BMI component of Health Report when the method is called.
	 */
	
	public double getBMI() {
		
		double bmi = (getWeight() * 703) / (getHeight() * getHeight());
		return bmi;
		
	}
	
	/**
	 * This method when called, will print a cumulative Health Report based on all the data above.
	 */
	
	public void displayMyHealthData() {
		
		System.out.printf("%n%n-- Health Data Report --%n%nFirst Name: %s %nLast Name: %s %nGender: %s %nYear of Birth: %d %nHeight: %.2f %nWeight: %.2f %nAge: %d %nMaximum Heart Rate: %d %nMinimum Target Heart Rate: %.2f %nMaximum Target Heart Rate: %.2f %nBMI Value: %.2f" , firstName, lastName, gender, birthYear, height, weight, getAge(), getMaximumHeartRate(), getMinimumTargetHeartRate(), getMaximumTargetHeartRate(), getBMI()   );
		
		
			System.out.println();
			System.out.println();
			System.out.println("BMI VALUES");
			System.out.println("Underweight: less than 18.5");
			System.out.println("Normal:      between 18.5 and 24.9");
			System.out.println("Overweight:  between 25 and 29.9");
			System.out.println("Obese:       30 or greater");  
		
	}



}
