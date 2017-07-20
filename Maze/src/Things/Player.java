package Things;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public class Player {

    private float x, y;
    private float vel = 0.55f;
    private final float WIDTH = 5, HEIGHT = 5;
    private final Color COLOR = new Color(Color.yellow);

    public Player() throws SlickException {
    }

    public void render(Graphics g) throws SlickException {
        g.setColor(COLOR);
        g.fillRect(x, y, WIDTH, HEIGHT);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        if (gc.getInput().isKeyDown(Input.KEY_W)) {
            y -= vel;
        }
        if (gc.getInput().isKeyDown(Input.KEY_S)) {
            y += vel;
        }
        if (gc.getInput().isKeyDown(Input.KEY_D)) {
            x += vel;
        }
        if (gc.getInput().isKeyDown(Input.KEY_A)) {
            x -= vel;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, (int) WIDTH, (int) HEIGHT);
    }

}
