/*
* this program determines what your weight will be on another planet based on 
*user weight input using earth as default weight.
 */
package loopyplanets;

//simple text scanner which can parse primitive types and strings using regular expressions.
import java.util.Scanner;

/**
 *
 * @author Mitchell Vessair
 */
public class LoopyPlanets {
    
       public static void main(String[] args) { //This  is the starting point
            //this is the title menu printout
             System.out.println("********************************************");
             System.out.println("** Find Your Weight On A Different Planet **");
             System.out.println("************ Type 0 to Quit ***************");
             System.out.println("********************************************");           
            
            //calling initilization of new scanner 
            Scanner input = new Scanner(System.in);
        
            //prompt user to type weight
            System.out.print("Please Enter Your Weight on Earth in Lbs:  ");
            //declaring weight variable as double double indicates decimal places and getting object name from scanner input
            double Weight = input.nextDouble();  
             
             
            //gives user choices of planets
            System.out.println("** Please Select the number of the planet you wish to see what your weight is**");
            System.out.println("1. Mercury"); //0.37 = weight calc
            System.out.println("2. Venus"); //0.88
            System.out.println("3. Mars"); //0.38
            System.out.println("4. Jupiter"); //2.64
            System.out.println("5. Saturn."); //1.15
            System.out.println("6. Uranus"); //1.15
            System.out.println("7. Neptune"); //1.12
            System.out.println("8. Pluto"); //0.04           
            System.out.println("0. Quit"); //Quit


        //Declaring the derpt variablle for input scan    
        Scanner derp = new Scanner(System.in);
        int PlanetWeight=derp.nextInt( );
        
// outnumber will be the output number that the program will calculate  
        double Answer; 
       //switch declaring all statement options for user selection
        switch (PlanetWeight) {
            
            // case will calculate venus weight
            case 1:
                Answer = Weight * .37; 
                System.out.println(" Weight on Mercury will be: " + Answer);                                         
                 break;
           
            //calculate Mercury weight
            case 2:
                Answer = Weight * .88; 
                 System.out.println(" Weight on Venus will be: " + Answer);
                 break;
           
            //calculate Mars weight
           case 3:
               Answer = Weight * .38;  
                 System.out.println(" Weight on Mars will be: " + Answer);
                 break;
                 
           // will calculate Jupiter weight      
           case 4:
             Answer = Weight * 2.64;
                 System.out.println(" Weight on Jupiter will be: " + Answer);
                 break;
                 
            //calculate saturn weight     
           case 5 :
             Answer = Weight * 1.15;  
                 System.out.println(" Weight on Saturn will be: " + Answer);
                 break;
           
            //calculate Uranus weight     
           case 6 :
              Answer = Weight * 1.15;  
                 System.out.println(" Weight on Uranus will be: " + Answer);
                 break;
                 
            //calculate Neptune weight
           case 7:
              Answer = Weight * 1.12 ; 
                 System.out.println(" Weight on Neptune will be: " + Answer);
                 break;
          
           //calculate Pluto weight      
           case 8:
              Answer = Weight * 0.04 ;  
                 System.out.println(" Weight on Pluto will be: " + Answer);
                 break;                 
                 
           //0 in int tells system to quit whereas 1 will give error code      
           case 0:
               System.exit(0);
                 
           // this command will default to an error if the user number selected is not assigned to a print ln and case
           default:
                System.out.println("You have selected a wrong Number!"); 
                break;
        }    
    } 

       
}