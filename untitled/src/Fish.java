import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal{
    @Override
    public void toGo() {
    }

    @Override
    public void fly() {
    }

    public Fish(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);


    }
}
