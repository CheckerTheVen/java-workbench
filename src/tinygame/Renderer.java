package tinygame;

import java.awt.*;

public class Renderer {
    public Renderer() {}

    public void render(final Level level, final Graphics2D graphics) {
        graphics.drawImage(level.level, 0, 0, null);
    }
}
