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
         if(input.equals("")){ 
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
            //System.out.println("New iteration!");
            for(int position = iterate + 1; iterate2 <= input.length()-1; iterate2++){
                if(position +1 > input.length()){                    
                    char tempchar = thewordagain[position-1];
                    thewordagain[position-1] = thewordagain[0];
                    thewordagain[0] = tempchar;
                    //System.out.print("RESET: ");
                    //System.out.println(thewordagain);
                    position=1;
                }

            else{
                char tempchar = thewordagain[position];          
                thewordagain[position] = theword[iterate];
                thewordagain[position - 1] = tempchar;
                if(!possibilities.contains(String.valueOf(thewordagain))){
                    possibilities.add(String.valueOf(thewordagain));
                }
                
                position++;

                }
                
            }
           }

           //REVERSE THE WORD
           char [] prebackwards = input.toCharArray();
           int y = input.length()-1;
           for(int x = 0; x< input.length(); x++){
                prebackwards[x] = theword[y - x];
           }

           //final char [] theword2 = backwards;
           String backwards = String.valueOf(prebackwards);
           thewordagain = backwards.toCharArray();
           theword = backwards.toCharArray();
           //System.out.println("theword:"+ String.valueOf(theword)+ "; thewordagain:"+ String.valueOf(thewordagain));
           //System.out.println("THE BACKWARDS WORD IS " + String.valueOf(backwards));


             for(int iterate = 0; iterate < input.length(); iterate++){
            thewordagain = backwards.toCharArray();
            //System.out.println("New iteration");
            int iterate2 = 0;
            for(int position = iterate + 1; iterate2 <= input.length()-1; iterate2++){
                if(position +1 > input.length()){                    
                    char tempchar = thewordagain[position-1];
                    thewordagain[position-1] = thewordagain[0];
                    thewordagain[0] = tempchar;
                    position=1;
                    //System.out.println(thewordagain);
                }

            else{
                char tempchar = thewordagain[position];    
               // System.out.println("Letter in question: " + String.valueOf(backwards));      
                thewordagain[position] = theword[iterate];
                thewordagain[position - 1] = tempchar;
                //System.out.println(thewordagain);
                if(!possibilities.contains(String.valueOf(thewordagain))){
                    possibilities.add(String.valueOf(thewordagain));
                }
                
                position++;

                }
                
            }
           }



           System.out.println("Here are all the listed possibilities (A total of " + possibilities.size() + "): ");
           for(int x = 0; x<possibilities.size(); x++){
               System.out.println(possibilities.get(x));
           }

       }
    }
}
}
