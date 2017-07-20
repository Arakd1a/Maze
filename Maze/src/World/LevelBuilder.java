
package World;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LevelBuilder {
    
    public LevelBuilder(String s) {
        BufferedReader br = null; 
        try {	
            br = new BufferedReader(new FileReader(s));
           
            String numRows = br.readLine();
            String numcols = br.readLine();
            
            
        } catch (IOException e) {
            Logger.getLogger(LevelBuilder.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("Could not read file:" + s);
        }
    }
    
}
