package Exercise5;

public class Person {
    private String name;
    private String id;
    private String contact;

    public Person(String name, String id, String contact) {
        this.name = name;
        this.id = id;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
