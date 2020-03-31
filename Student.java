import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int id;
    private static final AtomicInteger count = new AtomicInteger(); 
    //private static int idCounter = 0;
    private  List<Quest> quests;
    private List<Training> trainings;
    
    public Student(String name, String lastName){
        super(name, lastName);
        this.id = count.getAndIncrement();
        //this.id = idCounter++;
        this.quests = new ArrayList<>();
        this.trainings  = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }
    
    public List<Quest> getQuests() {
        return quests;
    }

    public void questAlloc(Quest quest){
        this.quests.add(quest);
    }

    public void trainingAlloc(Training training) {
        this.trainings.add(training);
        training.addStudent(this);
    }
}