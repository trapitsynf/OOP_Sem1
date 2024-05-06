import java.time.LocalDate;
import java.util.List;



public class Snake extends Animal{

    @Override
    public void fly() {
    }

    @Override
    public void toGo() {
    }

    public Snake(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }
}
