/* Create a class Person with the following attributes:
-	lastname : String
-	firstname: String
-	gender: char
-  birthdate: Birthdate
Create the appropriate constructors, setters and getters
Create 3 objects of the Person class*/
//Felix Albores 
import java.time.LocalDate;
import java.time.Period;
public class Person{
    String lastName;
    String firstName;
    char gender;
    LocalDate  birthDate;

    public Person(String lastName, String firstName, char gender,int year,int month,int day){
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        birthDate = LocalDate.of(year,month,day);
    }
    
    //setters
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setGender(char gender){this.gender = gender;}
    public void setBirthDate(int year,int month,int day){birthDate = LocalDate.of(year,month,day);}
    
    //getters
    public String getLastName(){return lastName;}
    public String getFirstName(){return firstName;}
    public char getGender(){return gender;}
    public LocalDate getBirthDate(){return birthDate;}    

    public int getAge(){
        LocalDate today = LocalDate.now();
        int age = Period.between(birthDate,today).getYears();
        return age;
    }
    
    public String getZodiac(){
        
        byte month = (byte)birthDate.getMonthValue();
        byte day = (byte)birthDate.getDayOfMonth();
        
        if(month== 1 && day>=20 || month == 2 && day<=18)
            return "Aquarius";
        else if(month== 2 && day>=19 || month == 3 && day<=20)
            return "Pisces";
        else if(month == 3 && day>=21 || month == 4 && day<=19)
            return "Aries";
        else if(month == 4 && day>=20 || month == 5 && day<=20)
            return "Taurus";
        else if(month == 5 && day>=21 || month== 6 && day<=21)
            return "Gemini";
        else if(month == 6 && day>=22 || month== 7 && day<=22)
            return "Cancer";
        else if(month == 7 && day>=23 || month == 8 && day<=22)
            return "Leo";
        else if(month == 8 && day>=23 || month == 9 && day<=22)
            return "Virgo";
        else if(month == 9 && day>=23 || month  == 10 && day<=23)
            return "Libra";
        else if(month == 10  && day>=24 || month  == 11 && day<=21)
            return "Scorpio";
        else if(month == 11  && day>=22 || month  == 12 && day<=21)
            return "Sagittarius";
        else
            return "Capricorn";
    }
    public void displayInformation(){
      System.out.println("\n------------Person Information-------------"
                        +"\n\nLastName: " + getLastName()
                        +"\nFirstName: " + getFirstName()
                        +"\nBirtDate: " + birthDate
                        +"\nZodiac Sign: " + getZodiac());
    }
    public static void main(String args[]){
                                                   //yyyy//mm/dd
        Person p1 = new Person("Albores","Felix",'M',2000,1,20);
        p1.displayInformation();
         
        Person p2 = new Person("Ackerman","Mikasa",'F',1998,2,23);
        p2.displayInformation();
        
        Person p3 = new Person("Yeager","Eren",'M',2004,11,1);        
         p3.displayInformation();
    }
}