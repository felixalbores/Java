public class StudentAtLarge extends Student{

    public StudentAtLarge(String idNumber,String lastName){
        super(idNumber,lastName);
        setTuition();
    }

    @Override
    public void setTuition(){
        tuition = 2_000;
    }
}