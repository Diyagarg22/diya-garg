// public class nodue {
//     import java.util.*;

// public class nodue {
//     public static <T> List<T> reverseList(List<T> list) {
//         List<T> reversed = new ArrayList<>();
//         for (int i = list.size() - 1; i >= 0; i--) {
//             reversed.add(list.get(i));
//         }
// //         return reversed;
// //     }

// //     public static void main(String[] args) {
// //         rrayList<>(Arrays.asList(1, 2, 3, 4, 5));
// //         System.out.println("Original ArrayList: " + arrayList);
// //         List<Integer> reversedArrayList = reverseList(arrayList);
// //         System.out.println("Reversed ArrayList: " + reversedArrayList);

      
// //         List<Integer> linkedList = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
// //         System.out.println("\nOriginal LinkedList: " + linkedList);
// //         List<Integer> reversedLinkedList = reverseList(linkedList);
// //         System.out.println("Reversed LinkedList: " + reversedLinkedList);
// //     }
// // }

// // }

// // question2

// // import java.util.*;

// // public class nodue {
// //     public static Map<String, Integer> findFrequency(List<String> list) {
// //         Map<String, Integer> frequencyMap = new HashMap<>();

// //         for (String item : list) {
// //             // If the item already exists, increase its count by 1, else set it to 1
// //             if (frequencyMap.containsKey(item)) {
// //                 frequencyMap.put(item, frequencyMap.get(item) + 1);
// //             } else {
// //                 frequencyMap.put(item, 1);
// //             }
// //         }

// //         return frequencyMap;
// //     }

// //     public static void main(String[] args) {
// //         List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");

// //         System.out.println("Input List: " + fruits);
// //         Map<String, Integer> result = findFrequency(fruits);
// //         System.out.println("Frequency Map: " + result);
// //     }
// // }


// question3

// import java.util.*;

// public class nodue {
    
//     public static <T> List<T> rotateList(List<T> list, int positions) {
//         int size = list.size();
//         List<T> rotated = new ArrayList<>();

       
//         positions = positions % size;

       
//         for (int i = positions; i < size; i++) {
//             rotated.add(list.get(i));
//         }

//         for (int i = 0; i < positions; i++) {
//             rotated.add(list.get(i));
//         }

//         return rotated;
//     }

//     public static void main(String[] args) {
//         List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

//         int rotateBy = 2;
//         System.out.println("Original List: " + numbers);
//         List<Integer> rotatedList = rotateList(numbers, rotateBy);
//         System.out.println("Rotated List by " + rotateBy + ": " + rotatedList);
//     }
// }


// question4

// import java.util.*;

// // public class nodue{
   
// //     public static <T> List<T> removeDuplicates(List<T> list) {
// //         List<T> uniqueList = new ArrayList<>();
// //         Set<T> seen = new HashSet<>();

// //         for (T item : list) {
// //             if (!seen.contains(item)) {
// //                 seen.add(item);
// //                 uniqueList.add(item);
// //             }
// //         }

// //         return uniqueList;
// //     }

// //     public static void main(String[] args) {
// //         List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

// //         System.out.println("Original List: " + numbers);
// //         List<Integer> result = removeDuplicates(numbers);
// //         System.out.println("List after removing duplicates: " + result);
// //     }
// // }

// question5

// import java.util.*;

// public class nodue {
   
//     public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
       
//         Iterator<T> fast = list.iterator();
//         Iterator<T> slow = list.iterator();

       
//         for (int i = 0; i < n; i++) {
//             if (fast.hasNext()) {
//                 fast.next();
//             } else {
//                 throw new IllegalArgumentException("List is shorter than N elements");
//             }
//         }

        
//         T slowVal = null;
//         while (fast.hasNext()) {
//             slowVal = slow.next();
//             fast.next();
//         }

      
//         return slowVal;
//     }

//     public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
//         int n = 2;

//         System.out.println("LinkedList: " + list);
//         String result = findNthFromEnd(list, n);
//         System.out.println("The " + n + "nd element from the end is: " + result);
//     }
// }
