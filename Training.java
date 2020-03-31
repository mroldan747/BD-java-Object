import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Training {

    private int id;
    private static final AtomicInteger count = new AtomicInteger();

    // private School school;
    private String name;
    private Instructor instructor;
    private List<Student> students;
    private List<Language> languages;

    public Training(String name, Instructor instructor) {
        this.id = count.getAndIncrement();
        this.name = name;
        // this.school = school;
        this.instructor = instructor;
        this.students = new ArrayList<>();
        this.languages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Language> getLanguages() {
        return languages;
    }

<<<<<<< HEAD
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
=======
    public void addStudent(Student student) {
>>>>>>> 9e5444f6aa0f53eb3d2c92c17e29a9a1291f46d3
        this.students.add(student);
    }

    public void langAlloc(Language language) {
        languages.add(language);
    }

    public Set<Quest> currentQuest() {
        Set<Quest> quests = new HashSet<>();
        for (Student student : students) {
            quests.addAll(student.getQuests());
        }
        return quests;
    }

    public Boolean isGoodTraining() {
        for (Language language : this.languages) {
            for (Language lang : instructor.getLanguages()) {
                if (language.getName().equals(lang.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

}