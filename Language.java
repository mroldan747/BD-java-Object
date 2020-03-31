import java.util.concurrent.atomic.AtomicInteger;

public class Language {

    private int id;
    private static final AtomicInteger count = new AtomicInteger();
    private String name;

    public Language(String name) {
        this.name = name;
        this.id = count.getAndIncrement();
    }

    public String getName() {
        return name;
    }

}