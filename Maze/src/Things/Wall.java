package Things;


import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public class Wall {


    private float x, y;
    public static final float WIDTH = 20, HEIGHT = 20;
    public static final Color COLOR = new Color(Color.white);

    public Wall(int x, int y) throws SlickException {
        this.x = x;
        this.y = y;
    }

    public void render(Graphics g) throws SlickException {
        g.setColor(COLOR);
        g.fillRect(x, y, WIDTH, HEIGHT);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
    
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, (int) WIDTH, (int) HEIGHT);
    }
    
      public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWIDTH() {
        return WIDTH;
    }

    public float getHEIGHT() {
        return HEIGHT;
    }

    public Color getCOLOR() {
        return COLOR;
    }


}

