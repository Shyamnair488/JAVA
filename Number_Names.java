/*
Johanna, a 5-year-old girl, is learning the number names. She is having difficulty remembering all of the words. To give her extra practice, her mother assigns a number and instructs her to write the number names separated by white space. Help her mum by writing a Java program that prints the number names of the numbers so Johanna may check the answers herself.

Assume that she is learning from zero to nine.


Note:

Number should not start with zero
In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program. 


Sample Input 1

Enter the number

58723

Sample Output 1 

five eight seven two three 

Sample Input 2

Enter the number

614

Sample Output 2

six one four

Sample Input 3

Enter the number

20

Sample Output 3

two zero

 */

 import java.util.Scanner;

 class NumberNames{
 
     String[] names = {"zero","one","two","three","four","five","six","seven","eight","nine"};
 
     public void printNumberName(int number){
 
         String numStr = Integer.toString(number);
 
         for (int i = 0; i<numStr.length();i++){
 
             int digit = Character.getNumericValue(numStr.charAt(i));
 
             System.out.print(names[digit]);
 
             if(i!=numStr.length()-1){
 
                 System.out.print(" ");
 
             }
 
         }
 
         System.out.println();
 
     }
 
 }
 
 public class UserInterface {
 
     public static void main(String[] args) 
 
     {   Scanner scanner = new Scanner(System.in);
 
         NumberNames NumberNames=new NumberNames();
 
         System.out.println("Enter the number");
 
         int number = scanner.nextInt();
 
         NumberNames.printNumberName(number);
 
     }
 
 }