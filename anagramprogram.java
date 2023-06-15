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

           /* NEW Plan: Create a for loop that represents each letter within the word. Encased within that
           should be a while loop that iterates through all the possibilities with the 
           next couple of letters thats not the one of focus. Noted that with each FOCUSED 
           letter, we should loop it to the front and procede to the while loop from there.(TOTAL LETTERS - 1) . */

            int combocounter = 0;


            /*NEW PLAN: Create a loop that switches a certain character with the next. Once that character
             * reaches the end, start with the 2nd (current/thewordagain?) character. Maybe this is encased
             * within a while loop 
             */

           for(int iterate = 0; iterate < input.length(); iterate++){

            thewordagain = input.toCharArray();
           char temp = thewordagain[0];
           thewordagain[0] = thewordagain[iterate];
           thewordagain[iterate] = temp;

          System.out.print("Next Main Change: ");
          System.out.println(thewordagain);

            String convert = String.valueOf(thewordagain);

            for(int position = 1; position <input.length(); position++){
                
                thewordagain = convert.toCharArray();
                int position2 = position;
                int positionhelp = 1;
                //System.out.println("New Letter Focus");
                while(positionhelp +1 < input.length()){

                    if(position + 1 >= input.length()){
                            position = 1;
                    }

          
                    temp = thewordagain[position + 1];
                    thewordagain[position + 1] = thewordagain[position];
                    thewordagain[position] = temp;
                    position++;
                    positionhelp++;

                    

                    if(!possibilities.contains(String.valueOf(thewordagain))){
                    possibilities.add(String.valueOf(thewordagain));
                    
                }

                    //System.out.println(thewordagain);
                }
                position = position2;
                
            }



/* 
           for(int position = 1; position<input.length(); position++){
                System.out.println("And now we do...");

                while(position + 1 < input.length()){
                    temp = tempchararr[position + 1];
                    tempchararr[position + 1] = tempchararr[position];
                    tempchararr[position] = temp;
                    
                    if(!possibilities.contains(String.valueOf(thewordagain))){
                    possibilities.add(String.valueOf(thewordagain));
                    
                }

                    System.out.println(tempchararr);
                    position++;
                    
                }
           }          */
         }

          
//LETS TAKE IT BACK 

/* 
            char [] prebackwards = input.toCharArray();
           int y = input.length()-1;
           for(int x = 0; x< input.length(); x++){
                prebackwards[x] = theword[y - x];
           }

           String backwards = String.valueOf(prebackwards);
           thewordagain = backwards.toCharArray();
           theword = backwards.toCharArray();

           for(int iterate = 0; iterate < input.length(); iterate++){     
            thewordagain = input.toCharArray();
            char temp = thewordagain[0];
            thewordagain[0] = thewordagain[iterate];
            thewordagain[iterate] = temp;
            combocounter++;
           System.out.println(thewordagain);

           char [] tempchararr = thewordagain;

           System.out.print("(BACK) NEW ITERATION: ");

           for(int position = 1; position<input.length(); position++){
                tempchararr = thewordagain;

                while(position + 1 < input.length()){
                    temp = tempchararr[position + 1];
                    tempchararr[position + 1] = tempchararr[position];
                    tempchararr[position] = temp;
                    
                    System.out.println(tempchararr);
                    position++;
                    combocounter++;
                }
           }     
        } */

        //System.out.println("Combo counter: " + combocounter);

           //REVERSE THE WORD

           /* 
           char [] prebackwards = input.toCharArray();
           int y = input.length()-1;
           for(int x = 0; x< input.length(); x++){
                prebackwards[x] = theword[y - x];
           }

           String backwards = String.valueOf(prebackwards);
           thewordagain = backwards.toCharArray();
           theword = backwards.toCharArray();


             for(int iterate = 0; iterate < input.length(); iterate++){
            thewordagain = backwards.toCharArray();
            int iterate2 = 0;
            for(int position = iterate + 1; iterate2 <= input.length()-1; iterate2++){
                if(position +1 > input.length()){                    
                    char tempchar = thewordagain[position-1];
                    thewordagain[position-1] = thewordagain[0];
                    thewordagain[0] = tempchar;
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
           } */

           System.out.println("Here are all the listed possibilities (A total of " + possibilities.size() + "): ");
           for(int x = 0; x<possibilities.size(); x++){
             // System.out.println(possibilities.get(x));
           }

       }
    }
}
}
