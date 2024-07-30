/*Oliver and his friend are playing a number game. If Oliver says a 4-digit number, his friend should reverse the number and expand the number.

If the number is not a 4-digit number, then print '<<number>> is an invalid number'.


Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please don't use System.exit(0) to terminate the program.

Hi, I'm "Friendly Hendy" and I can help you write the solution for this description. 

You are provided with a UserInterface class with the main method. 
Create a new Scanner object called "sc" that reads input from the standard input stream (System.in).
Scanner sc = new Scanner(System.in);

Declare an integer variable called "reversed" with an initial value of 0.
int reversed=0;

Print the message "Enter the number" using System.out.println() method. 
System.out.println("Enter the number");

Use the nextInt() method of the Scanner object to read an integer value from the user and assign it to the variable "no".
int no=sc.nextInt();

Get the length of the entered integer and assign it to an integer variable called "lengthOfInt".
int lengthOfInt = String.valueOf(no).length();

Check if the length of the entered number is 4 digits.
if(lengthOfInt==4){

If the condition is true, start a while loop that continues until the value of "no" is not 0.
while(no != 0) {

Within the while loop, find the last digit of the number by taking the remainder of the number divided by 10 and assign it to a variable called "digit".
int digit = no % 10;

Concatenate the "digit" to the "reversed" variable by multiplying it by 10 and add "digit" to it.
reversed = reversed * 10 + digit;

Remove the last digit from the "no" variable by dividing it by 10 and close the while loop.
no /= 10;

  }

Print the message "Reversed number is " followed by the value of "reversed" using System.out.println() method.
System.out.println("Reversed number is "+reversed);

Convert the reversed number to a string and split the number into digits by using the split method.
String[] str = Integer.toString(reversed).split("");

Create an empty string called "result".
String result = "";

Start a for loop that continues until the value of i is less than the length of the string array.
for(int i = 0; i < str.length; i++){

Within the for loop, check if the value of the element at position i of the string array is greater than 0.
 if(Integer.valueOf(str[i]) > 0){

Ifthe condition is true, concatenate the element at position i of the string array to the "result" string.
result += str[i];

Start a nested for loop that continues until the value of j is less than the length of the string array minus 1.
for(int j = i; j < str.length - 1; j++){

Within the nested for loop, concatenate '0' to the "result" string and close the nested for loop.
result += '0';

}

Concatenate '+' and ' ' to the "result" string.
result += " + ";

End the if condition inside the for loop and the for loop
}

}

Use the substring method to remove the last three characters of the "result" string, which are '+' and ' '.
result = result.substring(0, result.length() - 3);

Use the replaceAll method to remove any whitespaces from the "result" string.
result = result.replaceAll("\\s+", "");  

Print the "result" string using System.out.println() method.
System.out.println(result);

Close the if statement that checks the length of the entered number
}

If the length of the entered number is not 4 digits, print the message "is an invalid number", using System.out.println() method.
else{      

  System.out.println(no+" is an invalid number");

 }


Sample Input/Output 1:

Enter the number

456

456 is an invalid number



Sample Input/Output 2

Enter the number

5864

Reversed number is 4685

4000+600+80+5



Sample Input/Output 3

Enter the number

3400

Reversed number is 43

40+3 */


import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) 

    {

        Scanner sc = new Scanner(System.in);

        int reversed = 0;

        

        System.out.println("Enter the number");

        int no = sc.nextInt();

        

        int lengthOfInt = String.valueOf(no).length();

        

        if (lengthOfInt == 4){

            while (no != 0){

                int digit = no%10;

                reversed= reversed*10+digit;

                no/=10;

                

            }

            System.out.println("Reversed number is "+ reversed);

            

            String[] str = Integer.toString(reversed).split("");

            String result = "";

            

            for (int i=0;i < str.length; i++)

            {

                if (!str[i].equals("0"))

                {

                    result+=str[i];

                    

                    for (int j = i;j<str.length-1;j++)

                    {

                        result+= '0';

                        

                    }

                    

                    result += "+";

                }

            }

                

            result = result.substring(0,result.length()-3);

        //  result=result.replaceAll("\\s+", "");

                    

            System.out.println(result);

        }else if (lengthOfInt == 1){

            System.out.println( no + " is a single digit number , no reserval needed.");

        }else if (lengthOfInt==2){

            System.out.println("reversed number is " + no % 10+""+no /10);
               

        }else if (lengthOfInt ==3){

            int digit1=no%10;

            no/=10;

            int digit2 = no%10;

            no/=10;

            int digit3=no;

            System.out.println("reversed number is " + digit1+ ""+ digit2+""+digit3);

            

        }else{

            System.out.println(no + " is an invalid number");

        }

    }

}

        