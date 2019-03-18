import java.util.Scanner;
public class Height {
    private double inches;
    private double cms;
    
    // Scanner for user input. 
    Scanner height = new Scanner(System.in);
    
    // Method to convert Inches to Centimetres. 
    public double inches() {
        System.out.println("Enter the height in Inches");
        inches = height.nextDouble();
          
        //Inches to Centimetres formula: 
        cms = inches * 2.54;
          
        System.out.println("The height in Centimetres is " + cms);
        return inches;
    }
    
    // Method to convert Centimetres to Inches. 
    public double cms() {
        System.out.println("Enter the height in Centimetres");
        cms = height.nextDouble();
          
        //Centimetres to Inches formula: 
        inches = cms * 0.39;
          
        System.out.println("The height in Inches is " + inches);
        return cms;
    }
}