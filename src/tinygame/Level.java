package tinygame;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

/**
 * Represents a field of terrain made of a collection
 * of {@link Tile}s.
 */
public class Level {
    /** Defines the file path for the level definition. */
    private static final String LEVEL_PATH = "res/level";

    /** Describes the name of this instance. */
    public final String name;

    /** Defines the visual appearance of this instance. */
    public final BufferedImage level;

    /**
     * Creates a new, final {@link BufferedImage} based on the supplied
     * collection of {@link Tile}s and its supplied width and height.
     *
     * @param x the width of this instance.
     * @param y the height of this instance.
     * @param tiles the collection of tiles used for rendering
     *              this instance's {@link Level#level}.
     * @param name the name of this instance.
     */
    public Level(final int x, final int y, final List<Tile> tiles, String name) {

        // TODO Implement automated process for creating level

        if (tiles.size() != x * y)
            throw new IllegalArgumentException("Count of tiles does not equal size.");

        this.name = name;

        level = new BufferedImage(
                x * Tile.SIZE,
                y * Tile.SIZE,
                BufferedImage.TYPE_INT_RGB
        );

        Graphics2D levelGraphics = level.createGraphics();

        for (int row = 0; row < y; row++) {
            for (int col = 0; col < x; col++) {
                int index = col + row * col;
                levelGraphics.drawImage(
                        tiles.get(index).tile,
                        row * Tile.SIZE,
                        col * Tile.SIZE,
                        null
                );
            }
        }
    }
}
