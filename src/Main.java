public class Main {
    public static void main(String[] args) {
        Coins coins = new Coins(3, 6);

        int purse = 0;

        for (int current : coins) {
            purse += current;
        }

        System.out.println(purse + "\n");

        for (int current : coins) {
            System.out.println(current);
        }
    }
}

