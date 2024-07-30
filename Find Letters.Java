/*Sita's teacher gives her an assignment to find the letters between the two given indexes of the word. Help Sita to complete her assignment by writing a program in java.

Index1 should be lesser than Index2 else print, "Index2 should be greater than Index1"
If Index1 is greater than the entered word length, then, print "<Index1> is greater than the word length"
If Index2 is greater than the entered word length, then, print "<Index2> is greater than the word length"
The index position of a word starts with 0.
Note 1: Get the word and two indexes as input from the user.


Note 2:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program. 




Hi, I'm "Friendly Hendy" and I can help you write the solution for this description.

You are provided with a UserInterface class with the main method. 
Create a new Scanner object called "sc" that reads input from the standard input stream (System.in).
Scanner sc=new Scanner(System.in);

Print a message prompting the user to "Enter the word" using System.out.println() method.
System.out.println("Enter the word");

Use the nextLine() method of the Scanner class to take input for the word and store it in a variable called "inputStr".
String inputStr=sc.nextLine();

Create a variable "a" of integer data type and assign it the length of the "inputStr" using the length property.
int a=inputStr.length();

Print a message prompting the user to "Enter the two indices", using System.out.println() method 
System.out.println("Enter the two indices");

Use the nextInt() method of the Scanner class to take input for the first index and store it in a variable called "input1".
int input1=sc.nextInt();

Use an if-statement to check if the value of "input1" is less than the length of the "inputStr".
if(input1<a) {

If the value of "input1" is less than the length of "inputStr", use the nextInt() method of the Scanner class to take input for the second index and store it in a variable called "input2"
int input2=sc.nextInt();

Use an if-statement to check if the value of "input2" is less than the length of the "inputStr".
if(input2<a) {

If the value of "input2" is less than the length of "inputStr", use an if-statement to check if the value of "input1" is less than "input2".
if(input1<input2){

If the value of "input1" is less than "input2", use the substring method to extract the characters between the two indices and store it in a variable called "result"
String result=inputStr.substring(input1,input2);

Print the value of "result", using System.out.println() method and close the if-else condition.
System.out.println(result);

}

If the value of "input1" is not less than "input2", print the message "Index2 should be greater than Index1" using System.out.println() method and close if-else condition.
else {

   System.out.println("Index2 should be greater than Index1");

}

}

If the value of "input2" is greater than the length of "inputStr", print the message input2 followed by "is greater than the word length" using System.out.println() method.
else{

    System.out.println(input2+" is greater than the word length");

}

 }

If the value of "input1" is greater than the length of "inputStr", print the message "is greater than the word length" using System.out.println() method.
else {

    System.out.println(input1+" is greater than the word length");

 }


Sample Input 1:

Enter the word

Environment

Enter the two indices

5

10

Sample Output 1:

onmen



Sample Input 2:

Enter the word

Rocket

Enter the two indices

10

Sample Output 2:

10 is greater than the word length


Sample Input 3:

Enter the word

Energy

Enter the two indices

4

9

Sample Output 3:

9 is greater than the word length


Sample Input 4:

Enter the word

Picture

Enter the two indices

6

4

Sample Output 3:

Index2 should be greater than Index1 */
import java.util.*;

import java.util.Scanner;

public class UserInterface{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //FILL CODE HERE

        System.out.println("Enter the word");

        String inputStr=sc.nextLine();

        

        int a = inputStr.length();

        System.out.println("Enter the two indices");

        int input1=sc.nextInt();

        //int input2=sc.nextInt();

        

        if(input1<a){

            int input2=sc.nextInt();

            if(input1<a){

                if(input1<input2){

                    String result = inputStr.substring(input1,input2);

                    System.out.println(result);

                }else{

                    System.out.println("Index2 should be greater than Index1");

                }

            }else{

                System.out.println(input2+" is greater than the word length");

            }

        }

        else{

            System.out.println(input1+" is greater than the word length");

        }

        sc.close();

    }

}