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
            int combocounter = 0;

           for(int iterate = 0; iterate < input.length(); iterate++){

            thewordagain = input.toCharArray();
           char temp = thewordagain[0];
           thewordagain[0] = thewordagain[iterate];
           thewordagain[iterate] = temp;

         // System.out.print("Next Main Change: ");
         // System.out.println(thewordagain);

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




         }

          
//LETS TAKE IT BACK 
thewordagain = input.toCharArray();
char [] prebackwards = input.toCharArray();
int y = input.length()-1;
for(int x=0; x<input.length();x++){
    prebackwards[x] = thewordagain[y-x];
    //y--;
} //RECREATE THIS WITH(?)

/*
 * 
 * for(int x=0; x<input.length();x++){
    prebackwards[x] = thewordagain[y];
    y--;
} 
 * 
 */

String backwards = String.valueOf(prebackwards);
thewordagain = backwards.toCharArray();

System.out.println("LETS TAKE IT BACK: " + backwards);


  for(int iterate = 0; iterate < input.length(); iterate++){

            thewordagain = backwards.toCharArray();
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
                System.out.println("New Letter Focus");
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

                    System.out.println(thewordagain);
                }
                position = position2;
                
            }




         }



           System.out.println("Here are all the listed possibilities (A total of " + possibilities.size() + "): ");
           for(int x = 0; x<possibilities.size(); x++){
             //System.out.println(possibilities.get(x));
           }

       }
    }
}
}
