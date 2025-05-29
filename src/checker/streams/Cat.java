package checker.streams;

import java.time.LocalDate;

/**
 * Saves most important data to a cat.
 * @param name the name of the cat
 * @param birth the date of birth of the cat
 * @param weight the weight of the cat
 * @param gender the sex of the cat
 */
public record Cat(String name, LocalDate birth, double weight, Gender gender) { }

