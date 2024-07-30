/*John gave an assignment to his students. He gave his students two sets of numbers; the students have to find if all the numbers in the second set are present in the first or not. Write a Java program to help the students find whether the second set of numbers is a subset of the first set of numbers or not

Requirements:

The size of both arrays should be greater than zero; otherwise print "<array size> is an invalid array size"
The length of the second array should be less than or equal to the first array; otherwise print "<size2> is an invalid size as it is greater than first array size <size1>".
If all the elements of array2 are present in array1, then print "Array2 of size <size2> is a subset of array1"; otherwise print "Array2 of size <size2> is not a subset of array1".
Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided
Please do not use System.exit(0) to terminate the program.

 

Sample Input/Output 1:

Enter the first array size

5

Enter the numbers

16

8

2

25

6

Enter the second array size

3

Enter the numbers

8

25

2

Array2 of size 3 is a subset of array1

 

Sample Input/Output 2:

Enter the first array size

3

Enter the numbers

58

31

20

Enter the second array size

1

Enter the numbers

25

Array2 of size 1 is not a subset of array1

 

Sample Input/Output 3:

Enter the first array size

2

Enter the numbers

8

19

Enter the second array size

3

3 is an invalid size as it is greater than first array size 2 

 

Sample Input/Output 4:

Enter the first array size

-3

-3 is an invalid array size

 


Sample Input/Output 5:

Enter the first array size

3

Enter the numbers

45

12

90

Enter the second array size

-5

-3 is an invalid array size
*/

import java.util.Scanner;

import java.util.Arrays;

class subsetchecker{

    

    public void checksubset(int[] array1,int[] array2){

        if (array1.length<=0 || array2.length<=0){

            System.out.println("Invalid array size");

            return;

        }

        

        if(array2.length>array1.length){

            System.out.println("Invalid size as it is greater than first array size "+ array1.length);

            return;

        }

        

        Arrays.sort(array1);

        Arrays.sort(array2);

        

        int i=0,j=0;

        boolean isSubset=false;

        

        while(i<array1.length && j<array2.length){

            if(array1[i]<array2[j]){

                i++;

            }else if (array1[i]==array2[j]){

                i++;

                j++;

            }else {

                break;

            }

        }

    

        if (j==array2.length){

            isSubset=true;

        }

        

        if(isSubset){

            System.out.println("Array2 of size "+array2.length+" is a subset of array1");

            

        }

        

        else {

            System.out.println("Array2 of size "+ array2.length+" is not a subset of array1");

            

        }

    }

}

public class UserInterface

{

    

    public static void main(String[] args){

        

       Scanner scanner=new Scanner(System.in);

       

       System.out.println("Enter the first array size");

       int size1=scanner.nextInt();

       

       if(size1<=0){

           System.out.println(size1+ "is an invalid array size");

           return;

       }

       

       int[] array = new int[size1];

       System.out.println("Enter the numbers");

       

       for(int i = 0;i<size1;i++){

           array1[i]=scanner.nextInt();

       }

       

       

       System.out.println("Enter the second array size");

       int size2=scanner.nextInt();

       

       if(size2<=0){

           System.out.println(size2+" is an invalid array size");

           return;

       }

       int[] array2 = new int[size2];

       System.out.println("Enter the numbers");

       for (int i=0;i<size2;i++){

           array2[i]=scanner.nextInt();

           

       }

       

       subsetchecker checker = new subsetchecker();

       checker.subsetchecker(array1,array2);

       scanner.close();

        

    }

}