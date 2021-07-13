public abstract class Student{

    private String idNumber;
    private String lastName;
    protected double tuition;

    public Student(String idNumber, String lastName){
        setIdNumber(idNumber);
        setLastName(lastName);
    }

    public void setIdNumber(String idNumber){this.idNumber = idNumber;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public abstract void setTuition();

    public String getIdNumber(){return idNumber;}
    public String getLastName(){return lastName;}
    public double getTuition(){return tuition;}

}