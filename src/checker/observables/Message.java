package checker.observables;

/**
 * Holds data to a simple text message.
 * @param sender the sender of the message
 * @param message the content of the message
 */
public record Message(String sender, String message) { }
