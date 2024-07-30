/*
 The fourth standard teacher teaches the area of Basic Shapes to the students. The teacher shows certain shapes, the student is asked to identify the shapes based on the number of sides and calculate the area. Write a java program to find the shape and calculate the area. 

If the number of sides is 0, it is a circle. Get the radius and calculate the area using the formula area of circle = 3.14 * radius * radius.

If the number of sides is 3, it is a triangle. Get the base and height and calculate the area using the formula area of triangle = (base * height)/2.

If the number of sides is 4, get the length and breadth. If the length and breadth are equal, it is a square. Calculate the area using the formula area of square = length * length. If the length and breadth are different, it is a rectangle. Calculate the area using the formula area of rectangle= length * breadth.

If any other value is entered for the number of sides, print "Invalid side".


Note:

Area should have only 2 decimal places.
In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program. 



Sample Input 1:

Enter the sides

3

Enter the base and height

5.2

7.8

Sample Output 1:

Area of the Triangle is 20.28



Sample Input 2:

Enter the sides

0

Enter the radius

5.5

Sample Output 2:

Area of the Circle is 94.99



Sample Input 3:

Enter the sides

4

Enter the length

8.5

Enter the breadth

5.2

Sample Output 3:

Area of the Rectangle is 44.20



Sample Input 4:

Enter the sides

4

Enter the length

8.5

Enter the breadth

8.5

Sample Output 4:

Area of the Square is 72.25



Sample Input 5:

Enter the sides

2

Sample Output 5:


Invalid side
 */



 import java.util.Scanner;

 class Shape{
 
     int sides;
 
     double base,height,radius,length,breadth;
 
     public void calculateArea(){
 
         Scanner sc = new Scanner(System.in);
 
         System.out.println("Enter the sides");
 
         sides = sc.nextInt();
 
         if (sides == 0){
 
             System.out.println("enter the radius");
 
             radius = sc.nextDouble();
 
             double area = 3.14*radius*radius;
 
             System.out.printf("Area of the Circle is %.2f\n",area);
 
         }else if (sides == 3){
 
             System.out.println("Enter the base and height");
 
             base = sc.nextDouble();
 
             height = sc.nextDouble();
 
             double area = (base*height)/2;
 
             System.out.printf("Area of the Triangle is %.2f\n",area);
 
         }else if (sides == 4){
 
             System.out.println("Enter the length");
 
             length = sc.nextDouble();
 
             System.out.println("Enter the breadth");
 
             breadth= sc.nextDouble();
 
             if(length == breadth){
 
                 double area=length*length;
                 System.out.printf("Area of the Square is %.2f\n", area);  
 
             }else {
 
                 double area = length*breadth;
 
                 System.out.printf("Area of the Rectangle is %.2f\n",area);
 
             }
 
         }else {
 
             System.out.println("Invalid Side");
 
         }
 
     }
 
 }
 
 public class UserInterface {
 
     public static void main(String[] args) 
 
     {
 
         Shape shape=new Shape();
 
         shape.calculateArea();
 
     }
 
 }