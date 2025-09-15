// Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
// Hint => 
// The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same. 
// Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
//Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical 
// import java.util.Scanner;

// public class cf{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a year (1582 or later): ");
//         int year = sc.nextInt();

        
//         if (year >= 1582) {
           
//             if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//                 System.out.println(" " + year + " is a Leap Year.");
//             } else {
//                 System.out.println(" " + year + " is not a Leap Year.");
//             }
//         } else {
//             System.out.println(" Leap Year check is only valid for years from 1582 onwards.");
//         }
//     }
// }



//Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
// import java.util.Scanner;

// public class cf{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a year (1582 or later): ");
//         int year = sc.nextInt();

        
//         if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
//             System.out.println(" " + year + " is a Leap Year.");
//         } else {
//             System.out.println(" " + year + " is not a Leap Year.");
//         }
//     }
// }



// Write a Program to check if the given number is a prime number or not
// Hint => 
// A number that can be divided exactly only by itself and 1 are Prime Numbers,
// Prime Numbers checks are done for numbers greater than 1
// Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
// Use the isPrime boolean variable to store the result
// import java.util.*;

// public class cf{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a number to check if it's prime: ");
//         int number = sc.nextInt();

        
//         boolean isPrime = true;

//         if (number <= 1) {
//             isPrime = false;
//         } else {
           
//             for (int i = 2; i < number; i++) {
//                 if (number % i == 0) {
//                     isPrime = false;
//                     break; 
//                 }
//             }
//         }

//         
//         if (isPrime) {
//             System.out.println(" " + number + " is a Prime Number.");
//         } else {
//             System.out.println(" " + number + " is not a Prime Number.");
//         }
//     }
// }


/*Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
Hint => 
Armstrong Number is a number whose Sum of cubes of each digit results in the original number as in for e.g. 153 = 1^3 + 5^3 + 3^3
Get an integer input and store it in the number variable and define sum variable, initialize it to zero and originalNumber variable and assign it to input number variable
Use the while loop till the originalNumber is not equal to zero
In the while loop find each digit which is the reminder of the modulus operation number % 10. Find the cube of the number and add it to the sum variable
Again in while loop find the quotient of the number using the division operation number/10 and assign it to the original number. This removes the last digit of the original number.
Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly
 */
// import java.util.Scanner;

// public class cf {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a positive integer: ");
//         int number = sc.nextInt();

        
//         int sum = 0;
//         int originalNumber = number;

        
//         while (originalNumber != 0) {
//             int digit = originalNumber % 10;         
//             sum += digit * digit * digit;            
//             originalNumber = originalNumber / 10;    
//         }

        
//         if (sum == number) {
//             System.out.println(" " + number + " is an Armstrong Number.");
//         } else {
//             System.out.println(" " + number + " is not an Armstrong Number.");
//         }
//     }
// }
















