import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Program {
    public static class Cat {
        public String name;
        public int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>(6);
        cats.add(new Cat("Noodle", 4));
        cats.add(new Cat("Nathaly", 2));
        cats.add(new Cat("Whiskers", 11));
        cats.add(new Cat("Pom-Pom", 7));
        cats.add(new Cat("Pawbs", 3));
        cats.add(new Cat("Bubbles", 2));

        var olderBoys = cats.stream().filter((c) -> c.age >= 4).toList();
        for (Cat cat : olderBoys) {
            System.out.println(cat.name);
        }

        var squares = IntStream.range(1, 101).map((i) -> i * i).toArray();
        for (int i : squares) {
            System.out.println(i);
        }
        System.out.println(Arrays.stream(squares).sum());
    }
}