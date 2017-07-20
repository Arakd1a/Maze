package World;

import Things.Wall;
import java.util.ArrayList;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Level {

    ArrayList<Wall> walls;

    public Level() throws SlickException {
        walls = new ArrayList();
        for (int i = 0; i < 300; i++) {
            walls.add(new Wall(i, i));
        }
    }

    public void render(Graphics g) throws SlickException {
          for (int i = 0; i < walls.size(); i++) {
          walls.get(i).render(g);
        }
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

    }



}
