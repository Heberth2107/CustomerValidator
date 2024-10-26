/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customervalidator;

import entities.Customer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.HashSet;
import utils.StringFunctions;


/**
 *
 * @author heber
 */
public class CustomerValidator {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    //read file
    try(BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\heber\\Downloads\\customers.txt")))
    {
        //create variables
        int lineCount = 0;
        String line;
        Customer customer = null;
        StringFunctions validator = null;
        //Start the loop to navigate between the lines
        while((line = buffer.readLine()) != null){
            
            lineCount++;
            //Set First name and Second name
            if(lineCount == 1){
                customer = new Customer();
                //separate First Name and Second Name
                customer.SetFirstName(line.split(" ")[0]);
                customer.SetSecondName(line.split(" ")[1]);   
            }
            else if(lineCount == 2){   
                //set Purchase 
                //the value of purchase must be double
                customer.SetPurchase(parseDouble(line));
            }
            else if(lineCount == 3){ 
                //set class
                customer.SetClass(parseInt(line));
            }
            else{
                //set Last Purchase
                customer.SetLastPurchase(parseInt(line));
                lineCount = 0;
            } 
            
            //Validations
            //the first name must be only letters
            if (!validator.containOnlyLetters(customer.GetFirstName())){
                System.out.println("The First Name must be only letters");
            }
            
            //the second name can be letters and/or numbers
            if (!validator.containNumbersOrLetters(customer.GetSecondName())){
                System.out.println("The Second Name must contain only letters and numbers");
            }
            
            //The second name can not be null
            if (customer.GetSecondName()== null){
                System.out.println("The second name can not be null");
                    
            }
            
            //the class must be an integer between 1 to 3 
            if (customer.GetClasse()<1 || customer.GetClasse()>3){
                System.out.println("The class must be an integer between 1 to 3");
                
            }
            
            //Last Purchase must be a valid year
            //I am considering 10 years as a valid period
            if (customer.GetLastPurchase()>2024 || customer.GetLastPurchase()<2014){
                System.out.println("Must be than 2014 and less than 2024");
            }
             
            System.out.println(customer.GetFirstName() + " " + customer.GetSecondName());
            System.out.println(customer.CalcularDesconto());
        }
        
    }
    catch(IOException e){
        System.out.println(e);
    }
    
        
        
   
            
    }
    
}
