public class Cat {
	public static final String SOUND = "Meow";

	public final String name;

	public Cat() {
		this("Whiskers");
	}

	public Cat(String name) {
		this.name = name;
	}

	public void meow() {
		System.out.println(SOUND + "!");
	}
}
