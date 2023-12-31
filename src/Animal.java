// Файл Animal.java
import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean hasTail;

    public Animal(String name, int age, boolean hasTail) {
        this.name = name;
        this.age = age;
        this.hasTail = hasTail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                hasTail == animal.hasTail &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hasTail);
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + ", вік: " + age + ", хвіст: " + (hasTail ? "так" : "ні");
    }
}
