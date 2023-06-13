import java.util.Scanner;
import java.util.ArrayList;

public class anagramprogram{
public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the word in question: ");

        while(scan.hasNext()){
        String input = scan.nextLine();

        ArrayList<String> possibilities = new ArrayList<String>();
        char [] theword = input.toCharArray();
        char [] thewordagain = input.toCharArray();
         if(!input.equals("hat")){ 
            //Make this the if statement that checks if there is a number in the input
            System.out.print("We are in the testing phase; Please input 'case'");
        } 

       else{

           /* Plan: Have each charcter iterate the input.length - 1 ( input.length would have the
           word end in the original position) Have the newly formed word submitted into an ArrayList and 
           check if the word already exists in the array.*/


           for(int iterate = 0; iterate < input.length(); iterate++){
            thewordagain = input.toCharArray();
            int iterate2 = 0;
            System.out.println("New iteration!");
            for(int position = iterate + 1; iterate2 <= input.length()-1; iterate2++){
                if(position +1 > input.length()){                    
                    char tempchar = thewordagain[position-1];
                    thewordagain[position-1] = thewordagain[0];
                    thewordagain[0] = tempchar;
                    /*System.out.print("RESET: ");
                    System.out.println(thewordagain);*/
                    position=1;
                }

            else{
                char tempchar = thewordagain[position];          
                thewordagain[position] = theword[iterate];
                thewordagain[position - 1] = tempchar;
                if(!possibilities.contains(String.valueOf(thewordagain))){
                    //System.out.println(thewordagain);
                    possibilities.add(String.valueOf(thewordagain));
                }
                
                position++;

                }
                
            }
           }

           for(int x = 0; x<possibilities.size(); x++){
                System.out.println(possibilities.get(x));
           }

       }
    }
}
}
