/*Happy Mart is a supermarket with wide range of products. The manager wants to add the products and sort them based on id and price. As a java developer, create a java application to sort the products based on id and price.

Component Specification: Product

Type (Class)

Attributes

Methods

Product

int productid

String productName

double price

Include a public parametrized constructor of three  arguments in the following order - productId, productName and price to intialize the values for the Product object. 

Note: The class and constructor and all the attributes should be declared as public. 


Component Name

Type (Class)

Methods

Responsibilities

Override the toString method

Product

Public String toString()

This method should return String by overriding the productid, productName and price with space.


Component Specification: SortById

Type (Class)

Methods

Responsibilities

SortById

public int compare(Product a, Product b)

This method should return the difference between productId of the object a and object b

Note: This class implements the comparator interface of type Product.

Component Specification: SortByPrice

Type (Class)

Methods

Responsibilities

SortByPrice

public int compare(Product a, Product b)

This method should return the difference between price of the object a and object b

Note: This class implements the comparator interface of type Product.

In the UserInterface class,

-       Get the products count from user. If the count is negative or zero, display "Invalid count".

-       Get the product details as shown in the sample input.

-       Create an object for each product and assign the values through 3 argument constructor.

-       Get the choice from user as given in the sample input.

-       Based on the choice entered, the corresponding comparator is invoked in sort method and the output is displayed as given in sample output.

-       If the choice is other than 1 or 2, display "Invalid choice".

 

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output. 
Ensure to follow the object-oriented specifications provided in the question. 
Ensure to provide the names for classes, attributes, and methods as specified in the question. 
Adhere to the code template, if provided. 
Please don't use System.exit(0) to terminate the program. 
 

Sample Input/Output 1:

Enter the products count

3

Enter Product details

1006:Pen:50

1009:Eraser:40

1004:Ruler:40

1.Sort By Id

2.Sort By Price

Enter your choice

1

After Sorting By Id

1004 Ruler 40.0

1006 Pen 50.0

1009 Eraser 40.0

 

Sample Input/Output 2:

Enter the products count

4

Enter Product details

2503:Onion:80

2508:Tomato:50

2501:Carrot:140

2506:Potato:120

1.Sort By Id

2.Sort By Price

Enter your choice

2

After Sorting By Price

2508 Tomato 50.0

2503 Onion 80.0

2506 Potato 120.0

2501 Carrot 140.0

 

Sample Input/Output 3:

Enter the products count

2

Enter Product details

4002:Bread:240

4006:Biscuit:160

1.Sort By Id

2.Sort By Price

Enter your choice

5

Invalid choice

 

Sample Input/Output 4:

Enter the products count

-5

Invalid count */


public class Product {

    public int productId;

    public String productName;

    public double price;

    

    //Include three argument constructor to initialize values

    public Product(int productId,String productName,double price){

        this.productId=productId;

        this.productName=productName;

        this.price=price;

    }

    

    //This method should return the productId, productName and price seperated by whitespace

    public String toString()

        {

            return productId+" "+productName+" "+price ;

        }

    

}