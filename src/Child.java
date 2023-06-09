import java.util.Objects;

public class Child extends Parent{

    private String name;


    public Child(String parentName, int age, String name) {
        super(parentName, age);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return Objects.equals(name, child.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
