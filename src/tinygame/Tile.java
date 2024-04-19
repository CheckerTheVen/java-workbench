package tinygame;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Represents a unit of terrain. Each instance
 * consists of a final texture and name.
 *
 * @author CheckerTheVen
 */
public class Tile {
    /** Defines the file path for the tile textures. */
    private static final String FILE_PATH = "res/";

    /** Describes the name of this instance. */
    public final String name;

    /** Defines the texture of this instance. */
    public final BufferedImage tile;

    /** Defines the size of a {@link Tile} in pixels. */
    public static final int SIZE = 64;

    /**
     * Reads its designated image from the texture resource
     * and instantiates the {@link Tile} with the texture and
     * its name.
     *
     * @param name the name of the {@link Tile} and its texture in the
     *             file system.
     */
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
}
