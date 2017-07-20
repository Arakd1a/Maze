package World;

import Game.Game;
import Things.Wall;
import java.util.ArrayList;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Level {

    ArrayList<Wall> walls;
    int rowCount = (int) (Game.WIDTH / Wall.WIDTH);
    int colCount = (int) (Game.HEIGHT / Wall.HEIGHT);

    public Level() throws SlickException {
        walls = new ArrayList();

        //Top + Bottom
        for (int i = 0; i < rowCount * Wall.WIDTH; i += (int) Wall.WIDTH) {
            walls.add(new Wall(i, 0));
            walls.add(new Wall(i, (int) (Game.HEIGHT - Wall.HEIGHT)));
        }
        //Left + Right
        for (int i = 0; i < colCount * Wall.HEIGHT; i += (int) Wall.HEIGHT) {
            walls.add(new Wall(0, i));
        }
        for (int i = 0; i < colCount * Wall.HEIGHT; i += (int) Wall.HEIGHT) {
            walls.add(new Wall((int) (Game.WIDTH - Wall.WIDTH), i));
        }
    }

    public void render(Graphics g) throws SlickException {
        for (int i = 0; i < walls.size(); i++) {
            walls.get(i).render(g);
        }
        g.drawRect(rowCount, rowCount, rowCount, rowCount);

    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
//        System.out.println("Row count: " + rowCount);
//        System.out.println("Col count: " + colCount);
        System.out.println("Walls size: " + walls.size());
    }

    public void createEdge() throws SlickException {

        walls.add(new Wall(100, 100));

    }

}
