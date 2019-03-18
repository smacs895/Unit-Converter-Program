import java.util.*;
public class Weight {
    private double lbs;
    private double kgs; 
    // Scanner for user input. 
    Scanner weight = new Scanner(System.in);
    
    // Method to convert Pounds to Kilograms. 
    public double lbs() {
        System.out.println("Enter the weight in Pounds");
        lbs = weight.nextDouble();
          
        //lbs to kgs formula: 
        kgs = lbs * 0.45359237;
          
        System.out.println("The weight in Kilograms is " + kgs);
        return lbs;
    }
      
    // Method to convert Kilograms to Pounds. . 
    public double kgs() {
        System.out.println("Enter the weight in Kilograms");
        kgs = weight.nextDouble();
        
        //kgs to lbs formula: 
        lbs = kgs / 0.45359237;
        
        System.out.println("The weight in Pounds is " + lbs);
        return kgs;
    }
}