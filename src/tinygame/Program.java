package tinygame;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        GameFrame game = new GameFrame();
        Tile grass = new Tile("grass");

        ArrayList<Tile> levelTiles = new ArrayList<>(36);
        for (int i = 0; i < 36; i++) {
            levelTiles.add(grass);
        }

        Level main = new Level(6, 6, levelTiles, "main");
        game.setActiveLevel(main);

        // TODO Manage game loop
    }
}
