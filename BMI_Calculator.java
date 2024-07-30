/*Star Fitness Club wants to calculate the Body Mass Index (BMI) for all its customers. Customers may enter their height and weight. Each customer should know their body mass index and weight loss or gain goals to be fit and healthy. Help them to achieve this with the help of a Java program. 

The formula for calculating BMI is weight/((height/100) *(height/100)).

Display the bmi with respect to 2 decimal points.

If bmi is greater than or equal to 25, print "You are overweight" and then print the number of kilograms to be reduced to become fit as "Reduce <<kgs>>kg to be fit".

If bmi is less than 25 and greater than or equal to 18.5, print "You are fit and healthy".

If bmi is less than 18.5, print "You are underweight" and then print the number of kilograms to be gained to become fit as "Gain <<kgs>>kg to be fit".


Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program. 



Sample Input 1:

Enter weight in kg

108

Enter height in cm

168

Sample Output 1:

Your BMI is 38.27. You are overweight

Reduce 13.27 kg to be fit



Sample Input 2:

Enter weight in kg

68

Enter height in cm

172

Sample Output 2:


Your BMI is 22.99. You are fit and healthy



Sample Input 3:

Enter weight in kg

42.7

Enter height in cm

158

Sample Output 3:

Your BMI is 17.10. You are underweight

Gain 1.40 kg to be fit */


import java.util.Scanner;

class BMI 

{

    double weight;

    double height;

    public void calculateBMI()

    {

        Scanner sc = new Scanner(System.in);

        

        System.out.println("Enter weight in kg");

        weight = sc.nextDouble();

        

        System.out.println("Enter height in cm");

        height = sc.nextDouble();

        

        double bmi = weight/((height/100)*(height/100));

        System.out.printf("Your BMI is %.2f. ",bmi);

        

        if (bmi >= 25)

        {

            

            System.out.println("You are overweight");

            System.out.printf("Reduce %.2f kg to be fit\n",(bmi-25));

        }else if (bmi >= 18.5)
        {

            System.out.println("You are fit and healthy");

        } else

        {

            System.out.println("You are underweight");

            System.out.printf("Gain %.2f kg to be fit\n",(18.5-bmi));

        }

    }

}   

public class UserInterface{

    public static void main(String[] args){

        BMI customer = new BMI();

        customer.calculateBMI();

    }

}

