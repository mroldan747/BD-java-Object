public abstract class Person {

    private String firstName;
    private String lastName;

    public Person(String name, String lastName) {
        this.firstName = name;
        this.lastName = lastName;
    }

    // GETTERS
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    // SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}