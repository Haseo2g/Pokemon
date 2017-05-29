/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author win7
 */
class BackGround {

    public BufferedImage bg;

    public BackGround(BufferedImage bg) {
        this.bg = bg;
    }

}

public class PokemonArea extends JPanel implements KeyListener {

    BackGround area = new BackGround(null);

    public void setBG() {
        Random backGround = new Random();
        int numBG;

        this.setFocusable(true);
        this.requestFocus();
        this.addKeyListener(this);

        numBG = backGround.nextInt(5);
        try {
            switch (numBG) {
                case 0:
                    area.bg = ImageIO.read(ClassLoader.getSystemResourceAsStream("./imagens/bg1.png"));
                    break;
                case 1:
                    area.bg = ImageIO.read(ClassLoader.getSystemResourceAsStream("./imagens/bg2.png"));
                    break;
                case 2:
                    area.bg = ImageIO.read(ClassLoader.getSystemResourceAsStream("./imagens/bg3.jpeg"));
                    break;
                case 3:
                    area.bg = ImageIO.read(ClassLoader.getSystemResourceAsStream("./imagens/bg4.png"));
                    break;
                case 4:
                    area.bg = ImageIO.read(ClassLoader.getSystemResourceAsStream("./imagens/bg5.jpeg"));
                    break;
                case 5:
                    area.bg = ImageIO.read(ClassLoader.getSystemResourceAsStream("./imagens/bg6.png"));
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//Escolhe aleatóriamente um dos 6 BGS.

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
