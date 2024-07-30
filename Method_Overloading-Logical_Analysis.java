/*Analyze the code for logical errors. You are provided with the code skeleton having the solution with logical errors. Fix the logical error in the code.

You are provided with a class UserInterface with the main method.

Implement the below methods in the class UserInterface.

public float calculateArea(float side) - This method should return the area of a square with the side given as a parameter. That is it should return side * side.

public float calculateArea(float length, float breadth) - This method should return the area of the rectangle with length and breadth given as parameters. That is it should return length * breadth.

Invoke the above methods in the main method and print the output.

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program. 



Sample Input :

Enter value1

1.5

Enter value2

2.5

Sample Output :

Area of square 2.25

Area of rectangle 3.75 */



import java.util.Scanner;

public class UserInterface{ 

    //Implement the calculateArea methods

    

    

    public static void main(String[] args) {

        

        Scanner sc=new Scanner(System.in);

        

        System.out.println("Enter value1");

        float value1=sc.nextFloat();

        System.out.println("Enter value2");

        float value2=sc.nextFloat();

        

        UserInterface ui = new UserInterface();

        //Invoke the calculateArea method here

        

        float squareArea=ui.calculateArea(value1);

        float rectangleArea=ui.calculateArea(value1,value2);

        

        System.out.println("Area of square "+squareArea);

        System.out.println("Area of rectangle "+rectangleArea);

    }

    public float calculateArea(float side){

        return side*side;

    }

    public float calculateArea(float length,float breadth){

        return length*breadth;

    }

}