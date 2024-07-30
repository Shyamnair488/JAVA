/*Jack and Joy were playing a game. The game is about one player saying a sentence and the other player has to arrange the letters in that word in alphabetical order. Help Joy to play this game using a java program.

Requirements:

 Assume the letters in the sentence is in lowercase.
 The sentence should contain only alphabets and space, else print "<sentence> is an invalid input".
Note:

 In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
 Ensure to follow the object-oriented specifications provided in the question description.
 Ensure to provide the names for classes, attributes, and methods as specified in the question description.
 Adhere to the code template, if provided
Please do not use System.exit(0) to terminate the program 


Sample Input/Output 1:

Enter the sentence

the series

eht eeirss

 

Sample Input/Output 2:

Enter the sentence

5 is greater than 2

5 is greater than 2 is an invalid input */
import java.util.Scanner;

import java.util.Arrays;

class wordarrange{

    private String sentence;

    

    public wordarrange(String sentence){

        this.sentence=sentence;

    }

    

    public void arrangeletters(){

        if(!isValidSentence(sentence)){

            System.out.println(sentence + " is an invalid input");

            return;

        }

        

        String[] words=sentence.split(" ");

        

        StringBuilder result = new StringBuilder();

        for(String word : words){

            char[] letters=word.toCharArray();

            Arrays.sort(letters);

            result.append(new String(letters)).append(" ");

        }

        System.out.println(result.toString().trim());

    }

    

    private boolean isValidSentence(String sentence){

        for(char c : sentence.toCharArray()){

            if(!Character.isLetter(c)&&c!=' '){

                return false;

            }

        }

        return true;

    }

}

public class UserInterface

{

    public static void main(String[] args)

    {

        

           Scanner sc=new Scanner(System.in);

           

           System.out.println("Enter the sentence");

           String sentence=sc.nextLine();

           wordarrange arrange=new wordarrange(sentence);

           arrange.arrangeletters();

           

            //Fill the code here

            

        }

}