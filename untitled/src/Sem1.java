import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sem1 {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(2023, 6, 1), new ArrayList<>(), "Chumka", "Popov", 4);
        Dog jack = new Dog("Jack", LocalDate.of(2023, 6, 1), new ArrayList<>(), "Chumka", "Popov");
        Snake uzhik = new Snake("Uzhik", LocalDate.of(2012,6,6), new ArrayList<>(), "", "Ivanov");
        Fish nemo = new Fish("Nemo", LocalDate.of(2021,1,1), new ArrayList<>(),"","Petrov");
        Eagle zhorik = new Eagle("Zhorik", LocalDate.of(2020,5,4), new ArrayList<>(), "", "Pavlov");

        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(jack);

        System.out.println("________________");
        //barsik.lifeCycle();
        //System.out.println();
        //jack.lifeCycle();
        barsik.lifeCycle();
        System.out.println();
        jack.lifeCycle();
        System.out.println();
        uzhik.lifeCycle();
        System.out.println();
        nemo.lifeCycle();
        System.out.println();
        zhorik.lifeCycle();
    }
}
