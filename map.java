
// question1;
// public class map {
//     import java.util.*;

// public class map {
//     public static void main(String[] args) {

      
//         Map<String, Double> gradeMap = new HashMap<>();

//         gradeMap.put("Amit", 85.5);
//         gradeMap.put("Diya", 92.0);
//         gradeMap.put("Rahul", 76.0);
//         gradeMap.put("Sneha", 88.0);

      
//         gradeMap.put("Rahul", 82.5); // updated

//         gradeMap.remove("Amit");

 
//         System.out.println("Student Grades (Sorted):");

//         gradeMap.entrySet()
//                 .stream()
//                 .sorted(Map.Entry.comparingByKey()) // sort alphabetically
//                 .forEach(entry -> 
//                     System.out.println(entry.getKey() + " : " + entry.getValue())
//                 );
//     }
// }

    
// }

// question 2 ;


// import java.util.*;

// public class map {
//     public static void main(String[] args) {

        
//         Map<String, Integer> inventory = new HashMap<>();

      
//         inventory.put("Apples", 50);
//         inventory.put("Bananas", 30);
//         inventory.put("Milk", 10);
//         inventory.put("Bread", 20);

    
//         String productBought = "Bananas";
//         int quantityBought = 12;

//         inventory.put(productBought, inventory.get(productBought) - quantityBought);

        
//         if (inventory.get(productBought) <= 0) {
//             inventory.put(productBought, 0); // or remove()
//         }

       
//         String shipmentProduct = "Milk";
//         int shipmentQty = 40;

//         inventory.put(shipmentProduct, inventory.get(shipmentProduct) + shipmentQty);

//         String queryProduct = "Bread";

//         if (inventory.containsKey(queryProduct)) {
//             System.out.println(queryProduct + " in stock: " + inventory.get(queryProduct));
//         } else {
//             System.out.println(queryProduct + " is not stocked.");
//         }

      
//         System.out.println("\nOut of Stock Products:");
//         for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
//             if (entry.getValue() == 0) {
//                 System.out.println(entry.getKey());
//             }
//         }

      
//         System.out.println("\nFull Inventory:");
//         for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
//             System.out.println(entry.getKey() + " → " + entry.getValue());
//         }
//     }
// }



// question 3;

// import java.util.*;

// public class map{
//     public static void main(String[] args) {

//         Map<String, Integer> votes = new HashMap<>();

       
//         String[] voteList = {
//             "Amit", "Priya", "Rohan",
//             "Amit", "Priya", "Amit",
//             "Rohan", "Amit", "Priya", "Amit"
//         };

       
//         for (String candidate : voteList) {
            
//             if (votes.containsKey(candidate)) {
//                 votes.put(candidate, votes.get(candidate) + 1);
//             } else {
              
//                 votes.put(candidate, 1);
//             }
//         }

     
//         System.out.println("Total Votes:");
//         for (Map.Entry<String, Integer> entry : votes.entrySet()) {


//             question 4;

//             import java.util.*;

// public class map {
//     public static void main(String[] args) {


//         Map<String, String> catalog = new HashMap<>();


//         catalog.put("978-1111111111", "The Great Gatsby");
//         catalog.put("978-2222222222", "To Kill a Mockingbird");
//         catalog.put("978-3333333333", "1984");
//         catalog.put("978-4444444444", "The Alchemist");

      
//         String searchISBN = "978-3333333333"; // searching for 1984

//         if (catalog.containsKey(searchISBN)) {
//             System.out.println("Book Found: " + catalog.get(searchISBN));
//         } else {
//             System.out.println("Book not found");
//         }

        
//         String removeISBN = "978-2222222222";
//         catalog.remove(removeISBN);

//         System.out.println("\nLibrary Catalog (Sorted by ISBN):");
//         catalog.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByKey()) // sort by ISBN
//                .forEach(entry ->
//                        System.out.println(entry.getKey() + " → " + entry.getValue())
//                );

//         String titleSearch = "1984";
//         boolean found = false;

//         for (Map.Entry<String, String> entry : catalog.entrySet()) {
//             if (entry.getValue().equalsIgnoreCase(titleSearch)) {
//                 System.out.println("\nFound by Title:");
//                 System.out.println("ISBN: " + entry.getKey() + ", Title: " + entry.getValue());
//                 found = true;
//                 break;
//             }
//         }

//         if (!found) {
//             System.out.println("\nBook not found by title search");
//         }
//     }
// }


// question 5;

// import java.util.*;

// public class map {
//     public static void main(String[] args) {

//         // 1. The input sentence
//         String sentence = "Java is fun and Java is powerful!";

//         // 2. Normalize: lowercase + remove punctuation
//         sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");

//         // Split into words
//         String[] words = sentence.split("\\s+");

//         // Map to store word → count
//         Map<String, Integer> freqMap = new HashMap<>();

//         // 3. Count each word
//         for (String word : words) {
//             if (freqMap.containsKey(word)) {
//                 freqMap.put(word, freqMap.get(word) + 1);
//             } else {
//                 freqMap.put(word, 1);
//             }
//         }

//         // 4. Print each word with its count
//         System.out.println("Word Frequencies:");
//         for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
//             System.out.println(entry.getKey() + " → " + entry.getValue());
//         }
//     }
// }

