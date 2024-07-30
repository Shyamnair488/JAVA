/*Analyze the code for compile time errors. You are provided with the code skeleton having the full solution with compile time errors. Fix the compile time error in the code.

Write a Java program to read an array of integer elements. The program should find the difference between the alternate numbers in the array and find the index position of the smallest element with the largest difference. If more than one pair has the same largest difference, consider the first occurrence.

Note: When taking the difference, take the absolute value, i.e. neglecting the sign.

Example: If it is 3 - 10= -7, consider it as 7.

If the array size is less than 3, Display "Invalid array size".

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.


Sample Input/Output 1:

Enter the size of the array

6

Enter the inputs

4

3

2

10

8

6

1

Explanation :

Here alternate number difference means
4-2, 3-10, 2-8, 10-6
Neglect the sign So diff is 2,7,6,4
Largest diff is 7 -------> 3-10, here the smallest number is 3 and its index is 1. Hence the output is 1.


Sample Input/Output 2:

Enter the size of the array

7

Enter the inputs

7

6

2

2

3

1

8

2



Sample Input/Output 3:

-1

Invalid array size */


import java.util.Scanner;

public class UserInterface{

    public static void main (String[] args) {

        Scanner sc=new Scanner(System.in);

        

        System.out.println("Enter the size of the array");

        int size = sc.nextInt();

        

        if(size <=3){

            System.out.println("Invalid array size");

            return;

        }

        

            

        System.out.println("Enter the inputs");

            

        int[]  array = new int[size];

        for(int i=0;i<size;i++){

            array[i]=sc.nextInt();

        }

        

        

        int maxDiffIndex=0; //-1

        int maxDiff=Integer.MIN_VALUE;

        

        for(int i=0;i<size-1;i=i+2){

            int diff=Math.abs(array[i]- array[i+1]);

            if(diff>maxDiff){

                maxDiff=diff;

                maxDiffIndex=i;

            }

        }

        

        

        int smallestNumberIndex=maxDiffIndex;

        for(int i=maxDiffIndex;i<=maxDiffIndex+1 && i<size;i++){

            if(array[i]<array[smallestNumberIndex]){

                smallestNumberIndex=i;

        }

        }

        

        System.out.println(smallestNumberIndex);

        

    }

}