package workbench;

import java.time.LocalDate;

public class Cat {
    public enum Breed {
        BRITISH_SHORTHAIR,
        MAINE_COON,
        AMERICAN_SHORTHAIR,
        SIAMESE,
        PERSIAN,
        NORWEGIAN_FOREST
    }

    private static final String NOISE = "Meow";

    private String name;
    private final Breed breed;
    private final LocalDate birth;

    public Cat(String name, Breed breed) {
        this(name, breed, LocalDate.now());
    }

    public Cat(String name, Breed breed, LocalDate birth) {
        this.name = name;
        this.breed = breed;
        this.birth = birth;
    }

    public static String getBreedName(Breed breed) {
        return switch(breed) {
            case AMERICAN_SHORTHAIR -> "American Shorthair";
            case BRITISH_SHORTHAIR -> "British Shorthair";
            case MAINE_COON -> "Maine Coon";
            case NORWEGIAN_FOREST -> "Norwegian Forest";
            case SIAMESE -> "Siamese";
            case PERSIAN -> "Persian";
            case null -> "Undefined";
        };
    }

    public String getName() {
        return this.name;
    }

    public void rename(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public Breed getBreed() {
        return this.breed;
    }

    public int getAge() {
        return LocalDate.now().minusYears(birth.getYear()).getYear();
    }

    public void doNoise() {
        System.out.println(NOISE);
    }
}
