package checker.observables;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.ReplaySubject;

import java.util.Random;

/**
 * This program serves as an example of how the observable pattern can be used in Java.
 */
public class Program {
    public static void main(String[] args) {
        String[] senders = {"Checker", "Beck", "Gerard"};
        String[] messages = {
                "Hello.",
                "Hello?",
                "How are you?",
                "I don't know what to do.",
                "What the heck??",
                "Ah gosh.",
                "Oh my god!",
                "Nice.",
                "Have you ever tried not doing that?",
                "Damn.",
                "Crazy!",
                "She's going down sloppy style!"
        };
        Random random = new Random();

        ReplaySubject<Message> messenger = ReplaySubject.create();

        Observable<String> reader = messenger
                .hide()
                .map(msg -> String.format("%s said: %s", msg.sender(), msg.message()))
                .doOnNext(System.out::println)
                .doOnComplete(() -> System.out.println("No further message found."))
                .doOnError(System.err::println);


        for (int i = 0; i < 10; i++)
            messenger.onNext(new Message(senders[random.nextInt(senders.length)], messages[random.nextInt(messages.length)]));

        reader.subscribe();

        for (int i = 0; i < 30; i++) {
            messenger.onNext(new Message(senders[random.nextInt(senders.length)], messages[random.nextInt(messages.length)]));
            try {
                Thread.sleep(random.nextInt(500, 2000));
            } catch (InterruptedException ignored) { }
        }

        messenger.onComplete();
    }
}
