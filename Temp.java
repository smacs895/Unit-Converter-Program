import java.util.*;
public class Temp {
      private double tempF = 32;
      private double tempC = 0;
      private double tempK = 273;
   
      // Scanner for user input. 
      Scanner temperature = new Scanner(System.in);
      
      // Method to convert Fahrenheit to Celcius & Kelvin. 
      public double tempF() {
        System.out.println("Enter the temperature in °F");
        tempF = temperature.nextDouble();
          
        //Fahrenheit to Celcius formula: 
        tempC = ((tempF - 32)*5)/9;
          
        //Fahrenheit to Kelvin formula: 
        tempK = ((tempF + 459.67)* 5)/9;
          
        System.out.println("The Temperature in °C is " + tempC);
        System.out.println("The Temperature in Kelvin is " + tempK);
        return tempF;
      }
  
      // Method to convert Celcius to Fahrenehit & Kelvin. 
      public double tempC() {
        System.out.println("Enter the temperature in °C");
        tempC = temperature.nextDouble();
            
        //Celcius to Fahrenheit formula: 
        tempF = ((tempC * 9)/5) + 32;
            
        // Celcius to Kelvin formula: 
        tempK = (tempC + 273.15);
            
        System.out.println("The Temperature in °F is " + tempF);
        System.out.println("The Temperature in Kelvin is " + tempK);
        return tempC;
      }
  
      // Method to convert Kelvin to Celcius & Fahrenheit. 
      public double tempK() {
        System.out.println("Enter the temperature in Kelvin");
        tempK = temperature.nextDouble();
            
        // Kelvin to Celcius formula: 
        tempC = (tempK - 273.15);
            
        // Kelvin to Fahrenheit formula: 
        tempF = ((tempK * 9)/5) - 459.67;
            
        System.out.println("The Temperature in °C is " + tempC);
        System.out.println("The Temperature in °F is " + tempF);
        return tempK;
      }
}