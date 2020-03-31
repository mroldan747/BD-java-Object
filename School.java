import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class School {
    private int id;
    private static final AtomicInteger count = new AtomicInteger();
    private String name;
    private String address;
    private List<Training> trainings;

    public School(String name, String address) {
        this.address = address;
        this.id = count.getAndIncrement();
        this.name = name;
        this.trainings = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Training> getTrainings() {
        return this.trainings;
    }

    public List<String> allTraining() {
        List<String> name = new ArrayList<>();
        for (Training training : trainings) {
            name.add(training.getName());
        }
        return name;
    }

    public void addTraining(Training training) {
        this.trainings.add(training);
    }

}