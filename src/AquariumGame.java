import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class AquariumGame implements Runnable {

    final int WIDTH = 2000;
    final int HEIGHT = 1000;

    public JFrame frame;
    public Canvas canvas;

    public BufferStrategy bufferStrategy;
    public Image dogPic;

    public static void main(String[] args) {
        AquariumGame ex = new AquariumGame();   //creates a new instance of the game
        new Thread(ex).start();                 //creates a threads & starts up the code in the run( ) method
    }

    public AquariumGame () {
        frame = new JFrame("Aquarium Game");
        canvas = new Canvas();

        dogPic = Toolkit.getDefaultToolkit().getImage("dog.png"); //load the picture

    }
        public void run() {
            while (true) {

                moveThings();  //move all the game objects
                render();  // paint the graphics
                pause(20); // sleep for 10 ms  
        }



    }

    private void render() {
    }

    private void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {

        }
    }

    private void moveThings() {
        dog.move();
    }


}


