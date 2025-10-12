
// public class Main {
//     public static void main(String[] args) {
//         SmartDevice light = new Light();
//         SmartDevice ac = new AirConditioner();
//         SmartDevice tv = new Television();

//         light.turnOn();
//         ac.turnOn();
//         tv.turnOn();

//         light.turnOff();
//         ac.turnOff();
//         tv.turnOff();
//     }
// }



// public class Main {
//     public static void main(String[] args) {
//         Vehicle car = new Car();
//         Vehicle bike = new Bike();
//         Vehicle bus = new Bus();

//         car.rent();
//         bike.rent();
//         bus.rent();

//         car.returnVehicle();
//         bike.returnVehicle();
//         bus.returnVehicle();
//     }
// }


// Main.java
// public class Main {
//     public static void main(String[] args) {
//         Payment upi = new UPI();
// //         Payment card = new CreditCard();
// //         Payment wallet = new Wallet();

// //         upi.pay(500.0);
// //         card.pay(1200.0);
// //         wallet.pay(300.0);
// //     }
// // }



// public class Main {
//     public static void main(String[] args) {
//         double threshold = 40.0; 

        
//         Predicate<Double> isHighTemperature = temp -> temp > threshold;

//         double currentTemp1 = 35.5;
//         double currentTemp2 = 42.3;

        
//         if (isHighTemperature.test(currentTemp1)) {
//             System.out.println("Alert! Temperature is high: " + currentTemp1 + "°C");
//         } else {
//             System.out.println("Temperature is normal: " + currentTemp1 + "°C");
//         }

//         
//         if (isHighTemperature.test(currentTemp2)) {
//             System.out.println("Alert! Temperature is high: " + currentTemp2 + "°C");
//         } else {
//             System.out.println("Temperature is normal: " + currentTemp2 + "°C");
//         }
//     }
// }

    

// public class Main{
//     public static void main(String[] args) {
//         int charLimit = 50; 

        
//         Function<String, Integer> lengthFunction = msg -> msg.length();

        
//         String msg1 = "Hello, this is a short message!";
//         String msg2 = "This message is quite long and might exceed the character limit of fifty.";

        
//         int len1 = lengthFunction.apply(msg1);
//         if (len1 > charLimit) {
//             System.out.println("Message 1 exceeds the character limit (" + len1 + " characters).");
//         } else {
//             System.out.println("Message 1 is within the limit (" + len1 + " characters).");
//         }

        
//         int len2 = lengthFunction.apply(msg2);
//         if (len2 > charLimit) {
//             System.out.println("Message 2 exceeds the character limit (" + len2 + " characters).");
//         } else {
//             System.out.println("Message 2 is within the limit (" + len2 + " characters).");
//         }
//     }
// }




// public class Main {
//     public static void main(String[] args) {

       
//         Runnable backgroundJob = () -> {
//             System.out.println("Background task started...");
//             try {
                
//                 Thread.sleep(2000);
//                 System.out.println("Processing data in background...");
//                 Thread.sleep(2000);
//             } catch (InterruptedException e) {
//                 System.out.println("Background task interrupted!");
//             }
//             System.out.println("Background task completed!");
//         };

        
//         Thread thread = new Thread(backgroundJob);
//         thread.start();

//         System.out.println("Main thread is free to perform other tasks...");
//     }
// }




// Interface with a static method
// interface SecurityUtils {
   
//     static boolean isStrongPassword(String password) {
       
//         if (password == null || password.length() < 8)
//             return false;

//         boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

//         for (char ch : password.toCharArray()) {
//             if (Character.isUpperCase(ch))
//                 hasUpper = true;
//             else if (Character.isLowerCase(ch))
//                 hasLower = true;
//             else if (Character.isDigit(ch))
//                 hasDigit = true;
//             else
//                 hasSpecial = true;
//         }

//         return hasUpper && hasLower && hasDigit && hasSpecial;
//     }
// }


// // public class Main {
// //     public static void main(String[] args) {
// //         String password = "Insure@123";

// //         if (SecurityUtils.isStrongPassword(password)) {
// //             System.out.println("Strong password! You can proceed.");
// //         } else {
// //             System.out.println(" Weak password! Please follow the password policy.");
// //         }
// //     }
// // }






// // Interface with static methods for unit conversions
// interface UnitConverter {

//     static double kmToMiles(double km) {
//         return km * 0.621371;
//     }

//     static double milesToKm(double miles) {
//         return miles / 0.621371;
//     }

   
//     static double kgToLbs(double kg) {
//         return kg * 2.20462;
//     }

   
//     static double lbsToKg(double lbs) {
//         return lbs / 2.20462;
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         double km = 10.0;
//         double kg = 5.0;

//         System.out.println(km + " km = " + UnitConverter.kmToMiles(km) + " miles");
//         System.out.println(kg + " kg = " + UnitConverter.kgToLbs(kg) + " lbs");

//         System.out.println("6.2 miles = " + UnitConverter.milesToKm(6.2) + " km");
// //         System.out.println("11 lbs = " + UnitConverter.lbsToKg(11) + " kg");
// //     }
// // }




// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;


// interface DateUtils {
//     static String formatDate(LocalDate date, String pattern) {
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
//         return date.format(formatter);
//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         LocalDate today = LocalDate.now();

//         System.out.println("Default Format: " + DateUtils.formatDate(today, "dd-MM-yyyy"));
//         System.out.println("US Format: " + DateUtils.formatDate(today, "MM/dd/yyyy"));
//         System.out.println("Month Name Format: " + DateUtils.formatDate(today, "dd-MMMM-yyyy"));
//         System.out.println("ISO Format: " + DateUtils.formatDate(today, "yyyy-MM-dd"));
//     }
// }





// Interface with a default method
// interface PaymentProcessor {
//     void processPayment(double amount);

   
//     default void refund(double amount) {
//         System.out.println("Default refund of ₹" + amount + " processed (standard policy).");
//     }
// }


// class PaytmProcessor implements PaymentProcessor {
//     @Override
//     public void processPayment(double amount) {
//         System.out.println("Payment of ₹" + amount + " processed via Paytm.");
//     }
// }


// class RazorpayProcessor implements PaymentProcessor {
//     @Override
//     public void processPayment(double amount) {
//         System.out.println("Payment of ₹" + amount + " processed via Razorpay.");
//     }

//     @Override
//     public void refund(double amount) {
//         System.out.println("Refund of ₹" + amount + " initiated via Razorpay with instant transfer.");
//     }
// // }


// public class Main {
//     public static void main(String[] args) {
//         PaymentProcessor paytm = new PaytmProcessor();
//         PaymentProcessor razorpay = new RazorpayProcessor();

//         paytm.processPayment(500);
//         paytm.refund(200); 

//         razorpay.processPayment(1000);
//         razorpay.refund(500);  
//     }
// }

