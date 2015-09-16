package paareversestring;
import java.util.Scanner;

public class PaaReverseString {

    public static void main(String[] args) {
     
    // Declare a variable to test for run again
    Boolean exitP;
    // Do loop to run program again
     do{   
    // Declare Variables
        
        String runAgain;
        String userWord;
        String reversedWord;
        Scanner keyboard = new Scanner(System.in);
        
     // Get word from user
        System.out.print("Enter a word to be reversed: ");
        userWord = keyboard.nextLine();
        
     // Call Reverse Method to Reverse Word
        reversedWord = ReverseWord(userWord);
        
     // Display word and Reversed word to user
        System.out.println("The word is: " + userWord);
        System.out.println("The reversed word is: " + reversedWord);
        
     // Ask user to run program again
        System.out.print("If you would like to run the program again enter 'Y': ");
        runAgain = keyboard.next();
        runAgain = runAgain.toUpperCase();
     
    // Set while condition to false if anything but Y
        if (runAgain.equals("Y")){
         exitP = true;
        }
        else{
         exitP = false;
        }
    }while(exitP == true);
        
    }
    
    // Create Reverse Word Method
    public static String ReverseWord(String wordInput){
        // Declare and initialize variable to hold reversed string
        String returnedWord = "";
        
        // Run a loop to add characters to string variable in reverse order
        for(int i = wordInput.length() - 1;i > -1;i--){
            returnedWord = returnedWord + wordInput.charAt(i);
        }
      
        return returnedWord;
    }
    
}
