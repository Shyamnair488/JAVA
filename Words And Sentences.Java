/*Sheethal teaches her little daughter Charu about words and sentences. Sheetal gives Charu a task to find whether the given word is present in the given sentence or not. Help Charu  complete her task by writing a Java program.

If the second input is present in the first input, then print "<second input> is present in the sentence". Else print "<second input> is not present in the sentence".

Note:

The input word is case sensitive

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.

Ensure to follow the object-oriented specifications provided in the question.

Ensure to provide the names for classes, interface, attributes and methods as specified in the question.

Adhere to the code template, if provided.

Please do not use System.exit(0) to terminate the program


Sample Input1:

Enter the sentence

Creativity is always having fun

Enter the word

having

Sample Output 1:

having is present in the sentence


Sample Input2:

Enter the sentence

we know one of the most places

Enter the word

fun

Sample Output2:

fun is not present in the sentence

 */


 import java.util.Scanner;

 class wordchecker{
 
     private String sentence;
 
     private String word;
 
     
 
     public wordchecker(String sentence,String word){
 
         this.sentence=sentence;
 
         this.word=word;
 
     }
 
     
 
     public void checkwordpresence(){
 
         if(sentence.contains(word)){
 
             System.out.println(word+" is present in the sentence");
 
         }else {
 
             System.out.println(word +" is not present in the sentence");
 
         }
 
     }
 
 }
 
 public class UserInterface 
 
 {
 
     public static void main(String args[]) 
 
     {
 
     
 
         Scanner sc =new Scanner(System.in);
 
         //Fill the code
 
         System.out.println("Enter the sentence");
 
         String sentence=sc.nextLine();
 
         System.out.println("Enter the word");
 
         String word=sc.nextLine();
 
         
 
         wordchecker checker =new wordchecker(sentence,word);
 
         checker.checkwordpresence();
 
         sc.close();
 
         
 
         
 
     }
 
     
 
 }   