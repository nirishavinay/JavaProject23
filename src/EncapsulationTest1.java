package src;

public class EncapsulationTest1 {
    private  String student_Name;
    private int  student_Id;
    private double student_Salary;
    private String student_Designation;

    public static void main(String[] args) {

        EncapsulationTest1 encapsulationTest = new  EncapsulationTest1();
        encapsulationTest.setStudent_Name("Akshara09");
        encapsulationTest.setStudent_Id(9090909);
        encapsulationTest.setStudent_Salary(250000);
        encapsulationTest.setStudent_Designation("Technical Analyst");
        System.out.println("Stusent_Name: " +encapsulationTest.getStudent_Name());
        System.out.println("Student_Id: " +encapsulationTest.getStudent_Id());
        System.out.println("Student_Salary: " +encapsulationTest.getStudent_Salary());
        System.out.println("Student_Designation: " +encapsulationTest.getStudent_Designation());
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public double getStudent_Salary() {
        return student_Salary;
    }

    public void setStudent_Salary(double student_Salary) {
        this.student_Salary = student_Salary;
    }

    public String getStudent_Designation() {
        return student_Designation;
    }

    public void setStudent_Designation(String student_Designation) {
        this.student_Designation = student_Designation;
    }
}
