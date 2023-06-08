import java.util.Scanner;

public class anagramprogram{
public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the word in question: ");

        while(scan.hasNext()){
        String input = scan.nextLine();

        
        char [] theword = input.toCharArray();
        char [] thewordagain = input.toCharArray();
         if(!input.equals("case")){ 
            //Make this the if statement that checks if there is a number in the input
            System.out.print("We are in the testing phase; Please input 'case'");
        } 

       else{

            int totalvariations = 0;

            for(int base = 0; base < input.length(); base++){ 
               // for(int iterator = 0 ; iterator < input.length(); iterator++){

                    thewordagain = input.toCharArray();

                    int wordcount = 0;

                    
                   /*  thewordagain[0] = theword[base];
                    thewordagain[base] = theword[0];
                    wordcount++;*/
                    //System.out.println(thewordagain);

                    int baselocation = base;
                    System.out.println("    New Start with " + baselocation + " and " + wordcount);
                    while(wordcount < input.length() -1){

/* 
                        if(baselocation+1 == input.length() ){
                            char temp = thewordagain[0];
                           thewordagain[0]= theword[base];
                           //thewordagain[baselocation] = temp;
    
                           System.out.print("RESET baselocation: " + "(" + baselocation + ") ");
    
                            //baselocation = base;

                            int letsgo = 0;
                            

                            while(letsgo<input.length()-1){
                                thewordagain[++letsgo] = theword[letsgo];

                             }

                        } */
                            
                           

                   if(baselocation+1 == input.length() ){
                        char temp = thewordagain[0];
                       thewordagain[0]= theword[base];
                       thewordagain[baselocation] = temp;

                       System.out.print("RESET baselocation: " + "(" + baselocation + ") ");


                        baselocation = base;
                        //baselocation--;
                       }
                    else{
                       char temp = theword[baselocation+1];
                       thewordagain[baselocation + 1]= theword[base];
                       thewordagain[baselocation] = temp;

                    }


                        System.out.println(thewordagain);
                        totalvariations++;
                        wordcount++;
                        baselocation++;
                    
                    }

                   
                    
               // }
            }

            System.out.println("Total number of variations: " + totalvariations);






/* 
                for(int x = 0 ; x< input.length(); x++){
                    char temphold = thewordagain[input.length()-1];
                    thewordagain[input.length()-1] = theword[x];
                    thewordagain[x] = temphold;
                    System.out.println(thewordagain);
                } */

                //System.out.println("Base word cycle: DONE");

                //Second method: Selective Letter Cycle
                //thewordagain = input.toCharArray();

              /*   for(int iterator = 0; iterator< input.length(); iterator++){
                    thewordagain = input.toCharArray();
                    char temphold = theword[0];
                    thewordagain[0] = theword[iterator];
                    thewordagain[iterator] = temphold;
                    System.out.println(thewordagain);
                    System.out.println("And boom: ");

                for(int iterator2 = iterator + 1; iterator2 <= input.length(); iterator2++){
                        if(iterator2 -1 == 10){
                            System.out.println("Lets skip this one");
                            continue;
                        }

                        if(iterator2 + 1 < input.length()){
                        char temphold2 = thewordagain[iterator2];                     
                        thewordagain[iterator2] = thewordagain[iterator2 +1];
                        thewordagain[iterator2 +1 ] = temphold2;
                        System.out.println(thewordagain);
                        }

                        else{
                            System.out.print("Uh oh ");
                            System.out.println(thewordagain);
                            //Move the last element to the second index? 
                        }
                    } 
                } */


       }
    }
}
}