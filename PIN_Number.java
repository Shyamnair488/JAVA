/*Harry bought a new phone. He decides to put a safety lock on his phone for which he wants to create a pin number. He asked his friend to suggest some four-digit numbers, but the numbers should pass some of his conditions. If the number passes the condition, he will keep it as a pin number. Help him validate the PIN number using a Java program.

Requirements:

The total number of PIN numbers entered should be a value greater than 0, else print "<no of PIN number> is an invalid number".
The PIN number should be a four-digit number, else print "<PIN number> is an invalid PIN number"
Condition for the PIN number:

The starting number should be an odd number
The second number should be an even number
The third number should be a prime number
The last number should be a composite number
Assume numbers only between 1 to 9.
If all the numbers fail the above condition, then print "All these <no of PIN number> numbers are not a valid PIN number"
If more than one PIN number passes the condition, then print the number

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program. 

Sample Input/Output 1:

Enter the total number of PIN numbers

4

Enter the PIN numbers

1234

8975

5656

2589

Valid PIN numbers are

1234

5656

 

Sample Input/Output 2:

Enter the total number of PIN numbers

2

Enter the PIN numbers

2659

1398

All these 2 numbers are not a valid PIN number

 

Sample Input/Output 3:

Enter the total number of PIN numbers

3

Enter the PIN numbers

1829

564

564 is an invalid PIN number

 

Sample Input/Output 4:

Enter the total number of PIN numbers

-1

-1 is an invalid number


 */

 import java.util.Scanner;

 public class UserInterface{
 
     
 
     public static void main(String[] args){
 
         Scanner scanner =new Scanner(System.in);
 
         
 
         System.out.println("Enter the total number of PIN numbres");
 
         int totalpins = scanner.nextInt();
 
         
 
         if(totalpins<=0){
 
             System.out.println(totalpins+" is an invalid number");
 
             return;
 
         }
 
         
 
         int[] validpins = new int[totalpins];
 
         int validcount=0;
 
         
 
         System.out.println("Enter the PIN numbers");
 
         for (int i=0;i<totalpins;i++){
 
             int pin =scanner.nextInt();
 
             
 
             if(pin<1000|| pin>9999){
 
                 System.out.println(pin+" is an invalid PIN number");
 
                 //continue;
 
                 break;
 
             }
 
             
 
             if(isValidPIN(pin)){
 
                 validpins[validcount++]=pin;
 
                 
 
             }else{
 
                 System.out.println(pin+" is an invalid PIN number");
 
                 
 
             }
 
         }
 
         
 
         if (validcount==0){
 
             System.out.println("All these "+totalpins+" numbers are not a valid PIN number");
 
             
 
         }else{
 
             System.out.println("Valid PIN numbers are");
 
             for(int i=0;i<validcount;i++){
 
                 System.out.println(validpins[i]);
 
             }
 
         }
 
     }
 
     
 
     private static boolean isValidPIN(int pin){
 
         int[] digits = new int[4];
 
         int temp=pin;
 
         
 
         for(int i=3;i>=0;i--){
 
             digits[i]=temp%10;
 
             temp/=10;
 
         }
 
         return digits[0]%2!=0 && digits[1]%2==0 && isPrime(digits[2]) && !isPrime(digits[3]);
 
             
 
     }
 
     
 
     private static boolean isPrime(int num){
 
         if(num<=1){
 
             return false;
 
         }
 
         
 
         for(int i=2;i<=Math.sqrt(num);i++){
 
             if(num%i==0){
 
                 return false;
 
             }
 
         }
 
         return true;
 
     }
 
 }
 
 
 
 
 
 
 
 