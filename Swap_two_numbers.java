/*Thara is attending a math lecture, and her professor asks students to swap two numbers using a bitwise operator. The professor finds it difficult to check the logic of 50 students. So, he decided to write a Java program to get two numbers, first and second, from the user and swap the numbers. He is not good at programming. Help them by developing an application using your Java skills.

Note:

Use bitwise operator.
Negative and zero are also accepted as inputs and numbers have to be swapped accordingly.
In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.

Sample Input 1:

Enter the numbers

87

43

Sample Output 1:

Before swapping

first = 87, second = 43

After swapping

first = 43, second = 87 */



import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) 

    {

        Scanner sc= new Scanner(System.in);

        

        System.out.println("Enter your numbers");

        int first=sc.nextInt();

        int second = sc.nextInt();

        

        System.out.println("Before swapping");

        System.out.println("first = "+ first+ ", second = "+ second);

        

        first = first^second;

        second = first^second;

        first=first^second;

        

        System.out.println("After swapping");

        System.out.println("first = "+first+ ", second = "+ second);

        sc.close();

    } 

}