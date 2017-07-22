package World;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LevelBuilder {

    int tileSize;
    int[][] tileMap;
    int mapWidth;
    int mapHeight;

    public LevelBuilder(String levelName) {
        System.out.println("Building: ./res/levels/" + levelName + ".txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("./res/levels/" + levelName + ".txt"));
            
            mapWidth = Integer.parseInt(br.readLine());
            mapHeight = Integer.parseInt(br.readLine());
            tileMap = new int[mapHeight][mapWidth];
            
            String delimiter = " ";
            
            for (int row = 0; row < mapHeight; row++) {
                String line = br.readLine();
                String[] tokens = line.split(delimiter);
                for (int col = 0; col < mapWidth; col++) {
                    tileMap[row][col]= Integer.parseInt(tokens[col]);
                }
            }
            System.out.println("\n");
            System.out.println("Loaded: ./res/levels/" + levelName + ".txt");
        } catch (IOException e) {
            Logger.getLogger(LevelBuilder.class.getName()).log(Level.SEVERE, null, e);
            System.out.print("Could not read file:" + levelName);
        }
    }
}
