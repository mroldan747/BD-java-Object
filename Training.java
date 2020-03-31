import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Training {

    private int id;
    private static final AtomicInteger count = new AtomicInteger(); 
    
    //private School school;
    private String name;
    private Profesor profesor;
    private List<Student> students;
    private List<Language> languages; 

    public Training (String name, Profesor profesor) {
        this.id = count.getAndIncrement();
        this.name = name;
        //this.school = school;
        this.profesor = profesor;
        this.students = new ArrayList<>();
        this.languages = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    
    public void addStudent(Student student){
        this.students.add(student);
    }

    public void langAlloc(Language language) {
        languages.add(language);
    }
    
    public Set<Quest> currentQuest() {
        Set<Quest> quests = new HashSet<>();
        for (Student student : students){
            for (Quest quest: student.getQuests()){
                quests.add(quest);
            }
            
        }
        return quests;
    }

    public Boolean isGoodTraining() {
        for (Language language : this.languages) {
            for (Language lang : profesor.getLanguages()){
                if (language.getName().equals(lang.getName())) {
                    return true;
                }
            }
        }
        return false; 
    }

    
}