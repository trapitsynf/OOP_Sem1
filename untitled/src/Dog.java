import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal{
    @Override
    public void fly() {
    }

    public Dog(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);

    }
}
