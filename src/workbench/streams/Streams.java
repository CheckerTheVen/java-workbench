package workbench.streams;

import workbench.Cat;

import java.time.LocalDate;
import java.util.*;

public class Streams {
    public static void doStreams() {
        List<Cat> basket = new LinkedList<>();

        basket.add(new Cat("Whiskers", Cat.Breed.NORWEGIAN_FOREST, LocalDate.of(2013, 11, 6)));
        basket.add(new Cat("Spunky", Cat.Breed.AMERICAN_SHORTHAIR, LocalDate.of(2020, 5, 25)));
        basket.add(new Cat("Rosie", Cat.Breed.AMERICAN_SHORTHAIR, LocalDate.of(2016, 1, 1)));
        basket.add(new Cat("Pawzee", Cat.Breed.SIAMESE, LocalDate.of(2018, 10, 30)));
        basket.add(new Cat("Beaudreux", Cat.Breed.BRITISH_SHORTHAIR, LocalDate.of(2022, 1, 5)));
        basket.add(new Cat("Snowball", Cat.Breed.NORWEGIAN_FOREST, LocalDate.of(2010, 12, 29)));
        basket.add(new Cat("Willow", Cat.Breed.MAINE_COON, LocalDate.of(2011, 2, 18)));
        basket.add(new Cat("Gracie", Cat.Breed.MAINE_COON, LocalDate.of(2017, 10, 1)));
        basket.add(new Cat("Oreo", Cat.Breed.NORWEGIAN_FOREST, LocalDate.of(2014, 12, 16)));
        basket.add(new Cat("Fluffball", Cat.Breed.PERSIAN, LocalDate.of(2019, 7, 30)));
        basket.add(new Cat("Noodle", Cat.Breed.BRITISH_SHORTHAIR, LocalDate.of(2019, 3, 6)));

        // Returns a list of cats that are older than 8 years.
        var oldBois = basket.stream()
                .filter((c) -> c.getAge() > 8)
                .toList();

        // Returns a list of cats that are shorthaired.
        var shorthairedBois = basket.stream()
                .filter((c) -> c.getBreed() == Cat.Breed.AMERICAN_SHORTHAIR || c.getBreed() == Cat.Breed.BRITISH_SHORTHAIR)
                .toList();

        // Returns the average age.
        var averageAge = basket.stream()
                .mapToInt(Cat::getAge)
                .average()
                .orElse(0.0);

        // Returns a list of every breed that exists.
        var existingBreeds = basket.stream()
                .map((c) -> Cat.getBreedName(c.getBreed()))
                .distinct()
                .toList();
    }
}
