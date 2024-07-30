/*Peter wants to order medicine for his grandmother, he gets the medicine and checks for the expiry of the medicine.

Requirements

Get the date of manufacturing (as String) as input from the user. 
Also get the number of months of validity of that product
Calculate the expiry date by adding that months to the date of manufacturing and display the result.
Assume only valid month is entered. 
Note: 

If the input date is invalid, then print "<date> is not a valid date" and terminate the program.
In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output. 
Ensure to follow the object-oriented specifications provided in the question description. 
Ensure to provide the names for classes, attributes, and methods as specified in the question description. 
Adhere to the code template, if provided. 
Please do not use System.exit(0) to terminate the program.
Hint:

1. Parse the input string to Date (say Date d) using SimpleDateFormat

2. Use Calendar to add months

        Calendar c = Calendar.getInstannce();  //Get Instance

        c.setTime(dd1);                                        // Set date to Calendar

        c.add(Calendar.MONTH, month);          //add month value to the Calendar

3. Convert Calendar to Date using getTime               

         Date dd=c.getTime();

4. Use the same SimpleDateFormat and convert date to String of the format dd/MM/yyyy using the format method.                    

Sample Input 1

Enter the Manufacturing Date

15/12/2020

Enter the Month

6

Sample Output 1

15/06/2021 is the expiry date


Sample Input 2

Enter the Manufacturing Date

15/15/2020

Sample Output 2

15/15/2021 is not a valid date */



import java.util.Scanner;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;

import java.text.ParseException;

public class UserInterface {

    

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        

        System.out.println("Enter the Manufacturing Date");

        String manufacturingDateStr=sc.nextLine();

        

        Date manufacturingDate=parseDate(manufacturingDateStr);

        if(manufacturingDate==null){

            System.out.println(manufacturingDateStr+" is not a valid date");

            return;

        }

        

        System.out.println("Enter the Month");

        int month=sc.nextInt();

        

        Calendar calendar=Calendar.getInstance();

        calendar.setTime(manufacturingDate);

        calendar.add(Calendar.MONTH,month);

        Date expiryDate=calendar.getTime(); 

        

        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");

        String formattedExpiryDate=dateFormat.format(expiryDate);

        System.out.println(formattedExpiryDate+" is the expiry date");

    }

            

        private static Date parseDate(String dateInput){

            try {

                SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");

                dateFormat.setLenient(false);

                return dateFormat.parse(dateInput);

                

            } catch(Exception e) {

                return null;

            

            }

        }

    

}