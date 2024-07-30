/*Rahul is a 15 years old boy. He bought  a new laptop.  He likes to  password protect his laptop,  So help Rahul to generate a password for his laptop and validate the password by writing a Java program.

Requirements:

Hint to generate a password:

Minimum of 6 characters and a maximum of 12 characters (characters include alphabets, numbers and special characters).
The password should contain atleast one uppercase, one lowercase,  and one special character
Only these special characters @,$,*,# are allowed
keeping numbers in the password is optional.
If the password fails the above condition, print "<password> is an invalid password" and terminate the program
Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program

Sample Input/Output 1

Generate your password

#001Lord

The generated password #001Lord is valid and has 3 lowercase alphabet 1 uppercase alphabet 1 special character 3 digit



Sample Input/Output 2

Generate your password

LIVE@123

LIVE@123 is an invalid password



Jump to... */

import java.util.Scanner;

public class UserInterface

{

    public static void main(String[] args)

    {

        Scanner sc=new Scanner(System.in);

        //Fill code here 

        System.out.println("Generate your password");

        String passward =sc.nextLine();

        

        if(isValidPassward(passward)){

            int LowerCaseCount=countLowerCase(passward);

            int UpperCaseCount=countUpperCase(passward);

            int specialCharCount=countSpecialCharachter(passward);

            int digitCount=countDigit(passward);

            System.out.println("The generated password "+ passward + " is valid and has "+ LowerCaseCount + " lowercase alphabet "+ UpperCaseCount + " uppercase alphabet " + specialCharCount + " special character "+ digitCount + " digit");

        }

        else{

            System.out.println(passward+" is an invalid password");

        }

    }

    

    private static boolean isValidPassward(String passward){

        

        if(passward.length()<6 || passward.length()>12){

            return false;

        } 

        

        boolean hasUpperCase=false;

        boolean hasLowerCase=false;

        boolean hasSpecialChar=false;

        boolean hasDigit=false;

        

        for(char ch: passward.toCharArray()){

            if(Character.isUpperCase(ch)){

                hasUpperCase=true;

                

            }else if(Character.isLowerCase(ch)){

                hasLowerCase=true;

            }else if (isSpecialCharachter(ch)){

                hasSpecialChar=true;

            }else if (Character.isDigit(ch)){

                hasDigit= true;

            }

        }

        return hasUpperCase && hasLowerCase && hasSpecialChar &&(hasDigit || passward.contains("#"));

        

    }

    

    private static boolean isSpecialCharachter(char ch){

        return ch=='@' || ch=='$' ||ch=='*' ||ch=='#';

    }

    

    private static int countLowerCase(String passward){

        int count=0;

        for(char ch : passward.toCharArray()){

            if (Character.isLowerCase(ch)){

                count++;

            }

        }

        return count;

    }

    private static int countUpperCase(String passward){

        int count =0;

        for(char ch : passward.toCharArray()){

            if(Character.isUpperCase(ch)){

                count++;

            }

        }

        return count;

    }

    private static int countSpecialCharachter(String passward){

        int count=0;

        for(char ch : passward.toCharArray()){

            if(isSpecialCharachter(ch)){

                count++;

            }

        }

        return count;

    }

    

    private static int countDigit(String passward){

        int count=0;

        for(char ch: passward.toCharArray()){

            if(Character.isDigit(ch)){

                count++;

            }

        }
        return count;
    }

}