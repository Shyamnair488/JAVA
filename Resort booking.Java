/*Velan resort decides to automate their bookings. By automating they can easily enter the customer details, number of people visiting the resort, and based on the customer category they can calculate the booking price. So help the resort to do the automation using a Java program

Assumption

Price is in dollars
For 1 adult 1000 per day
For 1 child 650 per day
Take input from the user as a single string separating each field with a colon.
 <customer name>:<number of adults>:<number of child>:<number of days>

Note:

Customer category should be either "adult" or "child".
If the number of adults is less than zero, print "Invalid input for number of adults"
If the number of children is less than zero, print "Invalid input for number of children"
If the number of days is less than or equal to zero, print "Invalid input for number of days"
In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Do not use System.exit(0) to terminate the program

Sample Input/Output 1:

Enter the customer details

Harish:2:2:2

Harish your booking is confirmed and the total cost is 6600



Sample Input/Output 2:

Enter the customer details

Guru:1:0:0

Invalid input for number of days



Sample Input/Output 3:

Enter the customer details

Ezhil:1:0:1

Ezhil your booking is confirmed and the total cost is 1000 */


import java.util.Scanner;

public class UserInterface {

    

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        

        System.out.println("Enter the customer details");

        

        String input =sc.nextLine();

        String[] details=input.split(":");

        

        String customerName=details[0];

        int numOfAdults=Integer.parseInt(details[1]);

        int numOfChildren=Integer.parseInt(details[2]);

        int numOfDay=Integer.parseInt(details[3]);

        

        if(numOfAdults<0){

            System.out.println("Invalid input for number of adults");

            

        }

        else if(numOfChildren<0){

            System.out.println("Invalid input for number of children");

        }

        else if(numOfDay<=0){

            System.out.println("Invalid input for number of days;");

        }

        else {

            int totalCost=calculateTotalCost(numOfAdults,numOfChildren,numOfDay);

            System.out.println(customerName+" your booking is confirmed and the total cost is "+ totalCost);

        }

        sc.close();

    }

    

    public static int calculateTotalCost(int numOfAdults,int numOfChildren,int numOfDay){

        int adultCost=numOfAdults*1000*numOfDay;

        int childCost=numOfChildren*650*numOfDay;

        

        int totalCost=adultCost+childCost;

        return totalCost;

    }

}