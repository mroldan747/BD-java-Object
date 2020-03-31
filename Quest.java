import java.util.concurrent.atomic.AtomicInteger;

public class Quest {

    private String title;
    private String description;
    private static final AtomicInteger count = new AtomicInteger();
    private int id;
    private Language language;

    public Quest(String title, String description, Language language) {
        this.title = title;
        this.description = description;
        this.id = count.getAndIncrement();
        this.language = language;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Language getLanguage() {
        return this.language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

}