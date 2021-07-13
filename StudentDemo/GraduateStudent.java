public class GraduateStudent extends Student{


    public GraduateStudent(String idNumber,String lastName){
        super(idNumber,lastName);
        setTuition();
    }

    @Override
    public void setTuition(){
       tuition = 6_000;
    }
}
