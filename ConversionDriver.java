import java.util.*;
// Driver program to convert unit of measurement: weight/height/temperature.
public class ConversionDriver {
 public static void main (String[] args){
   // Create new instances of temp, height and weight. 
   Temp Temp1 = new Temp();
   Height Height1 = new Height();
   Weight Weight1 = new Weight();
   double convert = 0;
   // Scanner for user input. 
   Scanner conversion = new Scanner(System.in);
    
   // Ask the user if they would like to convert something. 
   System.out.println("Would you like to convert something (Y/N)?");
   char converting = conversion.next().charAt(0);
   conversion.nextLine();

   // While loop for the answer being Y or y. 
   while((converting == 'Y') || (converting == 'y')){
    do{
      // Ask which unit of measurement they would like to convert. 
      System.out.println("Would you like to convert Height, Weight or Temperature?");
      String unit = conversion.nextLine();
        
      // If they select Temperature.
      if(unit.equalsIgnoreCase("Temperature")){
          // Ask which unit of Temperature. 
          System.out.println("Convert Celcius, Fahrenheit or Kelvin?");
          String temp = conversion.nextLine();
            if(temp.equalsIgnoreCase("Celcius")){
                convert = Temp1.tempC();
            }else if(temp.equalsIgnoreCase("Fahrenheit")){
                convert = Temp1.tempF();
            }else if(temp.equalsIgnoreCase("Kelvin")){
                convert = Temp1.tempK();
            }
            System.out.println("Would you like to convert something else (Y/N)?");
            converting = conversion.next().charAt(0);
            conversion.nextLine();
            
          // If they select Height. 
      }else if(unit.equalsIgnoreCase("Height")){
          // Ask which unit of Height. 
          System.out.println("Convert Inches or Centimetres?");
          String height = conversion.nextLine();
            if(height.equalsIgnoreCase("Centimetres")){
                convert = Height1.cms();
            }else if(height.equalsIgnoreCase("Inches")){
                convert = Height1.inches();
            }
          System.out.println("Would you like to convert something else (Y/N)?");
          converting = conversion.next().charAt(0);
          conversion.nextLine();
          
          // If they select Weight. 
      }else if(unit.equalsIgnoreCase("Weight")){
          // Ask which unit of Weight. 
          System.out.println("Convert Pounds or Kilograms?");
          String weight = conversion.nextLine();
            if(weight.equalsIgnoreCase("Pounds")){
                convert = Weight1.lbs();
            }else if(weight.equalsIgnoreCase("Kilograms")){
                convert = Weight1.kgs();
            }
          System.out.println("Would you like to convert something else (Y/N)?");
          converting = conversion.next().charAt(0);
          conversion.nextLine();
      
      }
    }while((converting == 'Y') || (converting == 'y'));{
    }
   }
 }
}