//Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
// import java.util.Scanner;

// public class elements {
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

       
//         double number1, number2;
//         double addition, subtraction, multiplication, division;

        
//         System.out.print("Enter first number: ");
//         number1 = input.nextDouble();

//         System.out.print("Enter second number: ");
//         number2 = input.nextDouble();

        
//         addition = number1 + number2;
//         subtraction = number1 - number2;
//         multiplication = number1 * number2;

        
//         if (number2 != 0) {
//             division = number1 / number2;
//         } else {
//             division = Double.NaN; 
//         }

//         System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and ", number1, number2, addition, subtraction, multiplication);
        
//         if (!Double.isNaN(division)) {
//             System.out.printf("%.2f%n", division);
//         } else {
//             System.out.println("undefined (division by zero)");
//         }

       
//         input.close();
//     }
// }



//Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
// import java.util.Scanner;

// public class elements{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

       
//         System.out.print("Enter base of the triangle in cm: ");
//         double base = input.nextDouble();

//         System.out.print("Enter height of the triangle in cm: ");
//         double height = input.nextDouble();

     
//         double areaCm2 = 0.5 * base * height;

        
//         double areaIn2 = areaCm2 / 6.4516;

        
//         System.out.printf("The Area of the triangle in sq cm is %.2f cm² and in sq in is %.2f in²%n", areaCm2, areaIn2);

//         input.close();
//     }
// }


//Write a program to find the side of the square whose parameter you read from the user 
// import java.util.Scanner;

// public class elements {
//     public static void main(String[] args) {
       
//         Scanner input = new Scanner(System.in);

        
//         double perimeter, side;

//         System.out.print("Enter the perimeter of the square: ");
//         perimeter = input.nextDouble();

        
//         side = perimeter / 4;

       
//         System.out.printf("The length of the side is %.2f units whose perimeter is %.2f units%n", side, perimeter);

        
//         input.close();
//     }
// }



//Write a program to find the distance in yards and miles for the distance provided by the user in feet
// import java.util.Scanner;

// public class elements{
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

        
//         double distanceInFeet, distanceInYards, distanceInMiles;

        
//         System.out.print("Enter the distance in feet: ");
//         distanceInFeet = input.nextDouble();

        
//         distanceInYards = distanceInFeet / 3.0;         
//         distanceInMiles = distanceInYards / 1760.0;     

        
//         System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f%n", distanceInYards, distanceInMiles);

        
//         input.close();
//     }
// }







//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
// import java.util.Scanner;

// public class elements {
//     public static void main(String[] args) {
       
//         Scanner input = new Scanner(System.in);

        
//         double unitPrice;
//         int quantity;
//         double totalPrice;

        
//         System.out.print("Enter the unit price of the item (INR): ");
//         unitPrice = input.nextDouble();

//         System.out.print("Enter the quantity to be bought: ");
//         quantity = input.nextInt();

       
//         totalPrice = unitPrice * quantity;

        
//         System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n", totalPrice, quantity, unitPrice);

       
//         input.close();
//     }
// }






//Write a program to take 2 numbers and print their quotient and reminder
// import java.util.Scanner;

// public class elements {
//     public static void main(String[] args) {
       
//         Scanner input = new Scanner(System.in);

        
//         int number1, number2;
//         int quotient, remainder;

        
//         System.out.print("Enter the first number: ");
//         number1 = input.nextInt();

//         System.out.print("Enter the second number: ");
//         number2 = input.nextInt();

        
//         if (number2 != 0) {
//             quotient = number1 / number2;
//             remainder = number1 % number2;

            
//             System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d%n", quotient, remainder, number1, number2);
//         } else {
//             System.out.println("Division by zero is not allowed. Please enter a non-zero second number.");
//         }

        
//         input.close();
//     }
// }




//Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
// import java.util.Scanner;

// public class elements{
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

        
//         int a, b, c;

       
//         System.out.print("Enter value for a: ");
//         a = input.nextInt();

//         System.out.print("Enter value for b: ");
//         b = input.nextInt();

//         System.out.print("Enter value for c: ");
//         c = input.nextInt();

        
//         int result1 = a + b * c;      
//         int result2 = a * b + c;      
//         int result3 = c + a / b;       
//         int result4 = a % b + c;       

        
//         System.out.printf("The results of Int Operations are:%n");
//         System.out.printf("a + b * c = %d%n", result1);
//         System.out.printf("a * b + c = %d%n", result2);
//         System.out.printf("c + a / b = %d%n", result3);
//         System.out.printf("a %% b + c = %d%n", result4); // %% to escape % in printf

//         input.close();
//     }
// }


//Similarly, write the DoubleOpt program by taking double values and doing the same operations.
// import java.util.Scanner;

// public class elements {
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);
//     }
// }

        

 

