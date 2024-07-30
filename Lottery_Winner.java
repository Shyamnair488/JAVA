/*Pawan owns a lottery ticket. He can win the lottery only if the unlucky code is not present in the ticket id.  

Requirements:

Number of times of unlucky code in the ticket Id decide the winner.
If there is no unlucky code in the ticket Id, then print as "<<Ticket Id>> is lucky ticket".
If the count of the unlucky code is less than 3, then print as "<<Ticket Id>> is partially lucky".
If the count of the unlucky code is greater than or equal to 3, then print as "<<Ticket Id>> is unlucky ticket".
Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.


Sample Input/Output 1:

Enter the ticket Id

23453212

Enter the unlucky code

3

23453212 is partially lucky

 

Sample Input/Output 2:

Enter the ticket Id

13467542232

Enter the unlucky code

0

13467542232 is lucky ticket

 

Sample Input/Output 3:

Enter the ticket Id

122223222

Enter the unlucky code

2

122223222 is unlucky ticket */


import java.util.Scanner;

class loteryticket{

    private String ticketid;

    

    public loteryticket(String ticketid){

        this.ticketid=ticketid;

    }

    

    public void checkluckiness(int unluckycode){

        int countunlucky = 0;

        for (char digit : ticketid.toCharArray()){

            

            if(Character.getNumericValue(digit)==unluckycode){

                countunlucky++;

            }

        }

        

        if (countunlucky==0){

            System.out.println(ticketid+" is lucky ticket");

        }

        else if(countunlucky<3){

            System.out.println(ticketid+" is partially lucky");

        }else {

            System.out.println(ticketid+" is unlucky ticket");

        }
    }

    

}

public class UserInterface 

{

    public static void main(String[] args)

    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the ticket Id");

        String ticketid=sc.nextLine();

        

        System.out.println("Enter the unlucky code");

        int unluckycode=sc.nextInt();

        

        loteryticket ticket = new loteryticket(ticketid);

        ticket.checkluckiness(unluckycode);

        sc.close();

    }

}