package tinygame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameFrame extends JFrame implements KeyListener {
    private static final String TITLE = "tinygame";
    private static final int CONTENT_WIDTH = 1024;
    private static final int CONTENT_HEIGHT = 600;

    public final Graphics2D levelGraphics;
    public final Graphics2D entityGraphics;

    public GameFrame() {
        super(TITLE);

        this.setVisible(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setBackground(Color.BLACK);
        this.setResizable(false);

        JPanel levelLayer = new JPanel();
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

        levelGraphics = (Graphics2D) levelLayer.getGraphics();
        entityGraphics = (Graphics2D) entityLayer.getGraphics();

    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                this.dispose();
                break;

            // TODO Implement cases for further inputs
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
