public class Undergraduate extends Student{

    public Undergraduate(String idNumber,String lastName){
        super(idNumber,lastName);
        setTuition();
    }


    @Override
    public void setTuition(){
        tuition = 4_000;
    }
}