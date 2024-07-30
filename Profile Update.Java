/*Digital Technologies has decided to make some updates to the employee profile. So they like to add PAN number and E-mail ID in each profile. Help the firm to validate the PAN number and E-mail ID given by employees using the Java program

Requirements:

-        PAN number should have exactly ten characters. The first 5 characters should be alphabets in uppercase, the next four characters should be digits from 0 to 9 and the last character should be an alphabet in uppercase

-        If the PAN number fails the above condition, then print "<PAN number> is an invalid PAN number" and terminate the program.

-        E-mail should end with "@digitec.com", before @ there should be at least 5 to maximum 10 characters. All characters should be in lowercase

-        IF E-mail ID fails the above condition, then print "Invalid E-mail ID" and terminate the program.


Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program. 



Hi, I'm "Friendly Hendy" and I can help you write the solution for this description.

You are provided with a UserInterface class with the main method.
Create a new Scanner object called "sc" that reads input from the standard input stream (System.in).
Scanner sc = new Scanner(System.in);

Print a message prompting the user to "Enter your name" using System.out.println() method.
System.out.println("Enter your name");

Use the nextLine() method of the Scanner class to to take input  from the user and store it in a variable called "a".
String a = sc.nextLine();

Print a message prompting the user to "Enter your PAN number" using System.out.println() method.
System.out.println("Enter your PAN number");

Use the next() method of the Scanner class to take input for the PAN number from the user and store it in a variable called "s".
String s = sc.next();

Create a variable "p" and assign it a regular expression pattern that represents a valid PAN number format.
String p = "[A-Z]{5}[0-9]{4}[A-Z]";

Use the matches() method of the Pattern class along with the "p" variable and the "s" variable to check if the input PAN number matches the pattern.
if(Pattern.matches(p, s)) {

If the input PAN number matches the pattern, print a message prompting the user to "Enter your E-mail ID" using System.out.println method().
System.out.println("Enter your E-mail ID");

Use the next() method of the Scanner class to take input for the E-mail ID and store it in a variable called "S".
String S = sc.next();

Create a variable "P" and assign it a regular expression pattern that represents a valid E-mail ID format.
String P = "[a-z]{5,10}[@][a-z]{7}[.][a-z]{3}";

Create a variable "q" and assign it the substring of "S" starting from the 11th character from the end.
String q = S.substring((S.length()-11));

Use the matches() method of the Pattern class along with the "P" variable and the "S" variable to check if the input E-mail ID matches the pattern and check if the substring "q" is equal to "digitec.com".
if(Pattern.matches(P, S) && q.equals("digitec.com")) 

If the input E-mail ID matches the pattern and the substring "q" is equal to "digitec.com", print a message saying "Profile of [name] updated successfully", using System.out.println() method.
System.out.println("Profile of "+a+" updated successfully");

If the input E-mail ID does not match the pattern or the substring "q" is not equal to "digitec.com", print a message saying "Invalid E-mail Id", using System.out.println() method.
else 

      System.out.println("Invalid E-mail Id");

If the input PAN number does not match the pattern, print a message saying that the input is an "invalid PAN number", using System.out.println() method and close if-else condition.
} else 

System.out.println(s+" is an invalid PAN number");


Sample Input/Output 1

Enter your name

Geetha

Enter your PAN number

SSTHP1234L

Enter your E-mail ID

geetha@digitec.com

Profile of Geetha updated successfully

 

Sample Input/Output 2

Enter your name

Pradeep

Enter your PAN number

QWER8456P

QWER8456P is an invalid PAN number

 

Sample Input/Output 3

Enter your name

Sara

Enter your PAN number

ABJKL1934F

Enter your E-mail ID

sara@digitec.com

Invalid E-mail ID */


import java.util.Scanner;

import java.util.regex.Pattern;

public class UserInterface 

{

    public static void main(String[] args)

    {

        Scanner sc=new Scanner(System.in);

        //Fill code here

        

        System.out.println("Enter your name");

        String name=sc.nextLine();

        

        System.out.println("Enter your PAN number");

        String pan=sc.next();

        

        String panPattern="[A-Z]{5}[0-9]{4}[A-Z]";

        

        if(Pattern.matches(panPattern,pan)){

            System.out.println("Enter your E-mail ID");

            String email=sc.next();

            

            String emailPattern="[a-z]{5,10}[@][a-z]{7}[.][a-z]{3}";

            

            if(Pattern.matches(emailPattern,email) && email.endsWith("@digitec.com")){

                System.out.println("Profile of "+ name + " updated successfully");

        }else {

            System.out.println("Invalid E-mail ID");

        }

        

    }else{

            System.out.println(pan+" is an invalid PAN number");

        }

    }

}