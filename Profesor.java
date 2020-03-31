import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/**
 * Profesor
 */
public class Profesor extends Person{
    
    private int id;
    private static final AtomicInteger count = new AtomicInteger(); 
    private Training training;
    private List<Language> languages;

    public Profesor (String name, String lastName){
        super(name, lastName);
        this.id = count.getAndIncrement();
        this.languages = new ArrayList<>();
    }

    public void setTraining(Training training) {
        this.training = training;
    }
    
    public int getId() {
        return id;
    }
    
    public Training getTraining() {
        return training;
    }
    
    public List<Language> getLanguages() {
        return languages;
    }

    public void langAlloc(Language language) {
        languages.add(language);
    }

    

    
}