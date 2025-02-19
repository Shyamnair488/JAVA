/*Henry gave an assignment to his students. He gave a set of numbers to his students and the students have to find whether it's a prime number or not. If it is a prime number then the students have to add only the prime number to get that number as the result. Write a Java program to help the students to solve this problem

Requirements:

-        The array size should be between 1 to 5 (both inclusive), else print "<array size> is an invalid array size".

-        The number should be greater than 0 and less than 100 (both not inclusive), else print "<number> is an invalid input".

-        If there is no sum of prime numbers print "The <array size> numbers are not sum of prime numbers".

-        If there is more than one sum of prime number in the array then print that number also.

-        The prime number should be added in a consecutive manner


Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program. 



Sample Input/Output 1:

Enter the array size

4

Enter the numbers

12

17

5

7

The sum of prime numbers is

17

5

Explanation

12 is not a prime number

17 is a prime number so add a consecutive prime number

2+3+5+7 = 17

17 is the sum of prime number

5 is a prime number so add a consecutive prime number

2+3= 5

5 is the sum of prime number

7 is a prime number so add a consecutive prime number

2+3+5 = 10>7

7 is not sum of prime number

Ouputs are 17 ,5

 

Sample Input/Output 2:

Enter the array size

3

Enter the numbers

8

22

7

The 3 numbers are not sum of prime numbers

 

Sample Input/Output 3:

Enter the array size

-5

-5 is an invalid array size

 

Sample Input/Output 4:

Enter the array size

4

Enter the numbers

-6

-6 is an invalid input


*/


import java.util.Scanner;

public class UserInterface{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        

        System.out.println("Enter the array size");

        int size=sc.nextInt();

        

        if(size<1 || size>5){

            System.out.println(size +" is an invalid array size");

            return;

        }

        

        int[] numbers = new int[size];

        

        System.out.println("Enter the numbers");

        for(int i=0;i<size;i++){

            int num =sc.nextInt();

            if(num<=0||num>=100){

                System.out.println(num +" is an invalid input");

                return;

            }

            numbers[i]=num;

        }

            

        boolean foundprimesum = false;

            

        for(int i=0;i<size;i++){

            if(isPrime(numbers[i])){

                int sum=0;

                int j=i;

                while (j<size && isPrime(numbers[j])){

                    sum +=numbers[j];

                    

                    

                        

                    if(sum==numbers[i]){

                        System.out.println("The sum of prime numbers is");

                        for (int k=i;k<j;k++){

                            System.out.println(numbers[k]);

                        }

                        foundprimesum=true;

                        break;

                    }

                    j++;//abs

                }

            }

        }

        

        if(!foundprimesum){

            System.out.println("The "+size+" numbers are not sum of prime numbers");

        }

    }

        

    private static boolean isPrime(int num){

        if(num<=1){

            return false;

        }

            

        for (int i=2;i<=Math.sqrt(num);i++){

            if(num%i==0){

                return false;

            }

        }

        return true;

    }

}







