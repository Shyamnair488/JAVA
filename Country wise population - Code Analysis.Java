/*Analyze the code for compile time errors. You are provided with the code skeleton having the full solution with compile time errors. Fix the compile time error in the code.

Display the population of each country along with the country name, from the least to the highest.

Input Format: The first input refers to the number of countries, the second one is an array to get the country names, and the third one is an array to get the population of each country (the population is given in crores).

Assumption: No two countries will have the same population.

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.


Sample Input/Output 1:

Enter the total number of countries that need to be added to the array

5

Enter the names of the countries 

India

China

Japan

Australia

America

Enter the population of each country in the same array-order as the country names

135

133

12

2

32

Australia-2

Japan-12

America-32

China-133

India-135 */


import java.util.*;

class UserInterface {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

               

        System.out.println("Enter the total number of countries that need to be added to the array");

        int totalCountries=sc.nextInt();

        

        sc.nextLine();

        

        String[] countries=new String[totalCountries];

        

        int[] populations=new int[totalCountries];

        

        System.out.println("Enter the names of the countries");

        for(int i=0;i<totalCountries;i++){

            countries[i]=sc.nextLine();

        }

        System.out.println("Enter the population of each country in the same array-order as the country names");

        for (int i=0;i<totalCountries;i++){

            populations[i]=sc.nextInt();

        }

        sortAndDisplay(countries,populations);

    }

    

    private static void sortAndDisplay(String[] countries,int[] populations){

        TreeMap<Integer,String> sortMap=new TreeMap<>();

        for (int i=0;i<countries.length;i++){

            sortMap.put(populations[i],countries[i]);

        }

        

        for(Map.Entry<Integer,String> entry : sortMap.entrySet()){

            System.out.println(entry.getValue() + "-" + entry.getKey());

        }

    }

}