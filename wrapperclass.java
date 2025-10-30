// question 1


// import java.util.Scanner;

// public class wrapperclass {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Taking integer input from user
//         System.out.print("Enter an integer value: ");
//         int num = sc.nextInt();  // primitive int

// //         // Converting primitive to wrapper (boxing)
// //         Integer obj = Integer.valueOf(num);

// //         // Displaying both forms
// //         System.out.println("\n--- Conversion Result ---");
// //         System.out.println("Primitive value: " + num);
// //         System.out.println("Wrapper object value: " + obj);

// //         sc.close();
// //     }
// // }

// Question2

// public class wrapperclass {
//     public static void main(String[] args) {
//         // Given Double object
//         Double obj = 45.67;

//         // Converting to primitive double
//         double d = obj.doubleValue();

//         // Converting to primitive int using casting
//         int i = (int) d;

//         // Displaying all values
//         System.out.println("--- Wrapper to Primitive Conversion ---");
//         System.out.println("Wrapper object (Double): " + obj);
//         System.out.println("Primitive double value: " + d);
//         System.out.println("Primitive int value (after casting): " + i);
//     }
// }

// Question3

// import java.util.ArrayList;

// public class wrapperclass {
//     public static void main(String[] args) {
//         // Creating an ArrayList of Integer
//         ArrayList<Integer> numbers = new ArrayList<>();

//         // Adding integer values using auto-boxing
//         numbers.add(10);  // int automatically converted to Integer
//         numbers.add(20);
//         numbers.add(5);
//         numbers.add(15);
//         numbers.add(5);

//         // Calculating sum using auto-unboxing
//         int sum = 0;
//         for (Integer num : numbers) {
//             sum += num;  // Integer automatically converted to int
//         }

//         // Displaying result
//         System.out.println("Sum of numbers = " + sum);
//     }
// // }

// Question4

// public class Wrapperclass {
//     public static void main(String[] args) {
//         // Using parse methods
//         int num = Integer.parseInt("123");
//         double d = Double.parseDouble("3.14");
//         boolean b = Boolean.parseBoolean("true");

//         // Using conversion and checking methods
//         String binary = Integer.toBinaryString(10);
//         boolean isDigit = Character.isDigit('5');

//         // Displaying results
//         System.out.println("--- Wrapper Class Utility Methods ---");
//         System.out.println("Integer.parseInt(\"123\") = " + num);
//         System.out.println("Double.parseDouble(\"3.14\") = " + d);
//         System.out.println("Boolean.parseBoolean(\"true\") = " + b);
//         System.out.println("Integer.toBinaryString(10) = " + binary);
//         System.out.println("Character.isDigit('5') = " + isDigit);
//     }
// }

// Question5


// public class wrapperclass {

//     // Method to safely parse a String to int
//     public static int safeParseInt(String input) {
//         try {
//             return Integer.parseInt(input);  // Try parsing
//         } catch (NumberFormatException e) {
//             return -1;  // Return -1 if parsing fails
//         }
//     }

//     public static void main(String[] args) {
//         // Test inputs
//         String[] testInputs = {"123", "abc", "45.6", "0"};

//         System.out.println("--- Safe Integer Parsing ---");
//         for (String input : testInputs) {
//             int result = safeParseInt(input);
//             System.out.println("Input: \"" + input + "\" → Output: " + result);
//         }
//     }
// }
