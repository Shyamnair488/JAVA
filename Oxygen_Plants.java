/*Across the world, millions of plants produce oxygen for millions of people. Levi is experimenting with oxygen production in an airtight room. He calculates the total number of plants that can be placed in a room based on the floor area of the room. Plant sets should be a multiple of 10, and if not, they should be rounded to the nearest and lowest multiple of 10. Also, a mature plant produces 0.9 litres of oxygen per day. Calculate the total production of oxygen based on the total number of plants in the room using a Java program.

Note:

m denotes Meter and cm denotes Centimeter. 
To convert cm2 to m2, divide it by 100*100.
If the length of the room is negative or zero print "Invalid length" and terminate the program.
If breadth of the room is negative or zero print "Invalid breadth" and terminate the program.
If the plant area is zero or negative print "Invalid plant area" and terminate the program.
The output format should be in two decimal places. Use "System.out.printf("%.2f",percentage);" for 2 digits after the decimal points.
In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.
 Hi, I'm "Friendly Hendy" and I can help you write the solution for this description.

You are provided with a UserInterface class with the main method. 
Create a new Scanner object called "sc" that reads input from the standard input stream (System.in).
Scanner sc=new Scanner(System.in);

Declare three double variables called "l", "b" and "plantArea".
double l,b,plantArea;

Print the message "Enter the length of the room(in m)" using System.out.println() method.
System.out.println("Enter the length of the room(in m)");

Use the nextDouble() method of the Scanner object to read a double value from the user and assign it to the "l" variable.
l=sc.nextDouble();

Create an outer loop called "Outer".
Outer:{

Check if the value of "l" is less than or equal to 0. If so, print the message "Invalid length" and break out of the outer loop.
if(l<=0) {

   System.out.println("Invalid length");

   break Outer;

}

Print the message "Enter the breadth of the room(in m)" to the console, asking the user to enter the breadth of the room.
System.out.println("Enter the breadth  of the room(in m)");

Use the nextDouble() method of the Scanner object to read a double value from the user and assign it to the "b" variable.
b=sc.nextDouble();

Check if the value of "b" is less than or equal to 0. If so, print the message "Invalid breadth" and break out of the outer loop.
if(b<=0){

   System.out.println("Invalid breadth");

   break Outer;

   }

Print the message "Enter the plant area of a single plant(in cm2)" to the console, asking the user to enter the plant area.
System.out.println("Enter the plant area of a single plant(in cm2)");

Use the nextDouble() method of the Scanner object to read a double from the user and assign it to the "plantArea" variable.
plantArea=sc.nextDouble();

Check if the value of "plantArea" is less than or equal to 0. If so, print the message "Invalid plant area" and break out of the outer loop.
if(plantArea<=0){

   System.out.println("Invalid plant area");

   break Outer;

}

Calculate the total number of plants that can be grown in the room by dividing the total area of the room (l*b) by the area of a single plant (plantArea/10000) and assign it to an integer variable "totalPlants".
int totalPlants=(int)((l*b)/(plantArea/10000));

Check if the value of "totalPlants" is not divisible by 10. If so, calculate the remainder of the division and subtract it from "totalPlants".
if (totalPlants%10!=0){

   int rem=totalPlants%10;

   totalPlants=totalPlants-rem;

  }

Calculate the total oxygen production by multiplying the number of plants by 0.9 and assign it to a variable "production".
double production=0.9*totalPlants;

Print the message "Total number of plants is " followed by the value of "totalPlants".
System.out.println("Total number of plants is "+totalPlants);

Print the message "Total oxygen production is " followed by the value of "production" in litres and use the printf method.
System.out.printf("Total oxygen production is %.2f litres",production);

Close the outer loop

  }

Sample Input 1

Enter the length of the room(in m)

4

Enter the breadth of the room(in m)

4

Enter the plant area of a single plant(in cm2)

625

Sample Output 1

Total number of plants is 250

Total oxygen production is 225.00 litres

 

Explanation:

Total plants = floor area ( in m2 )/plant area ( in m2 )

Total plants = ( 4*4 / 625 )*100*100 = 256 ~250 ( Round it the nearest and lowest multiple of 10 )

Total Production of Oxygen = 250*0.9 = 225



Sample Input 2

Enter the length of the room(in m)

-5

Sample Output 2

Invalid length



Sample Input 3

Enter the length of the room(in m)

8

Enter the breadth of the room(in m)

-4

Sample Output 3

Invalid breadth



Sample Input 4

Enter the length of the room(in m)

5

Enter the breadth of the room(in m)

5

Enter the plant area of a single plant(in cm2)

-8

Sample Output 4

Invalid plant area */

import java.util.Scanner;

 class OxygenCalculator {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        double l,b,plantArea;

        

        System.out.println("Enter the length of the room(in m)");

        l=sc.nextDouble();

        

        Outer: {

            if (l<=0){

                System.out.println("Invalid length");

                break Outer;

            }

            

            System.out.println("Enter the breadth of the room(in m)");

            b=sc.nextDouble();

                

            if (b<=0){

                

                    System.out.println("Invalid breadth");

                    break Outer;

                    

            }

            System.out.println("Enter the plant area of a single plant(in cm2)");

            plantArea=sc.nextDouble();
            if (plantArea<=0){

                System.out.println("Invalid plant area");

                break Outer;

            }

                

            int totalPlants = (int) ((l*b)/(plantArea/(10000)));

                

                

            if (totalPlants % 10!=0) {

                    int rem = totalPlants%10;

                    totalPlants-=rem;

            }

            double production = 0.9* totalPlants;

                

            System.out.println("Total number of plants is "+totalPlants);

            System.out.printf("Total oxygen production is %.2f litres\n",production);                

            }

        }

    }

    

public class UserInterface{

    public static void main(String[] args){

        OxygenCalculator.main(args);

    }
}