
import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SubiBasics {
    
    public static void delay(){
        
        try {Thread.sleep(30);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    public static void delay(int x)
    {
        try {Thread.sleep(x);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    public static void saveScreen(Rectangle rect)
    {
        java.awt.Robot a;
        try {
            a = new java.awt.Robot();
            Image image = a.createScreenCapture(rect);
            try {
                ImageIO.write((RenderedImage) image, "png", new File("fileName.png"));
            } catch (IOException ex) {
                Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (AWTException ex) {
            Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
