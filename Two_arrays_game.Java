/*Ravi's teacher gives him an assignment on the topic array. He has two arrays as input and in that he has to add the zero or even index integers of both arrays and subtract the odd index integers of both arrays to create the third array. Help Ravi complete his assignment using Java.

Requirements:

If both the array sizes are not the same, print "Both array sizes are not the same".
If the size is less than or equal to zero, print "<Array size> is an invalid array size"

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided
Please do not use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter the size for the first array

4

Enter the elements for the first array

3

8

5

3

Enter the size for the second array

4

Enter the elements for the second array

0

2

4

6

The elements of the third array

3

6

9

-3



Explanation:

Array1 = {3,8,5,3}

Array2 = {0,2,4,6}

if the integer is zero or even index, add the integers in the two arrays -> Array1[0] + Array2[0] = Array3[0]

3 + 0 = 3

If the integer is odd index subtract the integers in the two arrays -> Array1[1] - Array2[1] = Array3[1]

8 - 2 = 6

Array3 = {3.6,9,-3}



Sample Input/Output 2:

Enter the size for the first array

3

Enter the elements for the first array

8

7

1

Enter the size for the second array

2

Enter the elements for the second array

5

6

Both array sizes are not the same



Sample Input/Output 3:

Enter the size for the first array

2

Enter the elements for the first array

7

2

Enter the size for the second array

-5

-5 is an invalid array size

 */

 import java.util.Scanner;

 public class UserInterface{
 
     
 
     public static void main(String[] args){
 
         
 
        Scanner sc=new Scanner(System.in);
 
        
 
         System.out.println("Enter the size for the first array ");
 
         int size1=sc.nextInt();
 
         if(size1<=0){
 
             System.out.println(size1+" is an invalid array size ");
 
             return;
 
         }
 
         
 
         int[] array1 = new int[size1];
 
         System.out.println("Enter the elements for the first array ");
 
         for (int i=0;i<size1;i++)
 
         {
 
             array1[i]=sc.nextInt();
 
         }
 
         
 
         
 
         System.out.println("Enter the size for second array ");
 
         int size2=sc.nextInt();
 
         if(size2<=0){
 
             System.out.println(size2+" is an invalid array size ");
 
             return;
 
             
 
         }
 
         
 
         int[] array2=new int[size2];
 
         System.out.println("Enter the elements for the second array ");
 
         for (int i=0;i<size2;i++){
 
             array2[i]=sc.nextInt();
 
         }
 
         
 
         if(size1!=size2){
 
             System.out.println("Both array sizes are not the same ");
 
             return;
 
         }
 
         
 
         
 
         int[] array3 =new int[size1];
 
         for (int i=0;i<size1;i++){
 
             if(i%2==0){
 
                 array3[i]=array1[i]+array2[i];
 
             }else{
 
                 array3[i]=array1[i]-array2[i];
 
             }
 
         }
 
         
 
         System.out.println("The elements of the third array ");
 
         for(int i=0;i<size1;i++){
 
             System.out.println(array3[i]);
 
         }
 
         
 
     }
 
 }
 
 
 
 
 
 
 
  