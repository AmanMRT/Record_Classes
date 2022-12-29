class Person {

    private int id;
    private String name;

    public Person(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class PersonClass {

    public static void main(String[] args) {
        
        Person p1 = new Person(1, "Msft");
        Person p2 = new Person(2, "Msft");

        //  System.out.println(p1.getName());
        //  System.out.println(p1.getId());
        System.out.println(p1);
        System.out.println(p2);

        // System.out.println(true);
        
    }
}