// Create a program to print odd and even numbers between 1 to the number entered by the user.
// Hint => 
// Get an integer input from the user, assign to a variable number and check for Natural Number
// Using a for loop, iterate from 1 to the number
// In each iteration of the loop, print the number is odd or even number
// import java.util.*;

// public class flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a natural number: ");
//         int number = sc.nextInt();

//         if (number >= 1) {
           
//             for (int i = 1; i <= number; i++) {
//                 if (i % 2 == 0) {
//                     System.out.println(i + " is an even number.");
//                 } else {
//                     System.out.println(i + " is an odd number.");
//                 }
//             }
//         } else {
//             System.out.println(" Please enter a natural number greater than 0.");
//         }
//     }
// }

// Create a program to find the bonuses of employees based on their years of service.
// Hint => 
// Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
// Take salary and year of service in the year as input.
// Print the bonus amount.
// import java.util.*;

// public class flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter employee's salary: ");
//         double salary = sc.nextDouble();

//         System.out.print("Enter years of service: ");
//         int years = sc.nextInt();

        
//         if (years > 5) {
//             double bonus = salary * 0.05;
//             System.out.println("Bonus amount: ₹" + bonus);
//         } else {
//             System.out.println("No bonus. Service must be more than 5 years.");
//         }
//     }
// }



// Create a program to find the multiplication table of a number entered by the user from 6 to 9.
// Hint => 
// Take integer input and store it in the variable number
// Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___ 
// import java.util.Scanner;

// public class flow{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a number to generate its table from 6 to 9: ");
//         int number = sc.nextInt();

        
//         for (int i = 6; i <= 9; i++) {
//             System.out.println(number + " * " + i + " = " + (number * i));
//         }
//     }
// }



// Write a program FizzBuzz, take a number as user input, and check for a positive integer. If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
// Hint => 
// Take the user input number, check for a positive integer, and use for loop to display
// import java.util.*;

// public class flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a positive integer: ");
//         int number = sc.nextInt();

//         if (number > 0) {
            
//             for (int i = 1; i <= number; i++) {
//                 if (i % 3 == 0 && i % 5 == 0) {
//                     System.out.println("FizzBuzz");
//                 } else if (i % 3 == 0) {
//                     System.out.println("Fizz");
//                 } else if (i % 5 == 0) {
//                     System.out.println("Buzz");
//                 } else {
//                     System.out.println(i);
//                 }
//             }
//         } else {
//             System.out.println("Please enter a positive integer greater than 0.");
//         }
//     }
// }



// Rewrite the program 4 FizzBuzz using the while loop 
// import java.util.*;

// public class flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a positive integer: ");
//         int number = sc.nextInt();

        
//         if (number > 0) {
//             int i = 1;

            
//             while (i <= number) {
//                 if (i % 3 == 0 && i % 5 == 0) {
//                     System.out.println("FizzBuzz");
//                 } else if (i % 3 == 0) {
//                     System.out.println("Fizz");
//                 } else if (i % 5 == 0) {
//                     System.out.println("Buzz");
//                 } else {
//                     System.out.println(i);
//                 }
//                 i++;
//             }
//         } else {
//             System.out.println(" Please enter a positive integer greater than 0.");
//         }
//     }
// }


// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for the age and height of the 3 friends and store it in a variable
// Find the smallest of the 3 ages to find the youngest friend and display it
// Find the largest of the 3 heights to find the tallest friend and display it
// import java.util.*;

// public class flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter Amar's age: ");
//         int ageAmar = sc.nextInt();
//         System.out.print("Enter Amar's height (in cm): ");
//         int heightAmar = sc.nextInt();

        
//         System.out.print("Enter Akbar's age: ");
//         int ageAkbar = sc.nextInt();
//         System.out.print("Enter Akbar's height (in cm): ");
//         int heightAkbar = sc.nextInt();

//         System.out.print("Enter Anthony's age: ");
//         int ageAnthony = sc.nextInt();
//         System.out.print("Enter Anthony's height (in cm): ");
//         int heightAnthony = sc.nextInt();

        
//         String youngest;
//         if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
//             youngest = "Amar";
//         } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
//             youngest = "Akbar";
//         } else {
//             youngest = "Anthony";
//         }

        
//         String tallest;
//         if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
//             tallest = "Amar";
//         } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
//             tallest = "Akbar";
//         } else {
//             tallest = "Anthony";
//         }

        
//         System.out.println(" The youngest friend is: " + youngest);
//         System.out.println(" The tallest friend is: " + tallest);
//     }
// }



// Create a program to find the factors of a number taken as user input.
// Hint => 
// Get the input value for a variable named number and check if it is a positive integer.
// Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i.
// import java.util.Scanner;

// public class flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

      
//         System.out.print("Enter a positive integer: ");
//         int number = sc.nextInt();

        
//         if (number > 0) {
//             System.out.println("Factors of " + number + " are:");
//             for (int i = 1; i <= number; i++) {
//                 if (number % i == 0) {
//                     System.out.println(i);
//                 }
//             }
//         } else {
//             System.out.println(" Please enter a positive integer greater than 0.");
//         }
//     }
// }


// Rewrite the above program 7 to find the factors of a number using the while loop
// Hint => 
// Get the input value for a variable named number and check if it is a positive integer.
// Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value of the counter.
// import java.util.*;

// public class flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a positive integer: ");
//         int number = sc.nextInt();

        
//         if (number > 0) {
//             System.out.println("Factors of " + number + " are:");
//             int i = 1;

            
//                         while (i <= number) {
//                 if (number % i == 0) {
//                     System.out.println(i);
//                 }
//                 i++;
//             }
//         } else {
//             System.out.println(" Please enter a positive integer greater than 0.");
//         }
//     }
// }


// Create a program to print the greatest factor of a number beside itself using a loop.
// Hint => 
// Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
// Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
// Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
// Display the greatestFactor variable outside the loop
// import java.util.Scanner;

// public class flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a positive integer: ");
//         int number = sc.nextInt();

        
//         if (number > 1) {
//             int greatestFactor = 1;

            
//             for (int i = number - 1; i >= 1; i--) {
//                 if (number % i == 0) {
//                     greatestFactor = i;
//                     break; 
//                 }
//             }


//             System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
//         } else {
//             System.out.println(" Please enter an integer greater than 1.");
//         }
//     }
// }


// Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
// Hint => 
// Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
// Create a variable counter and assign counter = number - 1; Use the while loop till the counter is equal to 1.
// Inside the loop, check if the number is perfectly divisible by the counter then assign the counter to greatestFactor variable and break the loop.
// Display the greatestFactor variable outside the loop
// import java.util.*;

// public class flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter a positive integer: ");
//         int number = sc.nextInt();

        
//         if (number > 1) {
//             int greatestFactor = 1;
//             int counter = number - 1;

            
//             while (counter >= 1) {
//                 if (number % counter == 0) {
//                     greatestFactor = counter;
//                     break; 
//                 }
//                 counter--;
//             }

    
//             System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
//         } else {
//             System.out.println(" Please enter an integer greater than 1.");
//         }
//     }
// }


// Create a program to find all the multiples of a number taken as user input below 100.
// Hint => 
// Get the input value for a variable named number. Check the number is a positive integer and less than 100.
// Run a for loop backward: from i = 100 to i = 1.
// Inside the loop, check if i perfectly divide the number. If true, print the number and continue the loop.
// import java.util.*;

// public class flow{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

     
//         System.out.print("Enter a positive integer less than 100: ");
//         int number = sc.nextInt();

        
//         if (number > 0 && number < 100) {
//             System.out.println("Multiples of " + number + " below 100 are:");
//             for (int i = 100; i >= 1; i--) {
//                 if (i % number == 0) {
//                     System.out.println(i);
//                 }
//             }
//         } else {
//             System.out.println(" Please enter a positive integer less than 100.");
//         }
//     }
// }



// Create a program to find the power of a number.
// Hint => 
// Get integer input for two variables - number and power and check for positive integer
// Create a result variable with an initial value of 1.
// Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result
// import java.util.Scanner;

// public class flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter the base number (positive integer): ");
//         int number = sc.nextInt();

//         System.out.print("Enter the power (positive integer): ");
//         int power = sc.nextInt();

        
//         if (number > 0 && power >= 0) {
//             int result = 1;

           
//             for (int i = 1; i <= power; i++) {
//                 result *= number;
//             }

            
//             System.out.println(number + " raised to the power " + power + " is: " + result);
//         } else {
//             System.out.println("Please enter positive integers for both base and power.");
//         }
//     }
// }


// Rewrite the program to find all the multiples of a number below 100 using while loop.
// Hint => 
// Get the input value for a variable named number. Check the number is a positive integer and less than 100.
// Create a counter variable and assign counter = number - 1; Use a while till the counter is > 1
// Inside the loop, check if the counter perfectly divides the number. If true, print the number and continue the loop.
// import java.util.Scanner;

// public class flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         /
//         System.out.print("Enter a positive integer less than 100: ");
//         int number = sc.nextInt();

        
//         if (number > 0 && number < 100) {
//             System.out.println("Multiples of " + number + " below 100 are:");
//             int counter = 100;

            
//             while (counter > 1) {
//                 counter--; 
//                 if (counter % number == 0) {
//                     System.out.println(counter);
//                 }
//             }
//         } else {
//             System.out.println(" Please enter a positive integer less than 100.");
//         }
//     }
// }



// Rewrite the above program to find the power of a number using a while loop.
// Hint => 
// Get integer input for two variables named number and power.
// Create a result variable with an initial value of 1.
// Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
// In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
// Finally, print the result
// import java.util.Scanner;

// public class flow {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter the base number (positive integer): ");
//         int number = sc.nextInt();

//         System.out.print("Enter the power (positive integer): ");
//         int power = sc.nextInt();

        
//         if (number > 0 && power >= 0) {
//             int result = 1;
//             int counter = 0;

            
//             while (counter < power) {
//                 result *= number;
//                 counter++;
//             }

           
//             System.out.println(number + " raised to the power " + power + " is: " + result);
//         } else {
//             System.out.println("Please enter positive integers for both base and power.");
//         }
//     }
// }



