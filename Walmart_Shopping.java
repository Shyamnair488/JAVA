/*Walmart is one of the most famous online shopping companies. They have a few traditional stores. They have planned to automate the bill generation based on the product type. You, being their software consultant, have been approached to develop software to implement the functionality to generate the bill.

Component Specification: Walmart

Type(Class)

Attributes

Methods

Walmart

String name

long barcode

String productType

String productName

Include the getters and setters method for all the attributes.

Include a public parametrized constructor of four arguments in the following order - name, barcode, productType, productName to initialize the values for the Walmart object

 

Requirement: Calculate the bill based on the product type.

Component Specification:  Walmart

Component Name

Type(Class)

Methods

Responsibilities

Calculate the total bill

Walmart

public double calculateTotalBill ( double cost )

This method should calculate the total bill based on the product type and return the calculated bill amount.

 







Note: The class and methods should be declared as public and all the attributes should be declared as private.

Formula to calculate the bill amount in the Walmart class:

Bill amount = ( Cost * Tax ) + Cost

productType

Tax

ElectricalItems

0.5

Grocery

0.3

Garments

0.6

 

Example

Bill amount = ( Cost of wire * Tax of ElectricalItems ) + Cost of wire

Bill amount = 200 * 0.5 = 100 + 200 = 300.0$.

Note: Kindly use the equals method in the productType. Since the productType is case sensitive

 

In the UserInterface class, write the main method.

Get the values from the user.

When the productType is not any of the specified type ( i.e , ElectriclaItems , Grocery, or Garments) , then print "Invalid Product Type" and terminate the program.

Display the result as shown in the sample output.

 

Note :

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.
 

Sample Input 1:

Enter the Name

John

Enter the Barcode

99079909890

Enter the Product Type

ElectricalItems

Enter the Product Name

Wire

Enter the price of the item

200



Sample Output 1:

Name : John

Barcode : 99079909890

Product Type : ElectricalItems

Product Name : Wire

Bill Amount : 300.0

 

Sample Input 2:

Enter the Name

James

Enter the Barcode

99898989999733

Enter the Product Type

ElectronicItems



Sample Output 2:

Invalid Product Type

 */


 import java.util.Scanner;

 public class UserInterface 
 
 {
 
     public static void main(String args[]) 
 
     {
 
         Scanner sc =new Scanner(System.in);
 
         //Fill the code
 
         
 
     }
 
     
 
 } 

 public class Walmart 

{

    //Include Getters and Setters

    //Include four argument constructor

    //Include public double calculateTotalBill(double cost) method

    

    

}