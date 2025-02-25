package src;

import java.util.Scanner;
class Staff1 {
    protected String name;
    protected int experience;
    protected String job_Role;
    protected int phoneNo;

    public Staff1(String name, int experience, String jobRole, int phoneNo) { // parameterised constructor
        this.name = name;
        this.experience = experience;
        this.job_Role = jobRole;
        this.phoneNo = phoneNo;
    }

    public Staff1() { } //default constructor

    public void staffInfo() {
        System.out.println("Staff Details:");
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Job Role: " + job_Role);
        System.out.println("Phone Number: " + phoneNo);
    }
}

class Teacher extends Staff1 {
    protected String qualification;
    protected String subject;
    protected String assignedClass;
    protected int noOfLeaves;
    protected int noOfAttendance;
    protected double salary;
    protected double tax;
    protected String paySlipNo;

    public Teacher(String name, int experience, String jobRole, int phoneNo, String qualification, String subject, String assignedClass,
                   int noOfLeaves, int noOfAttendance, double salary, double tax, String paySlipNo) { //parameterised constructor
        super(name, experience, jobRole, phoneNo);
        this.qualification = qualification;
        this.subject = subject;
        this.assignedClass = assignedClass;
        this.noOfLeaves = noOfLeaves;
        this.noOfAttendance = noOfAttendance;
        this.salary = salary;
        this.tax = tax;
        this.paySlipNo = paySlipNo;
    }

    public void teacherProfile() {
        System.out.println("Teacher Profile:");
        System.out.println("Qualification: " + qualification);
        System.out.println("Subject: " + subject);
        System.out.println("Assigned Class: " + assignedClass);
    }

    public void teacherAttendanceLeave() {
        System.out.println("Teacher Attendance/Leave:");
        System.out.println("Number of Leaves: " + noOfLeaves);
        System.out.println("Number of Attendance: " + noOfAttendance);
    }

    public void teacherPayRole() {
        System.out.println("Teacher Pay-roll:");
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + tax);
        System.out.println("Pay-slip No: " + paySlipNo);
    }
}

public class TeacherStaff1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of staff: ");
        int no_of_staff = scanner.nextInt();
        scanner.nextLine();  // For newline

        for (int i = 1; i <= no_of_staff; i++) {
            System.out.println("\nEnter details for staff " + i);  // entering staff input
            System.out.print("Enter staff Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Experience in years: ");
            int experience = scanner.nextInt();
            scanner.nextLine();  // for newline

            System.out.print("Enter Job Role: ");
            String jobRole = scanner.nextLine();

            System.out.print("Enter Phone Number: ");
            int phoneNo = scanner.nextInt();
            scanner.nextLine();  // for newline

            // Create Staff1 object

            Staff1 staff = new Staff1(name, experience, jobRole, phoneNo);

            System.out.print("Enter number of teachers: ");
            int no_of_teachers = scanner.nextInt();
            scanner.nextLine();  // for newline

            for (int j = 1; j <= no_of_teachers; j++) {
                System.out.println("\nEnter Teacher " + j + " details:");  // entering teacher input
                System.out.print("Enter Teacher Name: ");
                String teacherName = scanner.nextLine();

                System.out.print("Enter Qualification: ");
                String qualification = scanner.nextLine();

                System.out.print("Enter Subject: ");
                String subject = scanner.nextLine();

                System.out.print("Enter Assigned Class: ");
                String assignedClass = scanner.nextLine();

                System.out.print("Enter Number of Leaves: ");
                int noOfLeaves = scanner.nextInt();

                System.out.print("Enter Number of Attendance: ");
                int noOfAttendance = scanner.nextInt();

                System.out.print("Enter Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();  // Consume newline

                System.out.print("Enter Tax: ");
                double tax = scanner.nextDouble();
                scanner.nextLine();  // Consume newline

                System.out.print("Enter Pay-slip No: ");
                String paySlipNo = scanner.nextLine();

                // Create Teacher object using Staff1 details and Teacher-specific details
                Teacher teacher = new Teacher(staff.name, staff.experience, staff.job_Role, staff.phoneNo, qualification, subject, assignedClass,
                        noOfLeaves, noOfAttendance, salary, tax, paySlipNo);

                // Display the staff and teacher details
                staff.staffInfo();
                teacher.teacherProfile();
                teacher.teacherAttendanceLeave();
                teacher.teacherPayRole();
            }
        }

        scanner.close();  // Close the scanner
    }
}
