/*Kevin is trying to solve a number puzzle. If the number is greater than fifty, he wants the difference between the digits of the number; otherwise, if the number is less than or equal to fifty, he wants to reverse the number and find the difference in digits. Help Kevin to solve the problem using a Java program.

Requirements:

The input number should be a two-digit integer, or else display "Invalid number".

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.


Sample Input/Output 1:

Enter the number

56

-1

Explanation:

56 is greater than 50, so subtract 5 - 6 = -1



Sample Input/Output 2:

Enter the number

48

4

Explanation:

48 is less than 50, so reverse 48 to 84 then subtract 8 - 4 = 4



Sample Input/Output 3:

Enter the number

9

Invalid number

 */



Manage activity

Dismiss
 UserInterface.java 

client



1

2

3

4

5

6

7

8

9

10

11

12

13

14

15

16

17

18

19

20

21

22

23

24

25

26



import java.util.Scanner;

class numberpuzzlesolver{

    private int number;

    public numberpuzzlesolver(int number){

        this.number=number;    

    }

    public int solvepuzzle(){

        if(number<10 || number>99){

            System.out.println("Invalid number");}

        if (number>=50){

            int digit1 = number/10;

            int digit2 = number%10;

            return digit1 - digit2;

        }

        else {

            int reversednumber = (number% 10)*10+(number/10);

            int digit1=reversednumber/10;

            int digit2=reversednumber%10;

            return digit1 - digit2;

        }

    }

}

public class UserInterface{

    public static void main(String[] args){

       Scanner sc=new Scanner(System.in);

       System.out.println("Enter the number");


       int number = sc.nextInt();

       numberpuzzlesolver numberpuzzlesolver=new numberpuzzlesolver(number);

       int result =numberpuzzlesolver.solvepuzzle();

       if (result!=1){

           if (result<9 || result>100){

               System.out.println(result);

           }

       }

        

        sc.close();

        

    }

}




