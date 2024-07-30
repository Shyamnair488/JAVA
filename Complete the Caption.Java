/*Mr. Vicky gave a task to his students. He gave two words, but there were some spelling mistakes found. In the first string, "!" denotes the misspelt word. The second string has the correct spelling of the first string. Create a Java application and help the students remove the "!" and replace it with the correctly spelled character.

Requirements:

-        Both the Strings must be of the same length. Otherwise, print "Length of the strings <String1> and <String2> does not match"

-        Both the Strings must contain only alphabets and '!' symbol. Otherwise, print "<String> contains invalid symbols"

-       If both the strings contain invalid symbols, print "<String1> and <String2> contains invalid symbols"

-        The output must have the combined string without any symbols

Assume that space is allowed in between the words and assume that the second string always will have the correct spelt character of the misspelt first string in the respective positions.


Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program. 



Sample Input/Output 1:

Enter the first string

!ead

Enter the second string

rrrr

read

 

Sample Input/Output 2:

Enter the first string

F!n! !ut

Enter the second string

!i!d O!!

Find Out



Sample Input/Output 3:

Enter the first string

Po**t**n

Enter the second String

!!si!io!

Po**t**n contains invalid symbols

 

Sample Input/Output 4:

Enter the first string

!a!i!

Enter the second string

V*l*d

V*l*d contains invalid symbols

 

Sample Input/Output 5:

Enter the first string

pr!gra!!i!g

Enter the second string

programming

programming

 

Sample Input/Output 6:

Enter the first string

C!rr!s

Enter the second string

!a!!y

Length of the strings C!rr!s and !a!!y  does not match



Sample Input/Output 7:

Enter the first string

C%rr*

Enter the second string

&a%$y

C%rr* and &a%$y contains invalid symbols */

import java.util.Scanner;

class wordcorrector{

    private String misspeltword;

    private String correctword;

    

    public wordcorrector(String misspeltword,String correctword){

        this.misspeltword=misspeltword;

        this.correctword=correctword;

        

        

    }

    

    public void correctword(){

        if(misspeltword.length()!= correctword.length()){

            System.out.println("Length of the strings " + misspeltword + " and " + correctword + " does not match");

            return;

        }

        if(!isValidword(misspeltword)||!isValidword(correctword)){

            if(!isValidword(misspeltword)&& !isValidword(correctword)){

                System.out.println(misspeltword + " and " + correctword + " contains invalid symbols");

            }else if(!isValidword(misspeltword)){

                System.out.println(misspeltword + " contains invalid symbols");

            }else{

                System.out.println(correctword + " contains invalid symbols");

            }

            return;

        }

        

        StringBuilder result =new StringBuilder();

        for(int i=0;i<misspeltword.length();i++){

            if(misspeltword.charAt(i)=='!'){

                result.append(correctword.charAt(i));

            }else{

                result.append(misspeltword.charAt(i));

            }

        }

        System.out.println(result.toString());

    }

    

    private boolean isValidword(String word){

        for(char c : word.toCharArray()){

            if(!Character.isLetter(c) && c !='!' && c !=' '){

                return false;

            }

        }

        return true;

    }

}

public class UserInterface {

    public static void main(String[] args){

       Scanner sc=new Scanner(System.in);

        //fill the code here

        System.out.println("Enter the first string");

        String misspeltword=sc.nextLine();

        System.out.println("Enter the second string");

        String correctword=sc.nextLine();

        

        wordcorrector corrector = new wordcorrector(misspeltword,correctword);

        corrector.correctword();

        //sc.close();

    }

}