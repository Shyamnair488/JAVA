/*Analyze the code for compile time errors. You are provided with the code skeleton having the full solution with compile time errors. Fix the compile time error in the code.

Dream Tek Company provides a rating to its employees based on the "certification" they have completed. For each certification completed by the employee, the rating will be increased by one. Based on the rating, the company planned to provide an increment for the employees. For the current year, the employees can take any of the certification courses. 

They are:

a.       JAVA

b.      ORACLE

c.       GCUX

d.      CCNA

e.      AWS

For each certification the rating will be 1. If an employee has completed three certifications, their rating will be 3. The employee is supposed to take up the certification suggested by the company. If the employee takes up some other certification, their rating will not be updated for that certification.

The increment for the employees will be given based on the criteria below:

Rating

Increment Percentage

1

2%

2

3.5%

3

5%

4

7.5%

5

10%

 

Help the Dream Tek Company to develop a java application to do the above task.

Consider the below class:

In the Employee class include the given attributes methods and constructor with the access specifiers as specified in the class diagram.

The constructors are used to initialize the value and the getter methods are used to retrieve the value.

The findRating() method should set the rating based on the certification completed by the employee.

The calculateIncrement() method should calculate the increment based on the rating and update the salary with the incremented amount. This method should return the increment amount. (For example: if the salary is 50000, and the incremented amount is 4000, then this method should return 4000, and update the salary as 54000).

In the UserInterface class, Get the details as shown in the sample input and create an object for the Employee class; invoke the appropriate methods to get the results as shown in the sample output.

Note:

You are given logic with a compilation error. Clear all the compilation errors and make it an error-free code.
 In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.
 

 

Sample Input1:

Enter the employee id:

TEK163

Enter the salary:

50000

Enter the no of certification complete:

3

Enter the certification names:

JAVA

ORACLE

CCNA

Sample Output1:

Your rating is 3

Increment amount is 2500.00

Current salary 52500.00

 

Sample Input2:

Enter the employee id:

TEK163

Enter the salary:

50000

Enter the no of certification complete:

3

Enter the certification names:

JAVA

J2EE

CCNA

Sample Output2:

Your rating is 2

Increment amount is 1750.00

Current salary 51750.00

 

Sample Input3:

Enter the employee id:

TEK163

Enter the salary:

50000

Enter the no of certification complete:

3

Enter the certification names:

PHP

J2EE

MYSQL

Sample Output3:

Your rating is 0

Increment amount is 0.00

Current salary 50000.00 */


import java.util.*;

public class Employee{

    

    private String employeeId;

    private double salary;

    private String[] certification;

    private int rating;

    

    public Employee(String employeeId,double salary,String[] certification) {

        this.employeeId=employeeId;

        this.salary=salary;

        this.certification=certification;

    }  

    

    public void findRating(){

        for(int i=0;i<certification.length;i++){

            if(certification[i].contains("JAVA") || certification[i].contains("ORACLE") ||

            certification[i].contains("GCUX") || certification[i].contains("CCNA")||

            certification[i].contains("AWS"))

                  

                   rating++;

        }

    }

    

    public double calculateIncrement(){

    

        double increment=0;

        if(rating==1)

            increment=(0.02*salary);

        else if(rating==2)

            increment=(0.035*salary);

        else if(rating==3)

            increment=(0.05*salary);

        else if(rating==4)

            increment=(0.075*salary);

        else if(rating==5)

            increment=(0.1*salary);

            

        salary=salary+increment;

        

        return increment;

    }

    

    public double getSalary(){

        return salary;

    }

    public int getRating(){

        return rating;

    }

}



import java.util.*;

public class UserInterface{

    public static void main (String[] args) {

        Scanner s=new Scanner(System.in);

        

        System.out.println("Enter the employee id:");

        String id=s.nextLine();

        

        System.out.println("Enter the salary:");

        double sal=s.nextDouble();

        

        System.out.println("Enter the no of certification complete:");

        int n=s.nextInt();

        

        System.out.println("Enter the certification names:");

        String[] st=new String[n];

        

        for(int i=0;i<n;i++){

            st[i]=s.next();

        }

        

        Employee e=new Employee(id,sal,st);

        

        e.findRating();

        System.out.println("Your rating is "+e.getRating());

        System.out.print("Increment amount is ");

        System.out.format("%.2f",e.calculateIncrement());

        System.out.println();

        System.out.print("Current salary ");

        System.out.format("%.2f",e.getSalary());

    }

}