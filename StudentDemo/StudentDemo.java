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