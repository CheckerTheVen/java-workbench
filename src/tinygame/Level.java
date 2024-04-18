package tinygame;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class Level {
    private static final String LEVEL_PATH = "res/level";

    public final String name;
    public final BufferedImage level;

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
                        tiles.get(index).getTile(),
                        row * Tile.SIZE,
                        col * Tile.SIZE,
                        null
                );
            }
        }
    }
}
