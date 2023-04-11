import java.util.Scanner;

public class TemperatureConversions {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//while loop to repeat program
		boolean condition = true;
		while (condition){
			System.out.println("Choose a number (1, 2, or 3) from the list below to choose the temperature type to convert. Enter 4 to terminate the program.");
			System.out.println("Temperature type to convert:");
			System.out.println("1. Fahrenheit");
			System.out.println("2. Celsius");
			System.out.println("3. Kelvin");
			System.out.println("4. Exit program");
			System.out.print("Enter the number of the temperature type you wish to convert: ");
			
			int input = scnr.nextInt();
			
			//if, else if code for pulling methods
			if (input == 1) {
				System.out.print("Enter the temperature in F to convert: ");
				double temp_input = scnr.nextDouble();
				System.out.printf("The temperature in Celsius is: %.2f\n", FahrenheitToCelsius(temp_input));
				System.out.printf("The temperature in Kelvin is: %.2f\n", FahrenheitToKelvin(temp_input));
			} else if (input == 2) {
				System.out.print("Enter the temperature in C to convert: ");
				double temp_input = scnr.nextDouble();
				System.out.printf("The temperature in Fahrenheit is: %.2f\n", CelsiusToFahrenheit(temp_input));
				System.out.printf("The temperature in Kelvin is: %.2f\n", CelsiusToKelvin(temp_input));
			} else if (input == 3) {
				System.out.print("Enter the temperature in K to convert: ");
				double temp_input = scnr.nextDouble();
				System.out.printf("The temperature in Fahrenheit is: %.2f\n", KelvinToFahrenheit(temp_input));
				System.out.printf("The temperature in Celsius is: %.2f\n", KelvinToCelsius(temp_input));
			} else if (input == 4) {
				System.out.println("Program terminated.");
				condition = false;
				scnr.close();
			} else {
				System.out.println("You have entered an incorrect value. Please choose a list from the number below.");
			}
		}
	}
	//convert F to C
	public static double FahrenheitToCelsius(double input) {
		double celsius;
	    celsius = (input - 32.0) * (5.0/9.0);
		return celsius;
	}
	
	//convert F to K
	public static double FahrenheitToKelvin(double input) {
		double kelvin;
	    kelvin = ((input - 32.0) * (5.0/9.0)) + 273.15;
	    return kelvin;
		
	}
	
	//convert C to F
	public static double CelsiusToFahrenheit(double input) {
		double fahrenheit;
		fahrenheit = (input * (9.0/5.0)) +32;
		return fahrenheit;
	}
	
	//convert C to K
	public static double CelsiusToKelvin(double input) {
		double kelvin;
		kelvin = input + 273.15;
		return kelvin;
	}
	
	//convert K to C
	public static double KelvinToCelsius(double input) {;
		double celsius;
		celsius = input - 273.15;
		return celsius;
	}
	
	//convert K to F
	public static double KelvinToFahrenheit(double input) {
		double fahrenheit;
		fahrenheit = ((input- 273.15) * (9.0/5.0)) + 32;
		return fahrenheit;
	}
}
