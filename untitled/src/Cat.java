import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {
    private int legsCount;

    @Override
    public void fly() {
    }

    public Cat(String name, LocalDate date, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, date, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }
}
