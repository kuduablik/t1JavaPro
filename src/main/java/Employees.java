import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@AllArgsConstructor
@ToString
@Data
public class Employees {

    private String name;
    private int age;
    private String jobTitle;

}
