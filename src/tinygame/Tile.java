package tinygame;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Tile {
    private static final String FILE_PATH = "res/";

    public final String name;
    public final BufferedImage tile;

    public static final int SIZE = 64;

    public Tile(final String name) {
        this.name = name;

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(FILE_PATH + name + ".png"));
        } catch (Exception e) {
            System.out.println("Couldn't read asset.");
        }

        this.tile = img;
    }

    public final BufferedImage getTile() {
        return tile;
    }
}
