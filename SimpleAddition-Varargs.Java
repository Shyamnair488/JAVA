/*John is very much interested in learning new Java concepts, and he wanted to learn about Variable Arguments. As a first step towards learning, he began with a simple addition program. Join hands with John to accomplish the task.

 

Type (Class)

Attributes

Methods

Responsibilities

UserInterface

public static int addition (int... a)

Include this method which is used to carry out the addition. In this method, print the total number of arguments passed from the main and return the sum.

 

Note: 

The method should be declared as public.
In the UserInterface class, write the main method and call the addition method. 
Print the number of arguments in this method and return the sum.
Display the result as shown in the sample output.
Note:

Call the addition method with two arguments, three arguments and six arguments.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.
 


Sample Output 1: (Values to be passed is given in the code skeleton)

Number of arguments is 2

Total 25

Number of arguments is 3

Total 60

Number of arguments is 6

Total 220 */
// Don't Change the Structure

import java.util.Scanner;

import java.util.Arrays;

public class UserInterface 

{

    

        

    public static int addition(int... a){

            System.out.println("Number of arguments is "+ a.length);

            

            int sum=Arrays.stream(a).sum();

            

            return sum;

        }

        

        

    public static void main(String[] args){

        int result1=addition(10,15);

        System.out.println("Total "+ result1);

            

        int result2 = addition(20,30,10);

        System.out.println("Total "+result2);

            

        int result3=addition(40,50,30,20,25,55);

        System.out.println("Total "+ result3);

        }

        

        

        //Call the addition method with two arguments 10,15

        

        

        

        //Call the addition method with three arguments 10,20,30

        

        

        

        //Call the addition method with six arguments 10,30,60,100,5,15

        

        

        

    }