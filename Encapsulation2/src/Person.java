import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter

public class Person {

    public Person(){}

    public String name;
    public String surname;
    public double height;
    public int age;
}
