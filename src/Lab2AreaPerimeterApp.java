import java.util.Scanner;

	// Calculate the Perimeter and area of classrooms at Grand Circus based on user input.
	// Display the area and Perimeter of that classroom..
	// Ask if the user wants to continue (Keep Measuring rooms!).
		

public class Lab2AreaPerimeterApp 

{

	public static void main(String[] args) {
	 Scanner scnr = new Scanner (System.in);
	 double Length; //length of classroom
	 double Width;  // width of the classroom
	 double Area; //provides area of the classroom
	 double Perimeter; 	// provides value for perimeter of the classroom. 
	 double Volume; // providves value for the volume of the classroom.
	 double Height = 0; // Provides the height for the classroom.
	 String Response;  //Captures the user response to the question
	  
		 
	do {
		System.out.println("Enter Length of the Classroom");  // Asks the user to input the length of the Classroom
		Length = scnr.nextDouble();
				
		System.out.println("Enter Width of the Classroom");  // Asks the user to input the width of the Classroom
		Width = scnr.nextDouble();
		System.out.println("Enter the Height of the Classroom"); //Asks the user to input the volume of the classroom
		Height = scnr.nextDouble();
	
		Area = Length * Width; // Calculation for the Area
		Perimeter = 2 * (Length + Width);  //Calculation for the Perimeter 
		Volume = (Length * Width * Height);  //Calculation for the height
		
		System.out.println("The Area of the Classroom is: " + Area);  //Provides the user with result for Area of Classroom
		System.out.println("The Perimeter of the Classrom is: "+ Perimeter); //Provides the user with the result of Classroom
		System.out.println("The volome of the clasroom is "+ Volume);
		
		System.out.println("Would you like to continue with another room? Yes or No");  //ask the user if they want to continue with the calculation
		Response = scnr.next();
		
	} while (Response.equalsIgnoreCase("Yes"));  //Want the Calculation to continue as long as the user responds Yes
	
	if (Response.equalsIgnoreCase("No"));  //if the user responds No we want to advise the user that teh program has terminated. 
		System.out.println("GoodBye!");
		
		scnr.close(); // closes the Scanner		
	}
	
}
