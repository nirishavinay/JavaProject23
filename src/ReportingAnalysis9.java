package src;

import java.util.Scanner;

class Student23 {
    String Student_name;
    int Student_classGrade;
    int Student_subjectMarks;

    public Student23(String student_name, int student_classGrade, int student_subjectMarks) {
        this.Student_name = student_name;
        this.Student_classGrade= student_classGrade;
        this.Student_subjectMarks = student_subjectMarks;
    }

    public void student23Report() {
        System.out.println("Student Name: " +Student_name);
        System.out.println(" Student Class Grade: " + Student_classGrade);
        System.out.println(" Student Subject Marks: " + Student_subjectMarks);
    }
}

class Teacher23{
    String Teacher_name;
    String Teacher_subject;
    int Teacher_performance;


    public Teacher23(String Teacher_name, String Teacher_subject, int Teacher_performance) {
        this.Teacher_name = Teacher_name;
        this.Teacher_subject = Teacher_subject;
        this.Teacher_performance= Teacher_performance ;
    }

    public void teacher23Report() {
        System.out.println("Teacher Name: " + Teacher_name);
        System.out.println("Teacher Subject: " + Teacher_subject);
        System.out.println("Teacher Performance : " + Teacher_performance);
    }
}


class SchoolFinanceAnalysis {
    double expenses;
    double revenue;

    public SchoolFinanceAnalysis(double expenses, double revenue) {
        this.expenses = expenses;
        this.revenue = revenue;
    }

    public void analyzingExpenses() {
        System.out.println("Total Expenses: " + expenses);
        if (expenses > 100000) {
            System.out.println("School Expenses are High");
        }
    }

    public void analyzingProfit() {
        double profit = revenue - expenses;
        System.out.println("Profit: " + profit);
        if (profit < 0) {
            System.out.println("School get loss");
        } else {
            System.out.println("Profit is in good standard.");
        }
    }
}

public class ReportingAnalysis9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no.of students: ");
        int num_Students= scanner.nextInt();
        scanner.nextLine();

        for(int i= 0; i<num_Students;i++)
        {
            System.out.println("Enter student's details " + (i+1));

            System.out.println("Enter Student's Name:");
            String studentName = scanner.nextLine();
            System.out.println("Enter Student's Class Grade:");
            int classGrade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Subject Marks for the Student:");
            int subjectMarks = scanner.nextInt();
            scanner.nextLine();

            Student23 student = new Student23(studentName, classGrade, subjectMarks);
            student.student23Report();
        }
        System.out.println("\n Enter no.Of Teachers: ");
        int num_Teachers=scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<num_Teachers;i++) {
            System.out.println(" Enter teacher's  details: " + (i+1));

            System.out.println("\nEnter Teacher's Name:");
            String teacherName = scanner.nextLine();
            System.out.println("Enter Teacher's Subject:");
            String subject = scanner.nextLine();
            System.out.println("Enter Teacher's Performance Rating (1-10):");
            int performanceRating = scanner.nextInt();
            scanner.nextLine();

            Teacher23 teacher = new Teacher23(teacherName, subject, performanceRating);
            teacher.teacher23Report();
        }

        System.out.println("\nEnter School Expenses:");
        double expenses = scanner.nextDouble();
        System.out.println("Enter School Revenue:");
        double revenue = scanner.nextDouble();

        SchoolFinanceAnalysis finance = new SchoolFinanceAnalysis(expenses, revenue);
        finance.analyzingExpenses();
        finance.analyzingProfit();

        scanner.close();
    }
}
