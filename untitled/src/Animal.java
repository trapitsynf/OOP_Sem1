import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;

    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return birthDate;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }

    private void wakeUp() {
        System.out.println(name + " is wakeup");
    }

    private void wakeUp(int time) {
        System.out.println(name + "is wakeup in " + time);
    }

    private void eat() {
        System.out.println(name + " eat");
    }

    private void play() {
        System.out.println(name + " played");
    }

    private void sleep() {
        System.out.println(name + " sleeping");
    }

    protected void toGo() {
        System.out.println(name + " is walking");
    }

    protected void fly() {
        System.out.println(name + " fly");
    }

    protected void swim() {
        System.out.println(name + " is swimming");
    }

    public void lifeCycle() {
        wakeUp();
        eat();
        toGo();
        fly();
        swim();
        play();
        sleep();
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Birthdate: " + birthDate +
                ", Vaccinations: " + vaccinations +
                ", Illness: " + illness +
                ", Owner: " + owner;
    }
}
