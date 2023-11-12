// Файл Main.java
public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Васька", 3, true);
        Animal dog = new Animal("Шарік", 5, true);

        System.out.println("Кіт: " + cat);
        System.out.println("Собака: " + dog);

        System.out.println("Чи однакові коти? " + cat.equals(dog));
    }
}
