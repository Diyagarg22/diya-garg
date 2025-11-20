

// question1
//     import college.student.Student;
// import college.faculty.Faculty;

// public class pakage  {
//     public static void main(String[] args) {

//         Student s = new Student("Diya", 101);
//         s.displayStudent();

//         System.out.println();

//         Faculty f = new Faculty("Mr. Sharma", "Computer Science");
//         f.displayFaculty();
//     }
// }

// question2
// package com.university.department.cse;

// public class pakage {
//     private String courseName;
//     private int courseCode;

//     public Course(String courseName, int courseCode) {
//         this.courseName = courseName;
//         this.courseCode = courseCode;
//     }

//     public void displayCourseDetails() {
//         System.out.println("Course Name: " + courseName);
//         System.out.println("Course Code: " + courseCode);
//     }
// }

// question3 
// import static java.lang.Math.*;

// public class pakage {
//     public static void main(String[] args) {

//         double a = 25;
//         double b = -10;
//         double x = 5;
//         double y = 3;

//         System.out.println("sqrt(25) = " + sqrt(a));        // 1. sqrt()
//         System.out.println("pow(5, 3) = " + pow(x, y));     // 2. pow()
//         System.out.println("max(5, 3) = " + max(x, y));     // 3. max()
//         System.out.println("min(5, 3) = " + min(x, y));     // 4. min()
//         System.out.println("abs(-10) = " + abs(b));         // 5. abs()
//     }
// }

// question4
// import college.student.Student;

// public class pakage  {
//     public static void main(String[] args) {
//         Student s = new Student("Diya", 101);
//         s.displayStudent();
//     }
// }

// question5
// package library.books;

// public class pakage  {
//     private String title;
//     private String author;
//     private String isbn;
//     private boolean isIssued;

//     public Book(String title, String author, String isbn) {
//         this.title = title;
//         this.author = author;
//         this.isbn = isbn;
//         this.isIssued = false;
//     }

//     public void issueBook() {
//         if (!isIssued) {
//             isIssued = true;
//             System.out.println("Book issued: " + title);
//         } else {
//             System.out.println("Book is already issued!");
//         }
//     }

//     public void displayBook() {
//         System.out.println("Book Title: " + title);
//         System.out.println("Author: " + author);
//         System.out.println("ISBN: " + isbn);
//         System.out.println("Issued: " + isIssued);
//         System.out.println("-----------------------------");
//     }

//     public boolean isAvailable() {
//         return !isIssued;
//     }
// }

// question 6
// package com.school.data;

// public class pakage  {
//     private String name;
//     private int m1, m2, m3;

//     public Student(String name, int m1, int m2, int m3) {
//         this.name = name;
//         this.m1 = m1;
//         this.m2 = m2;
//         this.m3 = m3;
//     }

//     public int getM1() { return m1; }
//     public int getM2() { return m2; }
//     public int getM3() { return m3; }
//     public String getName() { return name; }

//     @Override
//     public String toString() {
//         return "Student Name: " + name +
//                "\nMarks: " + m1 + ", " + m2 + ", " + m3;
//     }
// }

// question7
// import com.bank.util.InterestCalculator;
// import static java.lang.Math.*;   // using pow() directly

// public class pakage {
//     public static void main(String[] args) {

//         InterestCalculator ic = new InterestCalculator();

//         double p = 10000;   // Principal
//         double r = 5;       // Rate
//         double t = 2;       // Time

//         // Simple Interest
//         double si = ic.calculateSimpleInterest(p, r, t);

//         // Compound Interest using static import pow()
//         double ci = p * (pow((1 + r / 100), t)) - p;

//         System.out.println("Principal: " + p);
//         System.out.println("Rate: " + r + "%");
//         System.out.println("Time: " + t + " years");
//         System.out.println("----------------------------");
//         System.out.println("Simple Interest: " + si);
//         System.out.println("Compound Interest: " + ci);
//     }
// }







    

