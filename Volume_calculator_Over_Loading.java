/*Sarah got confused to calculate volume of cylinder and cuboid. Write a Java application to help Sarah to do this.

Requirement: Calculate the volume.

Component Specification:  VolumeCalculator

Component Name

Type(Class)

Methods

Responsibilities

Calculate the Volume of the Cylinder

VolumeCalculator

public double calculateVolume(double radius,double height)

This method calculates the volume of the cylinder and returns the calculated volume of the cylinder

Formula

Volume of the cylinder =

3.14*radius*radius*height


Calculate the Volume of the Cuboid

VolumeCalculator

public double calculateVolume(int length,int breadth,int height)

This method calculates the volume of the cuboid and returns the calculated volume of the cuboid

Formula

Volume of the cuboid =

length*breadth*height

 



























Note: The class and methods should be declared as public and all the attributes should be declared as private. 

Example

Length = 3

Breadth = 2

Height = 1

Formula

Volume of the Cuboid = length*breadth*height

Volume of the Cuboid = 3*2*1= 6.00.

 

In the UserInterface class, write the main method to test the application.

 Note:

The output format should be in two decimal places. Use "System.out.printf("%.2f", percentage);" for 2 digits after the decimal points.
In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.

 

Sample Input 1:

Enter the choice
1.Find Volume For Cylinder
2.Find Volume For Cuboid
1
Enter the radius
3
Enter the height
2

Sample Output 1:

Volume of the Cylinder is 56.52


Sample Input 2:
Enter the choice
1.Find Volume For Cylinder
2.Find Volume For Cuboid
2

Enter the length
3
Enter the breadth
2
Enter the height
1


Sample Output 2:

Volume of the Cuboid is 6.00

 */

 import java.util.Scanner;

 public class UserInterface {
 
     
 
     public static void main(String[] arg)
 
     {
 
         Scanner sc=new Scanner(System.in);
 
         VolumeCalculator calculator = new VolumeCalculator();
 
         
 
         System.out.println("Enter the choice");
 
         System.out.println("1.Find Volume For Cylinder");
 
         System.out.println("2.Find Volume For Cuboid");
 
         
 
         int choice=sc.nextInt();
 
         
 
         if(choice==1){
 
             System.out.println("Enter the radius");
 
             double radius=sc.nextDouble();
 
             
 
             System.out.println("Enter the height");
 
             double height=sc.nextDouble();
 
             
 
             double volume=calculator.calculateVolume(radius,height);
 
             System.out.printf("Volume of the Cylinder is %.2f%n",volume);
 
             
 
         }else if (choice==2){
 
             System.out.println("Enter the length");
 
             int length=sc.nextInt();
 
             System.out.println("Enter the breadth");
 
             int breadth=sc.nextInt();
 
             System.out.println("Enter the height");
 
             int height=sc.nextInt();
 
             
 
             double volume=calculator.calculateVolume(length,breadth,height);
 
             System.out.printf("Volume of the Cuboid is %.2f%n",volume);
 
         }else{
 
             System.out.println("Invalid choice!");
 
         }
 
         sc.close();
 
     }
 
 }



import java.util.Scanner;

public class VolumeCalculator {

    // Fill the code

    public double calculateVolume(double radius,double height){

        double a=3.14*radius*radius*height;

        return a;

    }

    

    public double calculateVolume(int length,int breadth,int height){

        return length*breadth*height;

    }

    

    

    

    

}