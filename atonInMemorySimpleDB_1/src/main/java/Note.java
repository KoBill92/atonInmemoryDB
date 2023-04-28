import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Note {
    private final long account;
    private String name;
    private double value;

    @Override
    public String toString() {
        return "{" +
                "\n account : " + account +
                ",\n name : '" + name + '\'' +
                ",\n value : " + value +
                "\n}";

    }
}
