// class demo{
//     public static void main(String[] args){
//         System.out.println("Hello World");
//     }
// }

// import java.util.*;

// public class demo{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//         if(age>18){
//             System.out.println("Adult");
//         }
//         else{
//             System.out.println("Not Adult");
//         }

//     }
// }


//       int x=sc.nextInt();
//       if(x%2==0){
//         System.out.println("Even");
//       }
//       else{
//         System.out.println("Odd");
//       }
//     }
// }


//   int a=sc.nextInt();
//   int b=sc.nextInt();
//   if(a==b){
//     System.out.println("Equal");
//   }
//   else if(a>b){
//         System.out.println("a is greater");
//     }
//     else{
//         System.out.println("a is lesse");
//     }
//   }
// }


// import java.util.*;
// public class demo {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button=sc.nextInt();
        //  if(button==1){
        //     System.out.println("Hello");
        // }
        // else if(button==2){
        //     System.out.println("Namaste");

        // }
        // else if(button==3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Invalid Button");
        // }



//         switch(button){
//             case 1:System.out.println("Hello");
//             break;
//             case 2:System.out.println("Namaste");
//             break;
//             case 3:System.out.println("Bonjour");
//             break;
//             default:System.out.println("Invalid Button");

//         }


        
//     }
// }



// import java.util.*;
// public class demo {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int operator=sc.nextInt();
//         switch(operator){
//             case 1:System.out.println(a+b);
//             break;
//             case 2:System.out.println(a-b);
//             break;
//             case 3:System.out.println(a*b);
//             break;
//             case 4:if(b==0){
//                 System.out.println("Invalid Division");
//             }
//             else{
//                 System.out.println(a/b);
//             }
            
//             break;
//             case 5:if(b==0){
//                 System.out.println("Invalid Division");
//             }
//             else{
//                 System.out.println(a%b);
//             }
//             break;
//             default:System.out.println("invalid");
//         }

//     }
// }

// import java.util.*;
// public class demo {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int monthNumber=sc.nextInt();
//         String monthName;
//         switch(monthNumber){
//             case 1:monthName="January";
//             break;
//             case 2:monthName="Febuary";
//             break;
//             case 3:monthName="March";
//             break;
//             case 4:monthName="April";
//             break;
//             case 5:monthName="May";
//             break;
//             case 6:monthName="June";
//             break;
//             case 7:monthName="July";
//             break;
//             case 8:monthName="August";
//             break;
//             case 9:monthName="September";
//             break;
//             case 10:monthName="October";
//             break;
//             case 11:monthName="November";
//             break;
//             case 12:monthName="December";
//             break;
//             default:monthName="Invalid month number";


//         }
//         System.out.println("Month: "+monthName);
//     }
// }


//Write a Java program using switch to display the day of the week based on a number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday).
// import java.util.*;
// public class demo {

//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                         int day=sc.nextInt();
//                         switch(day){
//                                 case 1:System.out.println("Monday");
//                                 break;
//                                 case 2:System.out.println("Tuesday");
//                                 break;
//                                 case 3:System.out.println("Wednesday");
//                                 break;
//                                 case 4:System.out.println("Thursday");
//                                 break;
//                                 case 5:System.out.println("Friday");
//                                 break;
//                                 case 6:System.out.println("Saturday");
//                                 break;
//                                 case 7:System.out.println("Sunday");
//                                 break;
                                
//                         }
                
//         }
// }



//Using switch, write a program to determine if a character is a vowel or consonant.
//Write a Java program using a while loop to print all even numbers from 1 to 50.
//dusra   question ka solution
// int i=1;
// while(i<=50){
      
//       if(i%2==0){
//         System.out.println(i+" ");
//       }  
//       i++;
// }
//         }
// }

//pehla question
// char ch=sc.next().toLowerCase().charAt(0);
// switch (ch) {
//         case 'a':
//         case 'e':
//         case 'i':
//         case 'o':
//         case 'u':
//         System.out.println(ch);
//         break;
//         default:
//         if(Character.isLetter(ch)){
//                 System.out.println(ch+" is an alphabet");
//         }
//         else{
//                 System.out.println("not an alphabet");
//         }
//                 break;
// }
//         }
// }


//Write a program that asks the user to enter a number until they enter a negative number, then print the sum of all entered positive numbers
// int n=sc.nextInt();
// int sum=0;
// while(true){
//         if(n<0){
//                 break;
//     }
//     sum+=n;
// }
// System.out.println(sum);
//         }
// }



