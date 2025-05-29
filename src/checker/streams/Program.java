package checker.streams;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 * This program serves as an example for how Java `streams` can be used.
 */
public class Program {
    public static void main(String[] args) {
        final List<Cat> cats = getCats();

        List<String> texts = cats.stream()
                .takeWhile(cat -> cat.gender() != Gender.UNOBSERVED)
                .map(cat -> String.format("%s (%s) was born at %s.",
                        cat.name(),
                        cat.gender().name(),
                        cat.birth().toString()))
                .toList();

        for (String text : texts)
            System.out.println(text);

    }

    /**
     * Creates a list of {@link Cat} objects and returns it.
     */
    private static LinkedList<Cat> getCats() {
        LinkedList<Cat> cats = new LinkedList<>();

        cats.add(new Cat("Whiskers", LocalDate.of(2010, 3, 8), 3.5, Gender.MALE));
        cats.add(new Cat("Pawsie", LocalDate.of(2018, 11, 28), 4.1, Gender.MALE));
        cats.add(new Cat("Henning", LocalDate.of(2017, 6, 13), 3.3, Gender.MALE));
        cats.add(new Cat("Schrödinger", LocalDate.of(1935, 5, 10), 3.9, Gender.UNOBSERVED));
        cats.add(new Cat("Moneypenny", LocalDate.of(2020, 1, 30), 3.7, Gender.FEMALE));
        cats.add(new Cat("Fluffy", LocalDate.of(2016, 12, 6), 2.9, Gender.FEMALE));

        return cats;
    }
}
