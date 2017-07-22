package States;


import Things.*;
import World.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {
    LevelBuilder levelBuilder;
    Level level;
    Player player;
 

    public Play(int State) {
        

    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        level = new Level("level1");
       

    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        level.render(g);
     
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        level.update(gc, sbg, delta);
        

    }

    public int getID() {
        return 1;
    }
}
