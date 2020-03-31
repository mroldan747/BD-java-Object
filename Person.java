public abstract class Person {
    
    private String name;
    private String lastName;

    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    // GETTERS 
    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}