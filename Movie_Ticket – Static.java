/*Shakthi cinemas have decided to automate their bookings. As an initiative, the manager outlined to development of software that would generate the booking details.

You being their software consultant have been approached to develop software to implement the functionality of calculating the ticket cost and displaying the booking details.

Component Specification: Ticket

Type(Class)

Attributes

Methods

Ticket

int ticketid

int price

static int availableTickets

Include the getters and setters method for all the attributes.


Note: The class and methods should be declared as public and all the attributes should be declared as private.

Requirement 1: Being able to calculate the ticket cost based on the number of tickets

As per this requirement, the system should be able to calculate the ticket cost based on the number of tickets as follows,

Component Specification: Ticket

Component Name

Type(Class)

Methods

Responsibilities

Calculate the ticket cost based on the number of tickets

Ticket

public int calculateTicketCost(int nooftickets)

This method should calculate the ticket cost based on the number of tickets as follows,

If the availableTickets is greater than or equal to the number of  tickets, then calculate and return the ticket cost

If the availableTickets is less than 0 or less than the number of tickets, then return -1




Example

noOfTickets = 5, price = 100

totalAmount = noOfTickets * price = 5 *100

totalAmount = 500

In the UserInterface class, Get the booking details as shown in the sample input.

Create an object for the Ticket class and invoke the calculateTicketCost() by passing the int numberOfTickets method in the Ticket class.

Invoke the corresponding getters to display the member details as shown in the Sample Output

If numberOfTickets is greater than availableTickets then print "Tickets are not available"

If availableTickets is zero then print "House full"

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question.
Ensure to provide the names for classes, attributes, and methods as specified in the question.
Adhere to the code template, if provided.
Do not use System.exit(0) to terminate the program

Sample Input/Output 1:

Enter movie name

Friends

Enter no of bookings

2

Enter the available tickets

50

Enter the ticketid

101

Enter the price

200

Enter the no of tickets

6

Available tickets: 50

Total amount: 1200

Available ticket after booking: 44

Enter the ticketid

102

Enter the price

100

Enter the no of tickets

5

Available tickets: 44

Total amount: 500

Available ticket after booking: 39



Sample Input/Output 2:

Enter movie name

Captain

Enter no of bookings

3

Enter the available tickets

30

Enter the ticketid

101

Enter the price

100

Enter the no of tickets

20

Available tickets: 30

Total amount: 2000

Available ticket after booking: 10

Enter the ticketid

102

Enter the price

200

Enter the no of tickets

11

Available tickets: 10

Tickets are not available

Enter the ticketid

103

Enter the price

200

Enter the no of tickets

8

Available tickets: 10

Total amount: 1600

Available ticket after booking: 2

 

 

Sample Input/Output 3:

Enter movie name

Titanic

Enter no of bookings

2

Enter the available tickets

10

Enter the ticketid

101

Enter the price

250

Enter the no of tickets

10

Available tickets: 10

Total amount: 2500

House full */




public class Ticket

{

    class ticket{

        private int ticketid;

        private int price;

        private static int aviliabletickets;

        

        public int getTicketid(){

            return ticketid;

        }

        

        public void setTicketid(int ticketid){

            this.ticketid=ticketid;

        }

        

        public int getPrice(){

            return price;

        }

        

        public void setPrice(){

            this.price=price;

        }

        

        public static int getAviliabletickets(){

            return aviliabletickets;

        }

        

        public static void setAviliableTickets(int aviliabletickets){

            Ticket.aviliabletickets = aviliabletickets;

        }

        

        public int calculateTicketCost(int nooftickets){

            if(aviliabletickets>=nooftickets && aviliabletickets>0){

                int totalamount =nooftickets*price;

                aviliabletickets -=nooftickets;

                return totalamount;

            }else if (aviliabletickets==0){

                System.out.println("House full");

                return -1;

            }else{

                System.out.println("Ticket are not aviliable");

                return -1;

            }

        }

    }

}


import java.util.Scanner;

public class UserInterface {

    

    public static void main(String[] arg)

    {

        Scanner sc=new Scanner(System.in);

        Ticket ticket=new Ticket();

        

        System.out.println("Enter movie name");

        String moviename=sc.nextLine();

        

        System.out.println("Enter no of bookings");

        int bookings=sc.nextInt();

        

        System.out.println("Enter the aviliable tickets");

        int aviliabletickets=sc.nextInt();

        Ticket.setAviliabletickets(aviliabletickets);

        

        for(int i=0;i<bookings;i++){

            System.out.println("Enter the ticketid");

            int ticketid=sc.nextInt();

            ticket.setTicketid(ticketid);

            

            System.out.println("Enter the price");

            int price=sc.nextInt();

            ticket.setPrice(price);

            

            System.out.println("Enter the no of tickets");

            int nooftickets=sc.nextInt();

            

            System.out.println("Aviliable tickets: "+ Ticket.getAviliableTickets());

            

            int totalamount = ticket.calculateTiceketCost(nooftickets);

            if(totalamount!=-1){

                System.out.println("Total amount: "+totalamount);

                System.out.println("Aviliable tickets after booking: "+Ticket.getAviliableTickets());

            }

        }

        

        sc.close();

    }

}