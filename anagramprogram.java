import java.util.Scanner;
import java.util.ArrayList;

public class anagramprogram2{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER IN WORD: ");
        String input = scan.nextLine();
        anagramprogram2 anapro = new anagramprogram2();
        anapro.letsgotowork(input,0,input.length()-1);
        scan.close();
    }

    public void letsgotowork(String theword, int startindex, int endindex){
        if(startindex == endindex){
                System.out.println(theword);
        }
        else{
            for(int iterator=startindex; iterator<=endindex; iterator++){
                //startindex could also be seen as the letter of focus
                theword=swap(theword,iterator,startindex);
                letsgotowork(theword, startindex +1, endindex);
                theword=swap(theword,startindex,iterator); //swap back
            }
        }

    }

    public String swap(String theword, int index1, int index2){
        char [] charred = theword.toCharArray();
            char temp = charred[index1];
            charred[index1] = charred[index2];
            charred[index2] = temp;
            return String.valueOf(charred);
            
    }
}
