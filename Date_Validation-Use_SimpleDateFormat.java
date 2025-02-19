/*John is a calendar designer. He is not sure of how many days each month has in a year. Help him as a Java Programmer, to check whether the date he enters is valid or not valid.

Assumptions

Get a date as String from user. 
Check if that date is a valid date using SimpleDateFormat.
Date entered by the user is in the format dd/MM/yyyy
Check if the given date exists or not

If the given date is valid then display "<Date> is a valid date". Else display "<Date> is not a valid date".
Note: 

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output. 

 Ensure to follow the object-oriented specifications provided in the question description. 

 Ensure to provide the names for classes, attributes, and methods as specified in the question description. 

 Adhere to the code template, if provided. 

 Please do not use System.exit(0) to terminate the program 


Sample Input 1

Enter the date

31/08/2020

Sample Output 1

31/08/2020 is a valid date



Sample Input 2

Enter the date

31/11/2020

Sample Output 2

31/11/2020 is not a valid date


Sample Input 3

Enter the date

30092022

Sample Output 3

30092022 is not a valid date */



import java.util.Scanner;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.text.ParseException;

public class UserInterface {

    

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        

        System.out.println("Enter the date");

        String dateInput=sc.nextLine();

        

        boolean isValid=isValidDate(dateInput);

        

        if(isValid){

            System.out.println(dateInput+" is a valid date");

        }else {

            System.out.println(dateInput +" is not a valid date");

        }

        sc.close();

        //FILL THE CODE

    

    }

    

    private static boolean isValidDate(String dateInput){

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        dateFormat.setLenient(false);

        

        try{

            Date date=dateFormat.parse(dateInput);

            

            return dateFormat.format(date).equals(dateInput);

        }catch(ParseException e){

            return false;

        }

    }

}