/*Sara gave an assignment to her students. She gave a set of numbers to her students, and the students have to add the first maximum number and the first minimum number, and then the second maximum number and the second minimum number, up to the nth number. From that number, the students have to print the maximum number. Write a Java programme to help the students solve this problem.

Requirements:

The size of the array should be greater than 1 and the size should be an even number, else print "<size> is an odd number.Please enter even number".
If the array size is less than or equal to zero, print "<size> is an invalid array size".
If the size of the array is even number then print, "The maximum number is <MaxNum>".
Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided
Please do not use System.exit(0) to terminate the program.


Hi, I'm "Friendly Hendy" and I can help you write the solution for this description. 

You are provided with a UserInterface class with the main method. 
Create a new Scanner object called "sc" that reads input from the standard input stream (System.in)
Scanner sc=new Scanner(System.in);

Print the message "Enter the array size" using System.out.println() method.
System.out.println("Enter the array size");

Use the nextInt() method of the Scanner object to read a integer value from the user and store it in a variable called "array".
int array=sc.nextInt();

Use an if-else statement to check if the value of "array" is less than or equal to 1. If it is, print the message "is an invalid array size" using System.out.println() method.
if(array<=1) {

      System.out.println(array+" is an invalid array size");

}

If the value of "array" is not less than or equal to 1, use another if-else statement to check if the value of "array" is odd. If it is, print the message array followed by "is an odd number.Please enter even number" using System.out.println() method.
else if(array%2!=0 && array!=0) {

      System.out.println(array+" is an odd number.Please enter even number");

}

If the value of "array" is even, create an integer array called "a" with the size of "array".
else {

int[] a=new int[array];

Print the message "Enter the number" using System.out.println() method.
System.out.println("Enter the number");

Use a for loop to take input for the elements of the array "a", and also use the nextInt() method of the Scanner object to read a integer value from the user.
for(int i=0;i<array;i++) {

         a[i]=sc.nextInt();

}

Create a variable called "size" of integer data type and assign it the length of the array "a".
int size = a.length;

Use the sort method of the Arrays class to sort the elements of the array "a".
Arrays.sort(a);

Create two integer arrays called "max" and "min" with the size of "size".
int[] max=new int[size];

int[] min=new int[size];

Use a for loop to assign the highest values of the array "a" to the array "max".
for(int i=0;i<size;i++) { 

      max[i] = a[(size-1)-i];

}

Use a for loop to assign the lowest values of the array "a" to the array "min".
for(int i=size-1;i>=0 ;i--) {

min[i] = a[(size-1)-i];

}

Create an integer array called "ans" with the size of "size".
int ans[]=new int[size];

Create an integer array called "t" with the size of "size".
int t[]=new int[size];

Use a for loop to add the highest and lowest values of the array "a" and store them in the array "ans".
for(int k=0;k<size/2;k++) {

ans[k]=max[k]+min[(size-1)-k];

}

Use a for loop to reverse the values of the array "ans" and store them in the array "t".
for(int i=0;i<size;i++) { 

        t[i] = ans[(size-1)-i];

}

Print the message "The maximum number is " followed by the last element of the array "t" using System.out.println() method.
System.out.println("The maximum number is "+t[size-1]);

Close the if-else statement.
}


Sample Input/Output 1:

Enter the array size

6

Enter the number

23

48

15

68

90

10

The maximum number is 100

Explanation:

1st maximum number = 90

1st minimum number = 10

Sum of 1st max and min = 100

2nd maximum number = 68

2nd minimum number = 15

Sum of 2nd max and min = 83

3rd maximum number = 48

3rd minimum number = 23

Sum of 3rd max and min = 71

Output will be "The maximum number is 100"

 

Sample Input/Output 2:

Enter the array size

5

5 is an odd number.Please enter even number

 

Sample Input/Output 3:

Enter the array size

-9

-9 is an invalid array size

  */


  import java.util.Scanner;

  import java.util.Arrays;
  
  class numberarrayprocessor{
  
      public void processarray(int[] a){
  
          int size =a.length;
  
          Arrays.sort(a);
  
          
  
          int[] max = new int[size];
  
          int[] min = new int[size];
  
          
  
          for (int i=0;i<size;i++){
  
              max[i]=a[(size-1)-i];
  
          }
  
          
  
          for (int i=size-1;i>=0;i--){
  
              min[i]=a[(size-1)-i];
  
          }
  
          
  
          int[] ans = new int[size];
  
          int[] t = new int[size];
  
          
  
          for(int k=0;k<size/2;k++){
  
              ans[k]=max[k]+min[(size-1)-k];
  
          }
  
          
  
          for (int i=0;i<size;i++){
  
              t[i]=ans[(size-1)-i];
  
          }
  
          System.out.println("The maximum number is "+t[size-1]);
  
      }
  
  }
  
  public class UserInterface{
  
      
  
      public static void main(String[] args){
  
          
  
         Scanner sc=new Scanner(System.in);
  
         
  
          System.out.println("Enter the array size");
  
          int array = sc.nextInt();
  
          
  
          if (array<=0 ){
  
              System.out.println(array+" is an invalid array size");
  
              
  
          }else if (array%2!=0){
  
              System.out.println(array+" is an odd number.Please enter even number.");
  
          }else {
  
              System.out.println("Enter the numbers");
  
              int[] numbers= new int[array];
  
              for(int i=0;i<array;i++){
  
                  numbers[i]=sc.nextInt();
  
              }
  
              numberarrayprocessor processor =new numberarrayprocessor();
  
              processor.processarray(numbers);
  
          }
  
          sc.close();
  
          
  
      }
  
  }