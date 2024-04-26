package tinygame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Manages the display and the user interaction.
 */
public class GameFrame extends JFrame implements KeyListener {
    private static final String TITLE = "tinygame";
    private static final int CONTENT_WIDTH = 1024;
    private static final int CONTENT_HEIGHT = 600;

    private final LevelLayer level;

    /**
     * Displays a newly created {@link JFrame} with its designated,
     * transparent layers for rendering the game's components.
     */
    public GameFrame() {
        super(TITLE);

        this.setVisible(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setBackground(Color.BLACK);
        this.setResizable(false);

        LevelLayer levelLayer = new LevelLayer();
        levelLayer.setPreferredSize(new Dimension(CONTENT_WIDTH, CONTENT_HEIGHT));
        levelLayer.setDoubleBuffered(true);
        levelLayer.setVisible(true);
        levelLayer.setOpaque(true);

        JPanel entityLayer = new JPanel();
        entityLayer.setPreferredSize(new Dimension(CONTENT_WIDTH, CONTENT_HEIGHT));
        entityLayer.setDoubleBuffered(true);
        entityLayer.setVisible(true);
        entityLayer.setOpaque(true);

        // TODO Implement decoration layer

        // TODO Implement user interface layer

        this.add(levelLayer);
        this.pack();

        this.add(entityLayer);
        this.pack();

        this.addKeyListener(this);

        this.setVisible(true);

        this.level = levelLayer;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) this.dispose();
        // TODO Implement cases for further inputs
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    public void setActiveLevel(final Level level) {
        this.level.activeLevel = level;
        this.level.repaint();
    }

    private static class LevelLayer extends JPanel {
        public Level activeLevel;

        @Override
        protected void paintComponent(Graphics g) {
            if (activeLevel == null) return;
            g.drawImage(activeLevel.level, 0, 0, null);
        }
    }
}
