/*Olivia likes to play with numbers. She told her friends about a game in which Olivia would tell them three numbers and they would have to find the smallest among them. As it was time-consuming, her friends decided to write a program to get three numbers and print the smallest one. Help them by developing an application using your Java skills.

Note:

Use ternary operator.
If all 3 numbers are same then print "All numbers are equal".
Negative and zero are also accepted as inputs and the smallest number has to be found accordingly.
In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.


Sample Input 1:

Enter the numbers

58

75

43

Sample Output 1:

The smallest number is 43



Sample Input 2:

Enter the numbers

8

-7

4

Sample Output 2:

The smallest number is -7



Sample Input 3:

Enter the numbers

5

5

5

Sample Output 3:

All numbers are equal



Sample Input 4:

Enter the numbers

8

8

78

Sample Output 4:

The smallest number is 8 */



import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) 

    {

        Scanner sc= new Scanner(System.in);

        

        System.out.println("Enter the numbers");

        int num1= sc.nextInt();

        int num2 = sc.nextInt();

        int num3= sc.nextInt();

        

        int smallest = (num1<=num2 && num1<=num3)? num1: (num2 <=num1 && num2<=num3)? num2:num3;

        

        if (num1==num2 && num2==num3){

            System.out.println("All numbers are equal");

            

        }else {

            System.out.println("The smallest number is "+ smallest);

            

        }

        

        

    } 

}