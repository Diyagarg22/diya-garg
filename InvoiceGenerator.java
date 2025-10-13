// // //  quetsion 1
// //  public class message  {
    
// // @FunctionalInterface
// // interface LightAction {
// //     void execute();
// // }

// // public class message {
// //     public static void main(String[] args) {

        
// //         LightAction motionDetected = () -> System.out.println("Motion detected → Turning on the light.");
// //         LightAction nightTime = () -> System.out.println("Night time → Dimming the light for cozy ambiance.");
// //         LightAction voiceCommand = () -> System.out.println("Voice command → Changing light color to blue.");

    
// //         activateLight(motionDetected);
// //         activateLight(nightTime);
// //         activateLight(voiceCommand);
// //     }


// //     static void activateLight(LightAction action) {
// //         action.execute();
// //     }
// // }

    
// // // }


// // // question2
// // import java.util.*;

// // class message{
// //     String name;
// //     double price;
// //     double rating;
// //     double discount;

// //     public message(String name, double price, double rating, double discount) {
// //         this.name = name;
// //         this.price = price;
// //         this.rating = rating;
// //         this.discount = discount;
// //     }

// //     @Override
// //         public message 
// // }



// question3
// import java.util.*;
// import java.util.function.Predicate;

// class message  {
//     String type;
//     String message;

//     public message(String type, String message) {
//         this.type = type;
//         this.message = message;
//     }

//     @Override
//     public String toString() {
//         return "[" + type + "] " + message;
//     }
// }

// public class message {
//     public static void main(String[] args) {

        
//         List<Alert> alerts = Arrays.asList(
//                 new Alert("Critical", "Patient oxygen level dropped below 90%"),
//                 new Alert("Medication", "Time to take insulin injection"),
//                 new Alert("Appointment", "Doctor visit scheduled at 5 PM"),
//                 new Alert("Critical", "Heart rate irregular detected"),
//                 new Alert("Medication", "Take blood pressure medicine")
//         );

    
//         Predicate<Alert> showCritical = alert -> alert.type.equals("Critical");
//         Predicate<Alert> showMedication = alert -> alert.type.equals("Medication");
//         Predicate<Alert> showAppointment = alert -> alert.type.equals("Appointment");

        
//         System.out.println("\n🚨 Showing only Critical Alerts:");
//         filterAlerts(alerts, showCritical);

       
//         System.out.println("\n💊 Showing only Medication Alerts:");
//         filterAlerts(alerts, showMedication);

       
//         System.out.println("\n🩺 Showing Critical OR Medication Alerts:");
//         filterAlerts(alerts, showCritical.or(showMedication));
//     }

   
//     static void filterAlerts(List<Alert> alerts, Predicate<Alert> filter) {
//         alerts.stream()
//               .filter(filter)
//               .forEach(System.out::println);
//     }
// }


// question4
// import java.util.*;

// class message  {
//     int id;
//     String name;

//     public message(int id, String name) {
//         this.id = id;
// //         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }
// }

// public class HospitalAdmin {
//     public static void main(String[] args) {

//         // Step 1: Create a list of patients
//         List<message> patients = Arrays.asList(
//                 new message(101, "Aarav"),
//                 new message (102, "Diya"),
//                 new message(103, "Kabir"),
//                 new message(104, "Meera")
//         );

//         System.out.println("🏥 Patient IDs for Verification:\n");

     
//         patients.stream()
//                 .map(Patient::getId)          
//                 .forEach(System.out::println); 
//     }
// }

// question5
// import java.util.*;
// import java.util.stream.Collectors;

// public class message {
//     public static void main(String[] args) {
       
//         List<String> employees = Arrays.asList("Aarav", "Diya", "Kabir", "Meera", "Rohan");

        
//         List<String> upperCaseNames = employees.stream()
//                 .map(String::toUpperCase)   // Method reference instead of lambda (name -> name.toUpperCase())
//                 .collect(Collectors.toList());

      
//         System.out.println("📄 Employee Names in Uppercase for HR Letter:\n");
//         upperCaseNames.forEach(System.out::println);
//     }
// }



// question6
// import java.util.*;
// import java.util.stream.Collectors;

// class message {
//     String transactionId;

    
//     public message(String transactionId) {
//         this.transactionId = transactionId;
//     }

//     @Override
//     public String toString() {
//         return "Invoice generated for Transaction ID: " + transactionId;
//     }
// }

// public class message {
//     public static void main(String[] args) {
        
//         List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003", "TXN1004");

       
//         List<message> invoices = transactionIds.stream()
//                 .map(message::new)  
//                 .collect(Collectors.toList());


//         System.out.println("🧾 Generated Invoices:\n");
//         invoices.forEach(System.out::println);
//     }
// }
