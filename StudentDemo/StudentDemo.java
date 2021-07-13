/*
Create an abstract Student class for Parker University. The class contains fields 
for student ID number, last name, and annual tuition. Include a constructor 
that requires parameters for the ID number and name. Include get and set 
methods for each field; the setTuition() method is abstract. Create three 
Student subclasses named UndergraduateStudent, GraduateStudent, and 
StudentAtLarge, each with a unique setTuition() method. Tuition for an 
UndergraduateStudent is $4,000 per semester, tuition for a GraduateStudent
is $6,000 per semester, and tuition for a StudentAtLarge is $2,000 per 
semester. Write an application that creates an array of at least six objects to 
demonstrate how the methods work for objects for each Student type. Save the 
files as Student.java, UndergraduateStudent.java, GraduateStudent.java, 
StudentAtLarge.java, and StudentDemo.java

*/

public class StudentDemo{
    public static void main(String[] args){

        Student[] student = {
                new Undergraduate("19914795","Albores"),
                new GraduateStudent("1998231","Lebron"),
                new StudentAtLarge("18281821","AckerMan"),
                new Undergraduate("1991212","Zaito"),
                new GraduateStudent("172871","Levi"),
                new StudentAtLarge("1298912","Smith")};

        System.out.println(student[5].getLastName());
    }
}