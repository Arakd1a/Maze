package Game;

import States.*;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {

    public static final String NAME = "Don't Die";
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    public static final boolean GAME_FULLSCREEN = false;
    public static final int MENU_STATE = 0;
    public static final int PLAY_STATE = 1;

    public Game(String GAME_NAME) {
        super(GAME_NAME);
        this.addState(new Menu(MENU_STATE));
        this.addState(new Play(PLAY_STATE));
    }

    public void initStatesList(GameContainer gc) throws SlickException {
        this.getState(MENU_STATE).init(gc, this);
      //this.getState(PLAY_STATE).init(gc, this);
        this.enterState(PLAY_STATE);
        
    }

    public static void main(String[] args) {
        AppGameContainer appgc;
        try {
            appgc = new AppGameContainer(new Game(NAME));
            appgc.setDisplayMode(WIDTH, HEIGHT, GAME_FULLSCREEN);
            appgc.start();
            appgc.setShowFPS(true);
            appgc.setVSync(true);
            appgc.setMouseGrabbed(true);
            appgc.setTargetFrameRate(60);
        } catch (SlickException e) {
            e.printStackTrace();
        }
        
       

    }
    

}
