import java.time.Year;
import java.util.Date;
public abstract class Person {

    String firstName;
    String lastName;
    int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear ){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthdayYear=birthdayYear;
    }

    public int getAge() {
        return Year.now().getValue() - birthdayYear;
    }
}
